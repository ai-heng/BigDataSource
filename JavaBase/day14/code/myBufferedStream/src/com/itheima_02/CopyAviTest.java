package com.itheima_02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 把d:\\复制图片.avi复制到当前项目目录下的copy.avi中
 * 
 * 数据源：d:\\复制图片.avi
 * 目的地：copy.avi
 * 
 * 四种方式比较复制效率
 * 基本字节流一次读写一个字节		共耗时：50233毫秒
 * 基本字节流一次读写一个字节数组		共耗时：79毫秒
 * 缓冲字节流一次读写一个字节		共耗时：197毫秒
 * 缓冲字节流一次读写一个字节数组		共耗时：30毫秒
 * 
 * 提示：
 * 复制文件的时间计算可以采用System类的方法实现
 * public static long currentTimeMillis():返回以毫秒为单位的当前时间。
 */
public class CopyAviTest {
	public static void main(String[] args) throws IOException {
		//记录开始时间
		long start = System.currentTimeMillis();
		
//		method1();
//		method2();
//		method3();
		method4();
		
		//记录结束时间
		long end = System.currentTimeMillis();
		System.out.println("共耗时："+(end-start)+"毫秒");
	}
	
	//缓冲字节流一次读写一个字节数组
	private static void method4() throws IOException {
		//封装数据源
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("d:\\复制图片.avi"));
		//封装目的地
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.avi"));
		
		byte[] bys = new byte[1024];
		int len;
		while((len=bis.read(bys))!=-1) {
			bos.write(bys,0,len);
		}
		
		bos.close();
		bis.close();
	}
	
	//缓冲字节流一次读写一个字节
	private static void method3() throws IOException {
		//封装数据源
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("d:\\复制图片.avi"));
		//封装目的地
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.avi"));
		
		int by;
		while((by=bis.read())!=-1) {
			bos.write(by);
		}
		
		bos.close();
		bis.close();
	}
	
	//基本字节流一次读写一个字节数组
	private static void method2() throws IOException {
		//封装数据源
		FileInputStream fis = new FileInputStream("d:\\复制图片.avi");
		//封装目的地
		FileOutputStream fos = new FileOutputStream("copy.avi");
		
		byte[] bys = new byte[1024];
		int len;
		while((len=fis.read(bys))!=-1) {
			fos.write(bys,0,len);
		}
		
		fos.close();
		fis.close();
	}

	//基本字节流一次读写一个字节
	private static void method1() throws IOException {
		//封装数据源
		FileInputStream fis = new FileInputStream("d:\\复制图片.avi");
		//封装目的地
		FileOutputStream fos = new FileOutputStream("copy.avi");
		
		int by;
		while((by=fis.read())!=-1) {
			fos.write(by);
		}
		
		fos.close();
		fis.close();
	}
}
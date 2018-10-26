package com.itheima_01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 字节流读数据：
 * 方式1：一次读取一个字节
 * 方式2：一次读取一个字节数组
 * 
 * public int read(byte[] b):
 * 		从此输入流中将最多 b.length 个字节的数据读入一个 byte 数组中
 * 		返回值是读入缓冲区的字节总数，也就是实际的读取个数
 * 		如果因为已经到达文件末尾而没有更多的数据，则返回 -1。
 */
public class FileInputStreamDemo2 {
	public static void main(String[] args) throws IOException {
		//创建字节输入流对象
		FileInputStream fis = new FileInputStream("b.txt");
		
		/*
		//调用读数据的方法
		//定义一个数组
		byte[] bys = new byte[5];
		
		//第一次读取
		int len = fis.read(bys);
		System.out.println(len);
		//byte[] -- String
		//String(byte[] bytes) 
		//String(byte[] bytes, int offset, int length) 
		System.out.println(new String(bys));
		
		//第二次读取
		len = fis.read(bys);
		System.out.println(len);
		System.out.println(new String(bys));
		
		//第三次读取
		len = fis.read(bys);
		System.out.println(len);
//		System.out.println(new String(bys));
		System.out.println(new String(bys,0,len));
		
		//第四次读取
		len = fis.read(bys);
		System.out.println(len);
		//第五次读取
		len = fis.read(bys);
		System.out.println(len);
		*/
		
		/*
		 * hello\r\n
		 * world\r\n
		 * 
		 * hello
		 * \r\nwor
  		 * ld\r\nr
		 */
		
		/*
		byte[] bys = new byte[5];
		int len = fis.read(bys);
		while(len != -1) {
			System.out.print(new String(bys,0,len));
			len = fis.read(bys);
		}
		*/
		
		//最终版代码
		byte[] bys = new byte[1024]; //1024或者1024的整数倍
		//1G = 1024MB
		//1MB = 1024KB
		//...
		int len;
		while((len=fis.read(bys))!=-1) {
			System.out.print(new String(bys,0,len));
		}
		
		//释放资源
		fis.close();
	}
}

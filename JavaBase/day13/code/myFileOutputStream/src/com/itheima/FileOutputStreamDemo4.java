package com.itheima;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 字节流写数据加入异常处理
 */
public class FileOutputStreamDemo4 {
	public static void main(String[] args) {
//		FileOutputStream fos = new FileOutputStream("d.txt");
//		fos.write("hello".getBytes());
//		fos.close();
		
		//分开做异常处理
//		FileOutputStream fos = null;
//		try {
//			fos = new FileOutputStream("d.txt");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		try {
//			fos.write("hello".getBytes());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		try {
//			fos.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		//放在一起做异常处理
//		try{
//			FileOutputStream fos = new FileOutputStream("d.txt");
//			fos.write("hello".getBytes());
//			fos.close();
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
		//这种方式代码虽然简洁了，但是释放资源的动作可能未执行到
		//try...catch...finally
		FileOutputStream fos = null;
		try{
			//FileOutputStream fos = new FileOutputStream("d.txt");
//			fos = new FileOutputStream("z:\\d.txt");
			fos = new FileOutputStream("d.txt");
			fos.write("hello".getBytes());
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fos!=null) {
				//释放资源
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

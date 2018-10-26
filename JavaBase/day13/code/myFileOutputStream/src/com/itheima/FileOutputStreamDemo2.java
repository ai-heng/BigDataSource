package com.itheima;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 构造方法：
 * FileOutputStream(String name) 
 * FileOutputStream(File file) 
 * 
 * public void write(int b):一次写一个字节
 * public void write(byte[] b):一次写一个字节数组
 * public void write(byte[] b,int off,int len):一次写一个字节数组的一部分
 * 
 * 字节流写数据的步骤：
 * 		A:创建字节输出流对象
 * 		B:调用写数据的方法
 * 		C:释放资源
 */
public class FileOutputStreamDemo2 {
	public static void main(String[] args) throws IOException {
		//创建字节输出流对象
		//FileOutputStream(String name) 
		FileOutputStream fos = new FileOutputStream("b.txt");
		//new File(name)
//		FileOutputStream fos = new FileOutputStream(new File("b.txt"));
		
		//FileOutputStream(File file) 
//		File file = new File("b.txt");
//		FileOutputStream fos = new FileOutputStream(file);
//		FileOutputStream fos = new FileOutputStream(new File("b.txt"));
		
		//public void write(int b):一次写一个字节
//		fos.write(65);
		
		//public void write(byte[] b):一次写一个字节数组
//		byte[] bys = {65,66,67,68,69};
//		fos.write(bys);
		//需求：我如果是一个字符串的数据，能写吗?
		//String -- byte[]
		//String类中有一个方法：public byte[] getBytes()
//		byte[] bys = "ABCDE".getBytes();
//		fos.write(bys);
//		fos.write("ABCDE".getBytes());
		
		//public void write(byte[] b,int off,int len):一次写一个字节数组的一部分
		fos.write("ABCDE".getBytes(),0,3);
		
		//释放资源
		fos.close();
	}
}

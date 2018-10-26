package com.itheima_01;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * 字节流读数据：InputStream
 * 
 * FileInputStream 从文件系统中的某个文件中获得输入字节
 * 
 * 构造方法：
 * 		FileInputStream(String name) 
 * 
 * 字节流读数据的步骤：
 * 		A:创建字节输入流对象
 * 		B:调用读数据的方法
 * 		C:释放资源
 */
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		//创建字节输入流对象
		FileInputStream fis = new FileInputStream("a.txt");
		
		/*
		//调用读数据的方法
		//public int read():读取一个字节的数据,如果已到达文件末尾，则返回 -1。 
		int by = fis.read();
		System.out.println(by);
		System.out.println((char)by);
		
		//再来读取一次
		by = fis.read();
		System.out.println(by);
		System.out.println((char)by);
		
		//发现读数据的代码的重复度很高，想用循环改进
		//但是我们不知道循环的结束条件
		//再来读取两次
		by = fis.read();
		System.out.println(by);
		by = fis.read();
		System.out.println(by);
		*/
		
//		int by = fis.read();
//		while(by != -1) {
//			System.out.print((char)by);
//			by = fis.read();
//		}
		
		//改进版本
		int by;
		//fis.read()
		//by=fis.read()
		//by != -1
		while((by=fis.read())!=-1) {
			System.out.print((char)by);
		}
		
		//释放资源
		fis.close();
	}
}

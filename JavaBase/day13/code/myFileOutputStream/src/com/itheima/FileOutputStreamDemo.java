package com.itheima;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 字节流：
 * 		InputStream		字节输入流
 * 		OutputStream	字节输出流
 * 字符流：
 * 		Reader	字符输入流
 * 		Writer	字符输出流
 * 
 * 字节流写数据
 * OutputStream:此抽象类是表示输出字节流的所有类的超类
 * FileOutputStream:文件输出流是用于将数据写入 File
 * 
 * 构造方法：
 * 		FileOutputStream(String name):创建一个向具有指定名称的文件中写入数据的输出文件流。
 * 
 * 字节流写数据的步骤：
 * 		A:创建字节输出流对象
 * 		B:调用写数据的方法
 * 		C:释放资源
 */
public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		//创建字节输出流对象
		FileOutputStream fos = new FileOutputStream("a.txt");
		/*
		 * 创建字节输出流对象做了这样的三件事情：
		 * A:调用系统功能创建了文件
		 * B:创建字节输出流对象
		 * C:让fos这个对象指向a.txt这个文件
		 */
		
		//write(int b) 
		fos.write(65);
		fos.write(66);
		
		//最后我们还要做一个事情
		//close() 关闭此文件输出流并释放与此流有关的所有系统资源。
		fos.close();
	}
}

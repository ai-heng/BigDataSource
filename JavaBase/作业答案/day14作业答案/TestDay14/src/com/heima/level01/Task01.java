package com.heima.level01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class Task01 {
	/**
	 * 一、 需求说明：以UTF-8编码的格式写出 “你好”到文件中, 并将数据正确的读取出来打印在控制台
	 * 
	 * 1． 创建OutputStreamWriter关联文件, 并在构造方法中指定编码表 
	 * 2． 调用writer方法写出字符串 
	 * 3． 创建InputStreamReader关联文件, 并在构造方法中指定码表进行读取 
	 * 4. 调用read方法读取数据, 打印在控制台
	 * 
	 */
	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		// 1. 创建OutputStreamWriter关联文件, 并在构造方法中指定编码表 
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("level01_Task01.txt"), "UTF-8");
		// 2. 调用writer方法写出字符串 
		osw.write("你好");
		osw.close();
		
		// 3. 创建InputStreamReader关联文件, 并在构造方法中指定码表进行读取 
		InputStreamReader isr = new InputStreamReader(new FileInputStream("level01_Task01.txt"),"UTF-8");
		int b;
		while((b = isr.read()) != -1){
			//4. 调用read方法读取数据, 打印在控制台
			System.out.print((char)b);
		}
		
		isr.close();
		
	}
}

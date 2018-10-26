package com.itheima_03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * InputStreamReader读数据方法
 * public int read():一次读取一个字符
 * public int read(char[] cbuf):一次读取一个字符数组
 */
public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		//创建字符输入流对象
//		InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"));
		InputStreamReader isr = new InputStreamReader(new FileInputStream("OutputStreamWriterDemo.java"));
		
		//public int read():一次读取一个字符
//		int ch;
//		while((ch=isr.read())!=-1) {
//			System.out.print((char)ch);
//		}
		
		//public int read(char[] cbuf):一次读取一个字符数组
		char[] chs = new char[1024];
		int len;
		while((len=isr.read(chs))!=-1) {
			System.out.print(new String(chs,0,len));
		}
		
		//释放资源
		isr.close();
	}
}

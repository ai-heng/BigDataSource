package com.itheima_01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * 字符缓冲区流：
 * BufferedWriter：
 * 将文本写入字符输出流，缓冲各个字符，从而提供单个字符、数组和字符串的高效写入。 
 * 可以指定缓冲区的大小，或者接受默认的大小。在大多数情况下，默认值就足够大了。 
 * 构造方法：
 * 		BufferedWriter(Writer out) 
 * 
 * BufferedReader：
 * 从字符输入流中读取文本，缓冲各个字符，从而实现字符、数组和行的高效读取。 
 * 可以指定缓冲区的大小，或者可使用默认的大小。大多数情况下，默认值就足够大了。 
 * 构造方法：
 * 		BufferedReader(Reader in) 
 */
public class BufferedStreamDemo {
	public static void main(String[] args) throws IOException {
//		//创建字符缓冲输出流对象
//		BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
//		//调用写数据的方法
//		bw.write("hello");
//		//释放资源
//		bw.close();
		
		
		//创建字符缓冲输入流对象
		BufferedReader br = new BufferedReader(new FileReader("BufferedStreamDemo.java"));
		
		//方式1：一次读取一个字符
//		int ch;
//		while((ch=br.read())!=-1) {
//			System.out.print((char)ch);
//		}
		
		//方式2：一次读取一个字符数组
		char[] chs = new char[1024];
		int len;
		while((len=br.read(chs))!=-1) {
			System.out.print(new String(chs,0,len));
		}
		
		//释放资源
		br.close();
	}
}

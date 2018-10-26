package com.itheima_04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 把当前项目目录下的StringDemo.java内容复制到当前项目目录下的Copy.java中
 * 
 * 数据源：
 * 		StringDemo.java---读数据---字符流---InputStreamReader
 * 目的地：
 * 		Copy.java---写数据---字符流---OutputStreamWriter
 */
public class CopyJavaTest {
	public static void main(String[] args) throws IOException {
		//封装数据源
		InputStreamReader isr = new InputStreamReader(new FileInputStream("StringDemo.java"));
		//封装目的地
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("Copy.java"));
	
		//读写数据
		//方式1：一次读写一个字符
//		int ch;
//		while((ch=isr.read())!=-1) {
//			osw.write(ch);
//		}
		
		//方式2：一次读写一个字符数组
		char[] chs = new char[1024];
		int len;
		while((len=isr.read(chs))!=-1) {
			osw.write(chs, 0, len);
		}
		
		//释放资源
		osw.close();
		isr.close();
	}
}

package com.itheima_01;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/*
 * 字节流读数据可能出现问题：
 * 		字节流一次读取一个字节的方式读取带有汉字的文件是有问题的，因为你读取到一个字节后就转为字符在控制台输出了，
 * 		而汉字是由2个字节组成的，所以这里会出问题。
 * 
 * 		文件复制的时候，字节流读取一个字节，写入一个字节，这个没有出现问题，是因为最终底层会根据字节做拼接，
 * 		得到汉字。
 * 
 * 		汉字存储的规则：
 * 			左边的字节数据肯定是负数，右边的字节数据可能是负数，也可能是正数，大部分情况下是负数。		
 */
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		//基本字节流一次读取一个字节
//		FileInputStream fis = new FileInputStream("a.txt");
//		
//		int by;
//		while((by=fis.read())!=-1) {
//			System.out.print((char)by);
//		}
//		
//		fis.close();
		
		//String s = "hello";
		//[104, 101, 108, 108, 111]
		String s = "你好";
		//[-60, -29, -70, -61]
		byte[] bys = s.getBytes();
		System.out.println(Arrays.toString(bys));
	}
}

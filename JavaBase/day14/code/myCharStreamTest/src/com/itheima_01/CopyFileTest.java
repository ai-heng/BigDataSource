package com.itheima_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 需求：5种方式复制文本文件
 * 数据源：
 * 		d:\\林青霞.txt
 * 目的地：
 * 		窗里窗外.txt
 * 
 * 5种方式：
 * 		基本字符流一次读写一个字符
 * 		基本字符流一次读写一个字符数组
 * 		缓冲字符流一次读写一个字符
 * 		缓冲字符流一次读写一个字符数组
 * 		缓冲字符串一次读写一个字符串
 */
public class CopyFileTest {
	public static void main(String[] args) throws IOException {
		method1();
		// method2();
		// method3();
		// method4();
		// method5();
	}
	
	//缓冲字符流一次读写一个字符串
	private static void method5() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("d:\\林青霞.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("窗里窗外.txt"));
		
		String line;
		while((line=br.readLine())!=null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		bw.close();
		br.close();
	}
	
	//缓冲字符流一次读写一个字符数组
	private static void method4() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("d:\\林青霞.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("窗里窗外.txt"));
		
		char[] chs = new char[1024];
		int len;
		while((len=br.read(chs))!=-1) {
			bw.write(chs, 0, len);
		}
		
		bw.close();
		br.close();
	}
	
	//缓冲字符流一次读写一个字符
	private static void method3() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("d:\\林青霞.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("窗里窗外.txt"));
		
		int ch;
		while((ch=br.read())!=-1) {
			bw.write(ch);
		}
		
		bw.close();
		br.close();
	}
	
	// 基本字符流一次读写一个字符数组
	private static void method2() throws IOException {
		FileReader fr = new FileReader("d:\\林青霞.txt");
		FileWriter fw = new FileWriter("窗里窗外.txt");

		char[] chs = new char[1024];
		int len;
		while((len=fr.read(chs))!=-1) {
			fw.write(chs, 0, len);
		}

		fw.close();
		fr.close();
	}

	// 基本字符流一次读写一个字符
	private static void method1() throws IOException {
		FileReader fr = new FileReader("d:\\林青霞.txt");
		FileWriter fw = new FileWriter("窗里窗外.txt");

		int ch;
		while ((ch = fr.read()) != -1) {
			fw.write(ch);
		}

		fw.close();
		fr.close();
	}
}

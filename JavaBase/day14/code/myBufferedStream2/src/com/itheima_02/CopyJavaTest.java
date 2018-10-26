package com.itheima_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 字符缓冲流特殊功能复制Java文件
 * 
 * 数据源：
 * 		BufferedStreamDemo.java---BufferedReader
 * 目的地：
 * 		Copy.java---BufferedWriter
 */
public class CopyJavaTest {
	public static void main(String[] args) throws IOException {
		//封装数据源
		BufferedReader br = new BufferedReader(new FileReader("BufferedStreamDemo.java"));
		//封装目的地
		BufferedWriter bw = new BufferedWriter(new FileWriter("Copy.java"));
		
		//读写数据
		String line;
		while((line=br.readLine())!=null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		//释放资源
		bw.close();
		br.close();
		
	}
}

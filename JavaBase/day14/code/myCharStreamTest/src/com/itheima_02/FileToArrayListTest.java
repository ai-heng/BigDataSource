package com.itheima_02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 从文本文件中读取数据到ArrayList集合中，并遍历集合
 * 每一行数据作为一个字符串元素
 * 
 * 分析：
 * 		A:创建字符缓冲输入流对象
 * 		B:创建集合对象
 * 		C:读取数据，每一次读取一行，并把该数据作为元素存储到集合中
 * 		D:释放资源
 * 		E:遍历集合
 */
public class FileToArrayListTest {
	public static void main(String[] args) throws IOException {
		//创建字符缓冲输入流对象
		BufferedReader br = new BufferedReader(new FileReader("array.txt"));
		
		//创建集合对象
		ArrayList<String> array = new ArrayList<String>();
		
		//读取数据，每一次读取一行，并把该数据作为元素存储到集合中
		String line;
		while((line=br.readLine())!=null) {
			array.add(line);
		}
		
		//释放资源
		br.close();
		
		//遍历集合
		for(String s : array) {
			System.out.println(s);
		}
	}
}

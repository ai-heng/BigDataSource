package com.itheima_02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 把ArrayList集合中的字符串数据存储到文本文件
 * 每一个字符串元素作为文件中的一行数据
 * 
 * 分析：
 * 		A:创建集合对象
 * 		B:往集合中添加字符串元素
 * 		C:创建字符缓冲输出流对象
 * 		D:遍历集合，得到每一个字符串元素，把字符串元素作为数据写入到文本文件
 * 		E:释放资源
 */
public class ArrayListToFileTest {
	public static void main(String[] args) throws IOException {
		//创建集合对象
		ArrayList<String> array = new ArrayList<String>();
		
		//往集合中添加字符串元素
		array.add("hello");
		array.add("world");
		array.add("java");
		
		//创建字符缓冲输出流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("array.txt"));
		
		//遍历集合，得到每一个字符串元素，把字符串元素作为数据写入到文本文件
		for(String s : array) {
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
		
		//释放资源
		bw.close();
	}
}

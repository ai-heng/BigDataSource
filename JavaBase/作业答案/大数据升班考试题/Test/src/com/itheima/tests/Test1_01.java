package com.itheima.tests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 已知在项目根目录下有一个stu.txt文件，内容如下：
		 	
	需求：将此文件拷贝到D盘根目录下的stu.txt文件中，拷贝时在文件每一行的末尾追加当前行数。末尾和行数使用--连接。
	拷贝后的文件内容如下：

 */
public class Test1_01 {
	public static void main(String[] args) throws IOException {
		//1.先把数据读到list中
		BufferedReader br = new BufferedReader(new FileReader("stu.txt"));
		ArrayList<String> list = new ArrayList<>();
		
		String line;
		while((line = br.readLine())!=null){
			list.add(line);
		}
		br.close();
		
		int count = 1;
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("stu.txt"));
		//写到文件里
		for (String s : list) {
			bw.write(s+"--"+count);
			count++;
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
}

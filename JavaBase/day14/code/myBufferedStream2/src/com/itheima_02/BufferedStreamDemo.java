package com.itheima_02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * 特殊功能
 * BufferedWriter
 * 		void newLine():写入一个行分隔符,这个行分隔符是由系统决定的
 * 
 * BufferedReader
 * 		String readLine():包含该行内容的字符串，不包含任何行终止符，如果已到达流末尾，则返回 null 
 */
public class BufferedStreamDemo {
	public static void main(String[] args) throws IOException {
//		//创建字符缓冲输出流对象
//		BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));
//		
//		//写数据
//		for(int x=0; x<3; x++) {
//			bw.write("hello");
////			bw.write("\r\n");
//			bw.newLine();
//			bw.flush();
//		}
//		
//		//释放资源
//		bw.close();
		
		//创建字符缓冲输入流对象
		BufferedReader br = new BufferedReader(new FileReader("bw.txt"));
		
//		//读取一次
//		String line = br.readLine();
//		System.out.println(line);
//		//在读取一次
//		line = br.readLine();
//		System.out.println(line);
//		line = br.readLine();
//		System.out.println(line);
//		//多读取两次
//		line = br.readLine();
//		System.out.println(line);
//		line = br.readLine();
//		System.out.println(line);
		
		//最终版代码
		String line;
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		
		//释放资源
		br.close();
	}
}

package com.heima.level01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task02 {
	/**
	 * 字符缓冲区流的特殊功能复制Java文件
	 * 
	 *  1.	创建BufferedReader输入流对象关联源文件
		2.	创建BufferedWriter输出流对象关联目标文件
		3.	调用readLine方法不断的读取，只要不等于null 说明没有读取完毕
		4.	调用writer方法直接写出字符串，但是要加上newLine方法手动换行
		5.	关闭流释放资源

	 */
	public static void main(String[] args) throws IOException {
		// 1.创建BufferedReader输入流对象关联源文件
		BufferedReader br = new BufferedReader(new FileReader("level01_Task02.txt"));
		// 2.创建BufferedWriter输出流对象关联目标文件
		BufferedWriter bw = new BufferedWriter(new FileWriter("copy_level01_Task02.txt"));
		// 3.用readLine方法不断的读取，只要不等于null 说明没有读取完毕
		String line;
		while((line = br.readLine()) != null){
			// 4.调用writer方法直接写出字符串，但是要加上newLine方法手动换行
			bw.write(line);
			bw.newLine();
		}
		
		//5.关闭流释放资源
		br.close();
		bw.close();
	}
}

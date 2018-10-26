package com.heima.level01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task02 {
	/**
	 * 需求说明：拷问文本文件
	 * 
	 * 	分析: 
	 * 		1.	创建FileInputStream对象关联源文件。
			2.	创建FileOutputStream对象关联目标文件。
			3.	自定义字节数组提高读写效率。
			4.	通过while循环不断地将数据读取到数组中。
			5.	在循环过程中将读取到的数据从数组中写出到目标文件。
			6.	关闭流释放资源

	 */
	public static void main(String[] args) throws IOException {
		//1.创建FileInputStream对象关联源文件。
		FileInputStream fis = new FileInputStream("Task02.txt");
		//2.创建FileOutputStream对象关联目标文件。
		FileOutputStream fos = new FileOutputStream("copyTask02.txt");
		//3.自定义字节数组提高读写效率。
		byte[] b = new byte[1024];
		//4.通过while循环不断地将数据读取到数组中。
		int len;
		while((len = fis.read(b)) != -1){
			//5.在循环过程中将读取到的数据从数组中写出到目标文件。
			fos.write(b,0,len);
		}
		//6.关闭流释放资源
		fis.close();
		fos.close();
	}
}

package com.itheima;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 如何实现数据的换行?
 * 		不同的操作系统，针对换行的符号识别是不一样的。
 * 		windows:\r\n
 * 		linux:\n
 * 		mac:\r
 * 
 * 如何实现数据的追加写入?
 * 		用构造方法带第二个参数是true的情况即可
 */
public class FileOutputStreamDemo3 {
	public static void main(String[] args) throws IOException {
		//创建字节输出流对象
		//FileOutputStream fos = new FileOutputStream("c.txt");
		//FileOutputStream(String name, boolean append) 
		//如果第二个参数为 true，则将字节写入文件末尾处，而不是写入文件开始处
		FileOutputStream fos = new FileOutputStream("c.txt",true);
		
		//调用写数据的方法
		for(int x=0; x<10; x++) {
			fos.write("hello".getBytes());
			//加入换行符号
			fos.write("\r\n".getBytes());
		}
		
		//释放资源
		fos.close();
	}
}

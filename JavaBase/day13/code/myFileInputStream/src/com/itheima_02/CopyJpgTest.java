package com.itheima_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 把d:\\mn.jpg内容复制到当前项目目录下的mn.jpg中
 * 
 * 数据源：
 * 		d:\\mn.jpg---读数据---FileInputStream
 * 目的地：
 * 		mn.jpg---写数据---FileOutputStream
 */
public class CopyJpgTest {
	public static void main(String[] args) throws IOException {
		//封装数据源
		FileInputStream fis = new FileInputStream("d:\\mn.jpg");
		//封装目的地
		FileOutputStream fos = new FileOutputStream("mn.jpg");
		
		//读写数据
		//方式1：一次读取一个字节，一次写一个字节(自己练习)
		//方式2：一次读取一个字节数组，一次写一个字节数组的一部分
		byte[] bys = new byte[1024];
		int len;
		while((len=fis.read(bys))!=-1) {
			fos.write(bys,0,len);
		}
		
		//释放资源
		fos.close();
		fis.close();
	}
}

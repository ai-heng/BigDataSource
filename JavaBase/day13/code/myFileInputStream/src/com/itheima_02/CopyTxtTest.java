package com.itheima_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 把d:\\窗里窗外.txt内容复制到项目目录下的林青霞.txt中
 * 
 * 文件复制，其实就是从一个文件中读数据，然后把数据写到另一个文件中。
 * 
 * 数据源：
 * 		d:\\窗里窗外.txt---读数据---InputStream---FileInputStream
 * 
 * 目的地：
 * 		林青霞.txt---写数据---OutputStream---FileOutputStream
 */
public class CopyTxtTest {
	public static void main(String[] args) throws IOException {
		//封装数据源
		FileInputStream fis = new FileInputStream("d:\\窗里窗外.txt");
		//封装目的地
		FileOutputStream fos = new FileOutputStream("林青霞.txt");
		
		//读写数据
		//方式1:一次读取一个字节
//		int by;
//		while((by=fis.read())!=-1) {
//			fos.write(by);
//		}
		
		//方式2:一次读取一个字节数组
		byte[] bys = new byte[1024];
		int len;
		while((len=fis.read(bys))!=-1) {
			fos.write(bys, 0, len);
		}
		
		//释放资源
		fos.close();
		fis.close();
	}
}

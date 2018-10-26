package com.itheima_01;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * 字节缓冲区流：
 * BufferedOutputStream:字节缓冲输出流
 * BufferedInputStream:字节缓冲输入流
 * 
 * BufferedOutputStream(OutputStream out) 
 * 使用这种构造方法，它提供了一个默认的缓冲区大小，所以一般我们使用默认的缓冲区就可以了。
 * 
 * 为什么构造方法传递的是一个：OutputStream，而不是具体的文件或者路径呢?
 * 字节缓冲区流仅仅提供缓冲区，而真正的底层的读写数据还得需要基本的流对象进行操作。
 */
public class BufferedStreamDemo {
	public static void main(String[] args) throws IOException {
		// BufferedOutputStream(OutputStream out)
		// FileOutputStream fos = new FileOutputStream("a.txt");
		// BufferedOutputStream bos = new BufferedOutputStream(fos);
		// 上面的两句等价于下面的这一句
		// BufferedOutputStream bos = new BufferedOutputStream(new
		// FileOutputStream("a.txt"));
		// bos.write("hello".getBytes());
		// bos.close();

		// BufferedInputStream(InputStream in)
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.txt"));
		//方式1：一次读取一个字节
//		int by;
//		while((by=bis.read())!=-1) {
//			System.out.print((char)by);
//		}
		
		//方式2：一次读取一个字节数组
		byte[] bys = new byte[1024];
		int len;
		while((len=bis.read(bys))!=-1) {
			System.out.print(new String(bys,0,len));
		}
		
		bis.close();
	}
}

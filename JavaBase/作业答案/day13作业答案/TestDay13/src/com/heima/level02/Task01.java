package com.heima.level02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

public class Task01 {
	/**
		需求: 读取当前项目下的info1.txt
				文件内容如下 : aaaaaaaaaaabbbbbbbbbbbbccdefg
		  	要求将数据去重后写回
	 			最终效果 : fgdebca
	 			
	 	1.	创建HashSet集合对象用于存储读取到的每一个字符(用于去重)
		2.	创建字节输入流对象
		3.	将读取到的字符存储到集合中
		4.	创建输入流对象关联目标文件
		5.	遍历Set集合获取到每一个数据, 并调用write方法写出
		6.	关闭流释放资源

	 */
	public static void main(String[] args) throws IOException {
		//1.创建HashSet集合对象用于存储读取到的每一个字符(用于去重)
		HashSet<Character> hs = new HashSet<>();
		//2.创建字节输入流对象
		FileInputStream fis = new FileInputStream("info1.txt");
		//3.将读取到的字符存储到集合中
		int len;
		while ((len = fis.read()) != -1) {
			hs.add((char) len);
		}
		//4.创建输入流对象关联目标文件
		FileOutputStream fos = new FileOutputStream("info1.txt");
		
		//5.遍历Set集合获取到每一个数据, 并调用write方法写出
		Iterator<Character> it = hs.iterator();
		while (it.hasNext()) {
			char c = it.next();
			fos.write(c);
		}
		//6.关闭流释放资源
		fis.close();
		fos.close();
	}
}

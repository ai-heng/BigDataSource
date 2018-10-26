package com.itheima_01;

import java.io.File;

/*
 * File:文件和目录路径名的抽象表示形式
 * 也就是说文件和目录是可以通过File封装成对象的
 * 目录：其实就是文件夹
 * 
 * File构造方法：
 * 		File(String pathname):通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。
 * 		File(String parent, String child):根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。
 * 		File(File parent, String child):根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
 */
public class FileDemo {
	public static void main(String[] args) {
		//File(String pathname)
		File f1 = new File("d:\\aa\\b.txt");
		
		//File(String parent, String child)
		File f2 = new File("d:\\aa","b.txt");
		
		//File(File parent, String child)
		File f3 = new File("d:\\aa");
		File f4 = new File(f3,"b.txt");
		
		//上面的f1,f2,f4其实做的是同样的事情，就是把d:\\aa\\b.txt转换为了一个File对象
	}
}

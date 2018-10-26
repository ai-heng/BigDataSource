package com.itheima_02;

import java.io.File;
import java.io.IOException;

/*
 * 创建功能
 * public boolean createNewFile():创建文件
 * 		如果文件不存在，创建文件并返回true
 * 		如果文件存在，创建文件失败并返回false
 * 
 * public boolean mkdir():创建目录
 * 		如果目录不存在，创建目录并返回true
 * 		如果目录存在，创建目录失败并返回false
 * 
 * public boolean mkdirs():创建多级目录
 */
public class FileDemo {
	public static void main(String[] args) throws IOException {
		//需求1：我要在d盘目录下创建一个文件a.txt
		File f1 = new File("d:\\a.txt");
		System.out.println("createNewFile:"+f1.createNewFile());
		
		//需求2：我要在d盘目录下创建一个目录bb
		File f2 = new File("d:\\bb");
		System.out.println("mkdir:"+f2.mkdir());
		System.out.println("-----------------");
		
		//需求3：我要在d盘目录下创建一个多级目录cc\\dd
//		File f3 = new File("d:\\cc\\dd");
//		System.out.println("mkdir:"+f3.mkdir());
		//一步一步的实现
//		File f3 = new File("d:\\cc");
//		File f4 = new File("d:\\cc\\dd");
//		System.out.println("mkdir:"+f3.mkdir());
//		System.out.println("mkdir:"+f4.mkdir());
		//一步操作
		File f3 = new File("d:\\cc\\dd");
		System.out.println("mkdirs:"+f3.mkdirs());
		
		//需求4：我要在d盘目录下创建一个文件ee\\f.txt
		File f4 = new File("d:\\ee");
		File f5 = new File("d:\\ee\\f.txt");
		System.out.println("mkdir:"+f4.mkdir());
		System.out.println("createNewFile:"+f5.createNewFile());
	}
}

package com.itheima_04;

import java.io.File;

/*
 * 判断功能
 * public boolean isDirectory():判断是否是目录
 * public boolean isFile():判断是否是文件
 * public boolean exists():判断是否存在
 * 获取功能
 * public String getAbsolutePath():获取绝对路径
 * public String getPath():获取相对路径
 * public String getName():获取名称
 */
public class FileDemo {
	public static void main(String[] args) {
		//创建File对象
		File f = new File("aaa\\bbb.txt");
		
		//判断功能
		System.out.println("isDirectory:"+f.isDirectory());
		System.out.println("isFile:"+f.isFile());
		System.out.println("exists:"+f.exists());
		System.out.println("------------------");
		
		//获取功能
		System.out.println("getAbsolutePath:"+f.getAbsolutePath());
		System.out.println("getPath:"+f.getPath());
		System.out.println("getName:"+f.getName());
	}
}

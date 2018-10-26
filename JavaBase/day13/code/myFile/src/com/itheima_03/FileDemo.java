package com.itheima_03;

import java.io.File;
import java.io.IOException;

/*
 * 删除功能
 * public boolean delete():删除文件和目录
 * 
 * 路径的问题：
 * 绝对路径：是以盘符开始的路径。d:\\aa\\b.txt
 * 相对路径：不以盘符开始。相对于当前的项目而言，在项目的目录下。如何显示出来呢？刷新项目就可以了。
 * 
 * 注意：
 * 		如果一个目录中有内容(目录，文件)，就不能直接删除。
 * 		应该先删除目录中的内容，最后才能删除目录。
 */
public class FileDemo {
	public static void main(String[] args) throws IOException {
		// //需求1：我要创建一个文件a.txt
		// File f1 = new File("a.txt");
		// System.out.println("createNewFile:"+f1.createNewFile());
		//
		// //需求2：我要创建一个目录bb
		// File f2 = new File("bb");
		// System.out.println("mkdir:"+f2.mkdir());
		// System.out.println("-----------------");
		//
		// //需求3：我要创建一个文件cc\\d.txt
		// File f3 = new File("cc");
		// File f4 = new File("cc\\d.txt");
		// System.out.println("mkdir:"+f3.mkdir());
		// System.out.println("createNewFile:"+f4.createNewFile());
		// System.out.println("-----------------");

		// public boolean delete():删除文件和目录
		// 需求1：我要删除a.txt这个文件
		File f1 = new File("a.txt");
		System.out.println("delete:" + f1.delete());
		
		//需求2：我要删除bb这个目录
		File f2 = new File("bb");
		System.out.println("delete:"+f2.delete());
		System.out.println("--------------------");
		
		//需求3：我要删除cc这个目录
		File f3 = new File("cc");
		System.out.println("delete:"+f3.delete());
		//思路：先删除d.txt这个文件，再删除cc这个目录
	}
}

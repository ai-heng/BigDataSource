package com.itheima_03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 从文本文件中读取学生数据到ArrayList集合中，并遍历集合
 * 每一行数据作为一个学生元素
 * 
 * it001,张曼玉,35,北京
 * 这里我们要使用String类中的一个方法：split()
 * 
 * 分析：
 * 		A:创建字符缓冲输入流对象
 * 		B:创建集合对象
 * 		C:读取数据，每一次读取一行数据，把该行数据想办法封装成学生对象，并把学生对象存储到集合中
 * 		D:释放资源
 * 		E:遍历集合
 */
public class FileToArrayListTest {
	public static void main(String[] args) throws IOException {
		// 创建字符缓冲输入流对象
		BufferedReader br = new BufferedReader(new FileReader("students.txt"));

		// 创建集合对象
		ArrayList<Student> array = new ArrayList<Student>();

		// 读取数据，每一次读取一行数据，把该行数据想办法封装成学生对象，并把学生对象存储到集合中
		String line;
		while ((line = br.readLine()) != null) {
			// it001,张曼玉,35,北京
			String[] strArray = line.split(",");

			Student s = new Student();
			s.setSid(strArray[0]);
			s.setName(strArray[1]);
			s.setAge(Integer.parseInt(strArray[2]));
			s.setCity(strArray[3]);

			array.add(s);
		}

		// 释放资源
		br.close();

		// 遍历集合
		for (Student s : array) {
			System.out.println(s.getSid() + "---" + s.getName() + "---" + s.getAge() + "---" + s.getCity());
		}
	}
}

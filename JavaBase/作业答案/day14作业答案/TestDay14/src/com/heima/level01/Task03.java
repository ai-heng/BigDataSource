package com.heima.level01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Task03 {
	/**
	 * 一、	需求说明：
		a)	将集合中Student对象的信息写入当前项目下的stuInfo.txt当中
		b)	再读取stuInfo.txt的内容到集合中，遍历集合打印数据
	       二、	补充说明：
		a)	写出信息的格式： it001,张曼玉,35,北京
		b)	输出信息的格式： it001,张曼玉,35,北京


		分析：
			1.	创建Student类，用于封装数据
			2.	创建集合对象，将学生对象添加到集合中
			3.	创建输出流对象关联stuInfo.txt文件
			4.	遍历集合对象获取到每一个Student, 再用StringBuilder拼接成指定的格式并写出
			5.	关闭输出流对象
			6.	创建BufferedReader输入流对象关联stuInfo.txt, 因为有读取一行的方法
			7.	创建集合对象用于存储读取到的Student(也可以将原集合清空)
			8.	将读取到的每一行数据通过split方法切割，再将切割后的信息封装成Student对象
			9.	将学生对象添加到集合中
			10.	关闭输入流对象
			11.	遍历集合并打印

	 */
	public static void main(String[] args) throws IOException {
		// 2.创建集合对象，将学生对象添加到集合中
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("it001", "张曼玉", 35, "北京"));
		list.add(new Student("it002", "王祖贤", 33, "上海"));
		list.add(new Student("it003", "林青霞", 30, "西安"));
		
		// 3.创建输出流对象关联stuInfo.txt文件
		BufferedWriter bw = new BufferedWriter(new FileWriter("stuInfo.txt"));
		// 4.遍历集合对象获取到每一个Student, 再用StringBuilder拼接成指定的格式并写出
		for (Student s : list) {
			StringBuilder sb = new StringBuilder();
			sb.append(s.getId()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",")
					.append(s.getAddress());
			bw.write(sb.toString());
			bw.newLine();
			bw.flush();
		}
		// 5.关闭输出流对象
		bw.close();
		
		// 6.创建BufferedReader输入流对象关联stuInfo.txt, 因为有读取一行的方法
		BufferedReader br = new BufferedReader(new FileReader("stuInfo.txt"));
		// 7.创建集合对象用于存储读取到的Student(也可以将原集合清空)
		list.clear();
		// 8.将读取到的每一行数据通过split方法切割，再将切割后的信息封装成Student对象
		String line;
		while ((line = br.readLine()) != null) {
			// it001,张曼玉,35,北京
			String[] strArray = line.split(",");

			Student s = new Student();
			s.setId(strArray[0]);
			s.setName(strArray[1]);
			s.setAge(Integer.parseInt(strArray[2]));
			s.setAddress(strArray[3]);
			// 9.将学生对象添加到集合中
			list.add(s);
		}
		
		// 10.关闭输入流对象
		br.close();
		
		// 11.遍历集合并打印
		for (Student s : list) {
			System.out.println(s.getId() + "," + s.getName() + "," + s.getAge() + "," + s.getAddress());
		}
	}
}

package com.itheima_03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 把ArrayList集合中的学生数据存储到文本文件
 * 每一个学生数据作为文件中的一行数据
 * 
 * 定义一个学生类。
 * 学生：
 * 		学号，姓名，年龄，所在城市
 * 		it001,张曼玉,35,北京
 * 		it002,王祖贤,33,上海
 * 		it003,林青霞,30,西安
 * 
 * 分析：
 * 		A:创建集合对象
 * 		B:创建学生对象
 * 		C:把学生对象添加到集合中
 * 		D:创建字符缓冲输出流对象
 * 		E:遍历集合，得到每一个学生对象，然后把该对象的数据拼接成一个指定格式的字符串写到文本文件
 * 		F:释放资源
 */
public class ArrayListToFileTest {
	public static void main(String[] args) throws IOException {
		// 创建集合对象
		ArrayList<Student> array = new ArrayList<Student>();

		// 创建学生对象
		Student s1 = new Student("it001", "张曼玉", 35, "北京");
		Student s2 = new Student("it002", "王祖贤", 33, "上海");
		Student s3 = new Student("it003", "林青霞", 30, "西安");

		// 把学生对象添加到集合中
		array.add(s1);
		array.add(s2);
		array.add(s3);

		// 创建字符缓冲输出流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("students.txt"));

		// 遍历集合，得到每一个学生对象，然后把该对象的数据拼接成一个指定格式的字符串写到文本文件
		for (Student s : array) {
			// it001,张曼玉,35,北京
			StringBuilder sb = new StringBuilder();
			sb.append(s.getSid()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",")
					.append(s.getCity());
			bw.write(sb.toString());
			bw.newLine();
			bw.flush();
		}
		
		//释放资源
		bw.close();
	}
}

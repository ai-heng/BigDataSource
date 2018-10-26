package com.itheima.level01;

import java.util.ArrayList;
import java.util.List;

public class Task03 {
	public static void main(String[] args) {
		// 创建集合对象
		List<Student> list = new ArrayList<Student>();

		// 创建元素对象
		Student s1 = new Student("林青霞", 30);
		Student s2 = new Student("张曼玉", 35);
		Student s3 = new Student("王祖贤", 33);

		// 把元素添加到集合
		list.add(s1);
		list.add(s2);
		list.add(s3);

		// 遍历集合
		// 增强for
		for (Student s : list) {
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}

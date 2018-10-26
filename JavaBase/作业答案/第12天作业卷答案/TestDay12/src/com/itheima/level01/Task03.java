package com.itheima.level01;

import java.util.HashMap;
import java.util.Set;

/*
 * 任选一种方式遍历
 * HashMap<Student,String>
 * 键：Student 学生对象
 * 值：String 学生住址
 * 要求：如果学生对象的成员变量值相同，就说明是同一个键。
 */
public class Task03 {
	public static void main(String[] args) {
		// 创建集合对象
		HashMap<Student, String> hm = new HashMap<Student, String>();

		// 创建元素对象
		Student s1 = new Student("林青霞", 30);
		Student s2 = new Student("张曼玉", 35);
		Student s3 = new Student("王祖贤", 33);
		Student s4 = new Student("张曼玉", 35);

		// 添加元素到集合中
		hm.put(s1, "北京");
		hm.put(s2, "上海");
		hm.put(s3, "西安");
		hm.put(s4, "香港");

		// 键找值
		Set<Student> set = hm.keySet();
		for (Student key : set) {
			String value = hm.get(key);
			System.out.println(key.getName() + "---" + key.getAge() + "---" + value);
		}
	}
}

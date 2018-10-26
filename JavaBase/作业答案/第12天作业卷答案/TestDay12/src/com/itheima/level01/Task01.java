package com.itheima.level01;

import java.util.HashSet;
import java.util.Iterator;

/*
 * HashSet集合存储自定义对象并遍历
 * 提示：自定义一个学生类，给出成员变量name和age。遍历集合的时候，在控制台输出学生对象的成员变量值。
 * 两种方式遍历
 * 		迭代器
 * 		增强for
 * 集合的使用步骤：
 * 		A:创建集合对象
 * 		B:创建元素对象
 * 		C:把元素添加到集合
 * 		D:遍历集合
 * 		E:重写学生类中equals()和hashCode()方法
 */
public class Task01 {
	public static void main(String[] args) {
		// demo01();
		
		// 创建集合对象
		HashSet<Student> hs = new HashSet<Student>();

		// 创建元素对象
		Student s1 = new Student("林青霞", 30);
		Student s2 = new Student("张曼玉", 35);
		Student s3 = new Student("王祖贤", 33);

		// 把元素添加到集合
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);

		// 遍历
		// 迭代器
		Iterator<Student> it = hs.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
		System.out.println("------------------");

		// 增强for
		for (Student s : hs) {
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}

	private static void demo01() {
		// 创建集合对象
		HashSet<Student> hs = new HashSet<Student>();

		// 创建元素对象
		Student s1 = new Student("林青霞", 30);
		Student s2 = new Student("张曼玉", 35);
		Student s3 = new Student("王祖贤", 33);

		// 把元素添加到集合
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);

		// 遍历
		// 迭代器
		Iterator<Student> it = hs.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
		System.out.println("------------------");

		// 增强for
		for (Student s : hs) {
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
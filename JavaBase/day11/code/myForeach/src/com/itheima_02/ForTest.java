package com.itheima_02;

import java.util.ArrayList;
import java.util.List;

/*
 * List集合存储自定义对象并遍历
 * 提示：自定义一个学生类，给出成员变量name和age。遍历集合的时候，在控制台输出学生对象的成员变量值。
 * 遍历方式
 * 		增强for
 */
public class ForTest {
	public static void main(String[] args) {
		//创建集合对象
		List<Student> list = new ArrayList<Student>();
		
		//创建元素对象
		Student s1 = new Student("林青霞",30);
		Student s2 = new Student("张曼玉",35);
		Student s3 = new Student("王祖贤",33);
		
		//把元素添加到集合
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		//遍历集合
		//增强for
		for(Student s : list) {
			System.out.println(s.getName()+"---"+s.getAge());
		}
	}
}

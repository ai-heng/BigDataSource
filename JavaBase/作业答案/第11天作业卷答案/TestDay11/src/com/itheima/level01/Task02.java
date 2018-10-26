package com.itheima.level01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * List集合存储自定义对象并遍历
 * 提示：自定义一个学生类，给出成员变量name和age。
 * 遍历集合的时候，在控制台输出学生对象的成员变量值。
 * 两种方式遍历
 * 		迭代器
 * 		普通for
 */
public class Task02 {
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
		
		//迭代器
		Iterator<Student> it = list.iterator();
		while(it.hasNext()){
			Student s = it.next();
			System.out.println(s.getName()+"---"+s.getAge());
		}
		System.out.println("-----------------");
		
		//普通for
		for(int x=0; x<list.size(); x++) {
			Student s = list.get(x);
			System.out.println(s.getName()+"---"+s.getAge());
		}
	}
}


package com.itheima_02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * Collection集合存储自定义对象并遍历
 * 提示：自定义一个学生类，给出成员变量name和age。遍历集合的时候，在控制台输出学生对象的成员变量值。
 * 
 * 集合的使用步骤：
 * 		A:创建集合对象
 * 		B:创建元素对象
 * 		C:把元素添加到集合
 * 		D:遍历集合
 */
public class CollectionTest {
	public static void main(String[] args) {
		//创建集合对象
		Collection<Student> c = new ArrayList<Student>();
		
		//创建元素对象
		Student s1 = new Student("林青霞",30);
		Student s2 = new Student("张曼玉",35);
		Student s3 = new Student("王祖贤",33);
		
		//把元素添加到集合
		c.add(s1);
		c.add(s2);
		c.add(s3);
		
		//遍历集合
		Iterator<Student> it = c.iterator();
		while(it.hasNext()){
			Student s = it.next();
			System.out.println(s.getName()+"---"+s.getAge());
		}
	}
}

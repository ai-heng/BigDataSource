package com.itheima_02;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ArrayList集合存储自定义对象并遍历
 * 提示：自定义一个学生类，给出成员变量name和age。遍历集合的时候，在控制台输出学生对象的成员变量值。
 * 三种方式遍历
 * 		迭代器
 * 		普通for
 * 		增强for
 * 
 * LinkedList的使用和ArrayList的相似，所以LinkedList的练习需要大家自己做
 */
public class ArrayListTest {
	public static void main(String[] args) {
		//创建集合对象
		ArrayList<Student> array = new ArrayList<Student>();
		
		//创建元素对象
		Student s1 = new Student("林青霞",30);
		Student s2 = new Student("张曼玉",35);
		Student s3 = new Student("王祖贤",33);
		
		//把元素添加到集合
		array.add(s1);
		array.add(s2);
		array.add(s3);
		
		//迭代器
		Iterator<Student> it = array.iterator();
		while(it.hasNext()){
			Student s = it.next();
			System.out.println(s.getName()+"---"+s.getAge());
		}
		System.out.println("----------------------");
		
		//普通for
		for(int x=0; x<array.size(); x++) {
			Student s = array.get(x);
			System.out.println(s.getName()+"---"+s.getAge());
		}
		System.out.println("----------------------");
		
		//增强for
		for(Student s : array) {
			System.out.println(s.getName()+"---"+s.getAge());
		}
	}
}

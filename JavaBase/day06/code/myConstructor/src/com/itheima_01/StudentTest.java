package com.itheima_01;
/*
 * 测试类
 */
public class StudentTest {
	public static void main(String[] args) {
		//如何调用构造方法呢?
		//其实通过new关键字就可以
		//格式：类名 对象名 = new 构造方法名(...);
		Student s = new Student();
		s.show();
		
		//public Student(String name)
		Student s2 = new Student("林青霞");
		s2.show();
		
		//public Student(int age)
		Student s3 = new Student(30);
		s3.show();
		
		//public Student(String name,int age)
		Student s4 = new Student("林青霞",30);
		s4.show();
	}
}

package com.itheima_02;
/*
 * 测试类
 */
public class StudentTest {
	public static void main(String[] args) {
		//创建对象
		Student s = new Student();
		System.out.println(s.getName()+"***"+s.getAge());
		
		//给成员变量赋值
		s.setName("林青霞");
		s.setAge(30);
		System.out.println(s.getName()+"***"+s.getAge());
	}
}

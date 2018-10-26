package com.itheima_01;
/*
 * 测试类
 */
public class StudentTest {
	public static void main(String[] args) {
		//创建对象
		Student s = new Student();
		s.show();
		
		//给成员变量赋值
		s.name = "林青霞";
		//s.age = 30;
		//s.age = -30;
		//通过方法赋值
		s.setAge(-30);
		s.show();
	}
}

package com.itheima_02;
/*
 * 测试类
 */
public class StudentTest {
	public static void main(String[] args) {
		//无参构造方法+setXxx()
		Student s = new Student();
		s.setName("林青霞");
		s.setAge(30);
		System.out.println(s.getName()+"---"+s.getAge());
		
		//带参构造方法
		Student s2 = new Student("林青霞",30);
		System.out.println(s2.getName()+"---"+s2.getAge());
	}
}

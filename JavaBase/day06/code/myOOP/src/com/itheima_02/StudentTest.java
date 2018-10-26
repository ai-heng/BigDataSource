package com.itheima_02;
/*
 * 类的使用：
 * 		使用一个类，其实就是使用该类的成员。(成员变量和成员方法)
 * 而我们要想使用一个类的成员，就必须先拥有该类的对象。
 * 那么我们如何拥有一个类的对象呢?
 * 		创建对象就可以了
 * 我们如何创建对象呢?
 * 		格式：
 * 			类名  对象名  = new 类名();
 * 对象如何访问成员呢?
 * 		成员变量：
 * 			对象名.成员变量
 * 		成员方法：
 * 			对象名.成员方法(...)
 */
public class StudentTest {
	public static void main(String[] args) {
		//类名  对象名  = new 类名();
		Student s = new Student();
		//System.out.println("s:"+s);//com.itheima_02.Student@da6bf4
		
		//使用成员变量
		System.out.println("姓名："+s.name);//null
		System.out.println("年龄："+s.age);//0
		System.out.println("----------");
		
		//给成员变量赋值
		s.name = "林青霞";
		s.age = 30;
		//再次使用成员变量
		System.out.println("姓名："+s.name);//林青霞
		System.out.println("年龄："+s.age);//30
		System.out.println("----------");
		
		//调用成员方法
		s.study();
		s.eat();
	}
}

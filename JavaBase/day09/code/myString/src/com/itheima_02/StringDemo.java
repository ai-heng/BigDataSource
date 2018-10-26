package com.itheima_02;
/*
 * String类创建对象的特点：
 * 		A:通过构造方法创建对象
 * 		B:通过直接赋值的方式创建对象
 * 这两种方式的创建是有区别的。
 * 通过构造方法创建的字符串对象是在堆内存。
 * 通过直接赋值的方式创建的字符串对象是在方法区的常量池。
 */
public class StringDemo {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = new String("hello");
		
		String s3 = "hello";
		String s4 = "hello";
		
		System.out.println(s1 == s2);//false
		System.out.println(s1 == s3);//false
		System.out.println(s3 == s4);//true
	}
}

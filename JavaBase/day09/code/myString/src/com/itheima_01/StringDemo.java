package com.itheima_01;
/*
 * String：代表字符串类。
 * 		由多个字符组成的一串数据。
 * 		字符串的本质就是一个字符数组。		
 * 
 * 构造方法：
 * 		String(String original):把字符串数据封装成字符串对象
 * 		String(char[] value):把字符数组的数据封装成字符串对象
 * 		String(char[] value, int index, int count):把字符数组的一部分数据封装成字符串对象
 * 
 * public String toString():返回此对象本身（它已经是一个字符串！）。 
 */
public class StringDemo {
	public static void main(String[] args) {
		//String(String original):把字符串数据封装成字符串对象
		String s1 = new String("hello");
		System.out.println(s1);
		System.out.println("----------");
		
		//String(char[] value):把字符数组的数据封装成字符串对象
		char[] value = {'h','e','l','l','o'};
		String s2 = new String(value);
		System.out.println(s2);
		System.out.println("----------");
		
		//String(char[] value, int index, int count):把字符数组的一部分数据封装成字符串对象
		//String s3 = new String(value,0,value.length);
		String s3 = new String(value,0,3);
		System.out.println(s3);
		System.out.println("----------");
		
		//最常用的
		String s4 = "hello";
		System.out.println(s4);
	}
}

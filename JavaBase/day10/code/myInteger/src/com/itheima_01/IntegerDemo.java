package com.itheima_01;

/*
 * 需求：我要判断一个数据是否在int范围内?
 * 要想判断一个数据是否在int范围内，首先我们得知道int范围，在前面我们讲解基本数据类型的时候说过了：
 * 		-2147483648 到 2147483647
 * 
 * 为了对基本数据类型进行更多更方便的操作，Java就针对每一种基本数据类型提供了一个对应的引用类型。
 * 基本类型包装类：
 * 		Byte	byte
 * 		Short	short
 * 		Integer	int
 * 		Long	long
 * 		Float	float
 * 		Double	double
 * 		Character	char
 * 		Boolean	boolean
 * 
 * 基本数据类型包装类最常见的用法就是用于和字符串之间进行相互转换。
 */
public class IntegerDemo {
	public static void main(String[] args) {
		// public static final int MAX_VALUE
		System.out.println(Integer.MAX_VALUE);
		// public static final int MIN_VALUE
		System.out.println(Integer.MIN_VALUE);
	}
}

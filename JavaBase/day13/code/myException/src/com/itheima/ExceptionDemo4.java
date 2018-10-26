package com.itheima;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Java中的异常被分为两大类：编译时异常和运行时异常。
 * 所有的RuntimeException类及其子类的实例被称为运行时异常，其他的异常都是编译时异常
 * 
 * 编译时异常：Java程序必须显示处理，否则程序就会发生错误的一个提示，无法通过编译
 * 运行时异常：Java程序无需显示处理，也可以和编译时异常一样处理
 */
public class ExceptionDemo4 {
	public static void main(String[] args) {
		System.out.println("程序开始执行");
		//method();
		method2();
		System.out.println("程序结束执行");
	}
	
	//编译时异常ParseException
	public static void method() {
		try{
			//String s = "2088-08-08";
			String s = "abcd";
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date d = sdf.parse(s);
			System.out.println(d);
		}catch(ParseException e) {
			e.printStackTrace();
		}
	}
	
	//运行时异常
	public static void method2() {
		try{
			int a = 10;
			int b = 0;
			System.out.println(a/b);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}
}

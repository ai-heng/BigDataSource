package com.itheima_02;
/*
 * Integer:Integer类在对象中包装了一个基本类型 int 的值。
 * 
 * 构造方法：
 * 		Integer(int value) 
 * 		Integer(String s) 
 * 			注意：这个字符串必须由数字字符组成
 */
public class IntegerDemo {
	public static void main(String[] args) {
		//Integer(int value) 
		int value = 100;
		Integer i = new Integer(value);
		System.out.println(i); //100
		System.out.println("------------");
		
		//Integer(String s) 
		String s = "100";
		//NumberFormatException:数据格式化异常
		//String s = "abc";
		Integer ii = new Integer(s);
		System.out.println(ii);
	}
}

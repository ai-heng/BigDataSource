package com.itheima_01;
/*
 * StringBuilder:是一个可变的字符串类。
 * 
 * String和StringBuilder的区别：
 * 		String的内容是固定的。
 * 		StringBuilder的内容是可变的。
 * 
 * 构造方法
 * public StringBuilder()
 * public StringBuilder(String str)
 * 
 * public String toString():返回此序列中数据的字符串表示形式。
 */
public class StringBuilderDemo {
	public static void main(String[] args) {
		//public StringBuilder()
		StringBuilder sb = new StringBuilder();
		System.out.println("sb:"+sb);
		System.out.println(sb.length());
		System.out.println("----------------");
		
		//public StringBuilder(String str)
		StringBuilder sb2 = new StringBuilder("helloworld");
		System.out.println("sb2:"+sb2);
		System.out.println(sb2.length());
	}
}

package com.itheima_03;
/*
 * StringBuilder和String的相互转换
 * 
 * StringBuilder -- String
 * 		public String toString():通过toString()就可以实现把StringBuilder转换为String
 * 
 * String -- StringBuilder
 * 		public StringBuilder(String s):通过构造方法就可以实现把String转换为StringBuilder
 */
public class StringBuilderTest {
	public static void main(String[] args) {
		/*
		//StringBuilder -- String
		StringBuilder sb = new StringBuilder();
		sb.append("hello");
		
		//错误的
		//String s = sb;
		//public String toString()
		String s = sb.toString();
		System.out.println(s);
		*/
		
		//String -- StringBuilder
		String s = "hello";
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb);
	}
}

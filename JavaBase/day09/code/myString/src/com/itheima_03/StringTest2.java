package com.itheima_03;
/*
 * 需求：遍历字符串(获取字符串中的每一个字符)
 */
public class StringTest2 {
	public static void main(String[] args) {
		//要遍历字符串，你首先得有一个字符串
		String s = "abcde";
		
		//思考：如何获取字符串中的每一个字符
		//假如让我们来提供方法，我们应该提供一个根据索引返回指定位置的字符的方法
		//返回值：char
		//形式参数：int index
		//public char charAt(int index):返回指定索引处的值
		//原始做法
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(4));
		System.out.println("-------------------");
		
		//用for循环改进
		for(int x=0; x<5; x++) {
			System.out.println(s.charAt(x));
		}
		System.out.println("-------------------");
		
		//目前for循环中的数据5是我们数出来的，那么字符串有没有提供一个方法，用于获取字符串中字符的个数呢?
		//public int length():返回字符串中的字符个数，字符串的长度
		for(int x=0; x<s.length(); x++) {
			System.out.println(s.charAt(x));
		}
	}
}

package com.itheima_03;

import java.util.Scanner;

/*
 * 需求：字符串反转
 * 举例：键盘录入”abc”		
 * 输出结果：”cba”
 * 
 * 分析：
 * 		A:键盘录入字符串数据
 * 		B:写方法实现字符串数据的反转
 * 			把字符串倒着遍历，在把每一个得到的字符拼接成一个字符串
 * 		C:调用方法
 * 		D:输出结果
 */
public class StringTest4 {
	public static void main(String[] args) {
		//键盘录入字符串数据
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String s = sc.nextLine();
		
		//写方法实现字符串数据的反转
		
		//调用方法
		String result = reverse(s);
		
		//输出结果
		System.out.println("result:"+result);
	}
	
	/*
	 * 两个明确：
	 * 		返回值类型：String
	 * 		参数列表：String s
	 */
	public static String reverse(String s) {
		//把字符串倒着遍历，在把每一个得到的字符拼接成一个字符串
		String ss = "";
		
		for(int x=s.length()-1; x>=0; x--) {
			ss += s.charAt(x);
		}
		
		return ss;
	}
}

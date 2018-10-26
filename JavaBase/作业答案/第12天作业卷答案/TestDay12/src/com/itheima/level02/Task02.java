package com.itheima.level02;

import java.util.ArrayList;
import java.util.Scanner;

/*
键盘读取一行输入,去掉其中重复字符, 打印出不同的那些字符
思路：
1、键盘录入字符串
2、遍历字符串，将每个字符存储到集合中
3、 将集合中重复的字符去掉
4、 创建新集合，遍历老集合，获取老集合中的元素，判断新集合中是否包含这个元素
	如果不包含，则将这个元素添加到新集合中
5、 清空老集合中元素
6、 将新集合中的元素添加到老集合中
7、遍历老集合
 */
public class Task02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一行字符串：");
		String s = sc.nextLine();
		
		ArrayList<Character> list = new ArrayList<>();
		
		char[] chs = s.toCharArray();
		for (char ch : chs) {
			if(!list.contains(ch))
				list.add(ch);
		}
		
		for (char ch : list) {
			
		}
	}
}


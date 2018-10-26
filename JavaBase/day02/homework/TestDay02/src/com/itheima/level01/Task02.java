package com.itheima.level01;
/*
 * 键盘录入一个学生成绩(int类型),如果成绩大于等于60输出”及格”,如果成绩小于60输出”不及格”
 */

import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
		//1. 键盘输入一个int类型的数字，代表成绩
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//2. 使用三元运算符判断成绩是否为“及格”或“不及格”
		String result = (n>60)?"及格":"不及格";
		//3. 打印结果
		System.out.println("成绩是否及格：" + result);
	}
}

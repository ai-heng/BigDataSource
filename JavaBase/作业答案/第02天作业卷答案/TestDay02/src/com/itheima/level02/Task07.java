package com.itheima.level02;

import java.util.Scanner;

/*
 * 分析以下需求，并用代码实现：
	1.键盘录入一个整数给变量x，输出对应的变量y的值
	2.x值和y值的对应关系如下：
		x<0 y=-1
		x=0 y=0
		x>0 y=1
	3.如果用户输入的x的值为2，程序运行后打印格式"x=2,y=1"
	分析：
	1.创建键盘录入对象
	2.定义整型变量x用于接收键盘录入的整数
	3.定义整型变量y，并利用if语句进行逻辑判断根据x的值，给变量y进行赋值
	4.按照格式打印变量x和y的值
	注意：
		此题目从不同的角度分析，可以写出多种形式，以下只列出3中写法，同学们在学习的过程中要发散思维，
		尽量多写几种代码
		
		
 */
public class Task07 {
	public static void main(String[] args) {
//		method01();
//		method02();
		method03();
	}

	private static void method01() {
		// 1.创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		// 2.定义整型变量x用于接收键盘录入的整数
		int x = sc.nextInt();
		// 3.定义整型变量y，并利用if语句进行逻辑判断根据x的值，给变量y进行赋值
		int y = 0;
		if (x < 0)
			y = -1;
		if (x == 0)
			y = 0;
		if (x > 0)
			y = 1;
		// 4.按照格式打印变量x和y的值
		System.out.println("x=" + x + ",y=" + y);
	}
	private static void method02() {
		// 1.创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		// 2.定义整型变量x用于接收键盘录入的整数
		int x = sc.nextInt();
		// 3.定义整型变量y，并利用if语句进行逻辑判断根据x的值，给变量y进行赋值
		int y = 0;
		if (x < 0)
			y = -1;
		else if (x == 0)
			y = 0;
		else
			y = 1;
		// 4.按照格式打印变量x和y的值
		System.out.println("x=" + x + ",y=" + y);
	}
	private static void method03() {
		// 1.创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		// 2.定义整型变量x用于接收键盘录入的整数
		int x = sc.nextInt();
		// 3.定义整型变量y，并利用if语句进行逻辑判断根据x的值，给变量y进行赋值
		int y = 0;
		if (x < 0)
			y = -1;
		else if (x > 0)
			y = 1;
		// 4.按照格式打印变量x和y的值
		System.out.println("x=" + x + ",y=" + y);
	}
}

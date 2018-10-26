package com.itheima.level01;

import java.util.Scanner;

/*
 * 键盘录入一个int类型的数据,使用三元运算符判断这个数是奇数还是偶数
 */
public class Task01 {
	public static void main(String[] args) {
		//1.键盘输入一个int类型的数字
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//2.使用三元运算符判断这个数是奇数还是偶数
			// 数字%2==0
		String result = (n%2==0)?"偶数":"奇数";
		//3.打印结果
		System.out.println("数字"+n+"是：" + result);
	}
}

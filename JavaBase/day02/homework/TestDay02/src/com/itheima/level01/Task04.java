package com.itheima.level01;

import java.util.Scanner;

/*
 * 键盘录入一个长方形的长和宽(长和宽为int类型),计算长方形的面积和周长
 */

public class Task04 {
	public static void main(String[] args) {
		//1. 键盘输入长方形的长与宽
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();//长
		int width = sc.nextInt();//宽
		
		//2. 计算长方形的面积与周长
		// 面积 = 长 * 宽
		int area = length * width;
		// 周长 = (长 + 宽) * 2
		int c = (length + width) * 2;
		
		System.out.println("长方形的面积为："+ area +"，周长为" + c);
	}
}

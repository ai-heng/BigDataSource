package com.itheima.level02;

import java.util.Scanner;
/*
	1.小明左、右手中分别拿两张纸牌（比如：黑桃10和红桃8，数字10和8可通过键盘录入），要求编写代码交换小明手中的牌
	2.程序运行的结果如下：

	请输入小明左手中的纸牌：10
	请输入小明右手中的纸牌：8

	互换前小明手中的纸牌：
	左手中的纸牌：10
	右手中的纸牌：8

	互换后小明手中的纸牌：
	左手中的纸牌：8
	右手中的纸牌：10
	
	分析：
		1.创建键盘录入对象
		2.定义int类型的变量left和right，并通过nextInt()方法给left和right赋值
		3.定义临时变量temp实现left和right变量值得交换
		4.按格式打印交换后的结果

*/
public class Task01 {
	public static void main(String[] args) {		
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		//录入左手中的纸牌数字
		System.out.print("请输入小明左手中的纸牌：");
		int left = sc.nextInt();
		//录入右手中的纸牌数字
		System.out.print("请输入小明右手中的纸牌：");
		int right = sc.nextInt();
		//打印互换前的纸牌
		System.out.println();
		System.out.println("互换前小明手中的纸牌：");
		System.out.println("左手中的纸牌："+left);
		System.out.println("右手中的纸牌："+right);
		System.out.println();
		// 定义一个临时变量temp,保存left的值
		int temp = left;
		// 将right的值赋值给left
		left = right;
		// 将临时变量temp的值赋值给right 
		right = temp;
		// 打印交换后纸牌
		System.out.println("互换后小明手中的纸牌：");
		System.out.println("左手中的纸牌："+left);
		System.out.println("右手中的纸牌："+right);
	}
}

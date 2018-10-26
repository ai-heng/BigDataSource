package com.itheima.level02;

import java.util.Scanner;

/*
	某同学参加计算机大赛：
	如果获得第1名，将参加清华大学组织的1个月夏令营；
	如果或得第2名，将奖励联想笔记本电脑一部；
	如果获得第3名，将奖励移动硬盘一个；
	否则没有任何奖励；
	分析：（此题目采用if和switch都可以，在这里采用switch）
		1.创建键盘录入对象
		2.定义int类型的变量rank表示名次，并通过键盘录入赋值
		3.使用switch判断
			根据rank不同的值，打印不同的内容
			
 */
public class Task14 {
	public static void main(String[] args) {
//		1.创建键盘录入对象
		Scanner sc = new Scanner(System.in);
//		2.定义int类型的变量rank表示名次，并通过键盘录入赋值
		int rank = sc.nextInt();
//		3.使用switch判断
//			根据rank不同的值，打印不同的内容
		switch (rank) {
			case 1:
				System.out.println("参加清华大学组织的1个月夏令营");
				break;	
			case 2:
				System.out.println("奖励联想笔记本电脑一部");
				break;	
			case 3:
				System.out.println("奖励移动硬盘一个");
				break;	
			default:
				System.out.println("没有任何奖励");
				break;
		}
	}
}

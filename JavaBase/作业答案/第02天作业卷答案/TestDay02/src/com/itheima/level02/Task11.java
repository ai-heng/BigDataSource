package com.itheima.level02;

import java.util.Scanner;


/*
	学校举行运动会，百米赛跑成绩在10秒以内的学生有资格进决赛，根据性别分为男子组和女子组。
	分析：
		1.创建键盘录入对象
		2.定义double类型的变量score用于接收成绩，定义String类型的变量gender用于接收性别
		3.给score和gender赋值
		4.首先要判断是否能够进入决赛
		5.在确保进入决赛的情况下，再判断是进入男子组，还是进入女子组
 */
public class Task11 {
	public static void main(String[] args) {
//		1.创建键盘录入对象
		Scanner sc = new Scanner(System.in);
//		2.定义double类型的变量score用于接收成绩，定义String类型的变量gender用于接收性别
		double score;
		String gender;
//		3.给score和gender赋值
		System.out.print("请输入比赛成绩(s):");
		score = sc.nextDouble();
		System.out.print("请输入性别：");
		gender = sc.nextLine();
//		4.首先要判断是否能够进入决赛
		if(score <= 10) {
//		5.在确保进入决赛的情况下，再判断是进入男子组，还是进入女子组
			if(gender.equals("男")) {
				System.out.println("进入男子决赛组！");
			} else if(gender.equals("女")) {
				System.out.println("进入女子决赛组！");
			}
		} else {
			System.out.println("淘汰！");
		}
	}
}

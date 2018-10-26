package com.itheima.level02;

import java.util.Scanner;

/*
	分析一下需求，并用代码实现
	1.键盘录入学员张浩的3门课程(Java、SQL、Web)的成绩
	2.编写程序实现：
		(1)Java课程和SQL课程的分数只差
		(2)3门课程的平均分
		分析：
			1.创建键盘录入对象
			2.定义三个变量用于存储三门课程的成绩
			3.使用nextInt()方法给三门课程的变量赋值
			4.定义存储差值及平均值的变量
			5.求差值和平均值
			6.打印最终结果
 */
public class Task03 {
	public static void main(String[] args) {
//		1.创建键盘录入对象
		Scanner sc = new Scanner(System.in);
//		2.定义三个变量用于存储三门课程的成绩
		int java,sql,web;
//		3.使用nextInt()方法给三门课程的变量赋值
		System.out.print("请输入Java的成绩：");
		java = sc.nextInt();
		System.out.print("请输入SQL的成绩：");
		sql = sc.nextInt();
		System.out.print("请输入Web的成绩：");
		web = sc.nextInt();
//		4.定义存储差值及平均值的变量
		int diff;//差值
		double avg;//平均值
//		打印用户输入的成绩
		System.out.println("---------------------------");
		System.out.println("Java\tSQL\tWeb");
		System.out.println(java+"\t"+sql+"\t"+web);
		System.out.println("---------------------------");
		
//		5.求差值和平均值
		diff = java-sql;		//计算Java和SQL的成绩差
		avg = (java+sql+web)/3;	//计算平均分
		//		6.打印最终结果
		System.out.println("Java和SQL的成绩差："+diff);
		System.out.println("三门课的平均分是："+avg);
		
	}
}
package com.itheima.level02;

import java.util.Scanner;

/*
	循环录入某学生的5门课程的成绩并计算平均分。如果某分数录入为负，则停止录入并提示录入错误。
	分析：
		1.创建键盘录入对象
		2.定义int类型的变量sum(总分)和avg(平均分)，两个变量的初始值位0,String类型的变量name，表示学员姓名
		3.定义boolean类型的变量flag(表示该学生的5门成绩是否正确录入，如果有一个为负值，则负值为true，表示录入错误)，初始值为false
		4.利用for循环，录入5个成绩
			(1)判断当前的成绩如果小于0，flag赋值为true，终止for循环
			(2)否则，如果当前录入的成绩>=0,累加求和
		5.打印结果
			(1)如果flag为true，打印录入错误
			(2)否则如果flag为false，打印总分和平均分
 */
public class Task04 {
	public static void main(String[] args) {
//		1.创建键盘录入对象
		Scanner sc = new Scanner(System.in);
//		2.定义int类型的变量sum(总分)和double类型的变量avg(平均分)，两个变量的初始值位0,String类型的变量name，表示学员姓名
		int sum = 0;
		double avg = 0;
		String name;
//		3.定义boolean类型的变量flag(表示该学生的5门成绩是否正确录入，如果有一个为负值，则负值为true，表示录入错误)，初始值为false
		boolean flag = false;
		System.out.print("请输入学员姓名：");
		name = sc.nextLine();//录入学员姓名
//		4.利用for循环，录入5个成绩
		for(int i = 0;i < 5; i++) {
			System.out.print("请输入第"+(i+1)+"门课程的成绩： ");
			int score = sc.nextInt();
//			(1)判断当前的成绩如果小于0，flag赋值为true，终止for循环
			if(score < 0) {
				flag = true;
				break;
			}
//			(2)否则，如果当前录入的成绩>=0,累加求和
			sum = sum + score;
		}
//		5.打印结果
		if(flag) {
//			(1)如果flag为true，打印录入错误
			System.out.println("抱歉，分数录入错误，请重新进行录入！");
		} else {
			avg = (double)sum / 5;//计算平均分
//			(2)否则如果flag为false，打印总分和平均分
			System.out.println(name + "的平均分是：" + avg);
		}
	}
}

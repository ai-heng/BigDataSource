package com.itheima.level02;

import java.util.Scanner;

/*
	循环录入学员Java课程的成绩（学员数量由键盘录入），统计分数大于等于80分的学生的比例。
	分析：
		1.创建键盘录入对象
		2.定义int类型的变量score(学员成绩)、total(学员数量)、count(>=80分的学员数量)
		3.通过键盘录入操作给total变量赋值
		4.利用for循环(循环次数为total)，循环录入学员成绩
			(1)获取当前键盘录入的成绩
			(2)判断该成绩如果<80,continue继续进行下次录入
			(3)否则如果改成绩>=80,count++
		5.定义double类型的rate，并计算80分以上的比例，赋值给rate
		6.打印最终的 计算结果
 */
public class Task06 {
	public static void main(String[] args) {
//		1.创建键盘录入对象
		Scanner sc = new Scanner(System.in);
//		2.定义int类型的变量score(学员成绩)、total(学员数量)、count(>=80分的学员数量)
		int score = 0,total = 0,count = 0;
//		3.通过键盘录入操作给total变量赋值
		System.out.print("请输入班级总人数：");
		total = sc.nextInt();
//		4.利用for循环(循环次数为total)，循环录入学员成绩
		for(int i = 0; i < total;i++) {
//			(1)获取当前键盘录入的成绩
			System.out.print("请输入第"+(i+1)+"位学生的成绩：");
			score = sc.nextInt();
			if(score < 80) {
//			(2)判断该成绩如果<80,continue继续进行下次录入
				continue;
			}
//			(3)否则如果改成绩>=80,count++
			count++;
		}
//		5.定义double类型的rate，并计算80分以上的比例，赋值给rate
		System.out.println("总共有"+count+"位同学的成绩在80分以上");
		double rate = (double)count/total*100;
//		6.打印最终的 计算结果
		System.out.println("80分以上的学生所占的比例为：" + rate + "%");
	}
}

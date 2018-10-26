package com.itheima.level02;

import java.util.Scanner;

/*
 * 分析以下需求，并用代码实现：
	1.功能描述：模拟计算器功能，对键盘录入的两个int类型的数据进行加、减、乘、除的运算，并打印运算结果
	2.要求：
		(1)键盘录入三个整数,其中前两个整数代表参加运算的数据，
			第三个整数为要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算)
		(2)使用今天所学知识完成功能
		(3)演示格式如下:
			请输入第一个整数:30
			请输入第二个整数:40
			请输入您要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算):0
			控制台输出:30+40=70

 */
public class Task06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数据");
		int a = sc.nextInt();
		System.out.println("请输入第二个数据");
		int b = sc.nextInt();
		System.out.println("请输入您要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算):");
		int type = sc.nextInt();
		//定义变量用于接收结果
		double result = 0;
		switch(type) {
			case 0://做加法
				result = a + b;
				System.out.println(a+"+"+b+"="+result);
				break;
			case 1:
				result = a - b;
				System.out.println(a+"-"+b+"="+result);
				break;
			case 2:
				result = a * b;
				System.out.println(a+"*"+b+"="+result);
				break;
			case 3:
				result = a / (b + 0.0);
				System.out.println(a+"/"+b+"="+result);
				break;
			default:
				System.out.println("您输入有误");
		}
	}
}

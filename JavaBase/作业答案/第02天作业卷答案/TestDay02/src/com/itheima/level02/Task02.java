package com.itheima.level02;
import java.util.Scanner;

/*
	1.银行提供了整存争取定期储蓄业务，其存期分为一年、两年、三年、五年，到期凭存单支取本息
	2.利率表如下：
	
		存期				年利率 (%)
		一年				2.25
		两年				2.7
		三年				3.24
		五年				3.6
	3.打印格式：
		请输入本金：1000
		本金为：1000.0
		存取一年后的本息是：1022.5
		存取两年后的本息是：1027.0
		存取三年后的本息是：1032.4
		存取五年后的本息是：1036.0
		
	分析：
		1.创建键盘录入对象
		2.通过键盘录入本金并赋值给变量bj
		3.计算存不同年限的本息
		4.打印本息
 */
public class Task02 {
	public static void main(String[] args) {
//		1.创建键盘录入对象
		Scanner sc = new Scanner(System.in);
//		2.通过键盘录入本金并赋值给变量bj
		System.out.print("请输入本金：");
		double bj = sc.nextDouble();	//录入本金
		System.out.println("本金为："+bj);
//		3.计算存不同年限的本息
		double bx1 = bj + bj * 2.25 / 100;
		double bx2 = bj + bj * 2.7 / 100 * 2;
		double bx3 = bj + bj * 3.24 / 100 * 3;
		double bx5 = bj + bj * 3.6 / 100 * 5;
//		4.打印本息
		System.out.println("存取一年后的本息是：" + bx1);
		System.out.println("存取两年后的本息是：" + bx2);
		System.out.println("存取三年后的本息是：" + bx3);
		System.out.println("存取五年后的本息是：" + bx5);
	}
}


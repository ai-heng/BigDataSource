package com.itheima.level02;

import java.util.Scanner;

/*
	某人想买车，买什么车决定于此人在银行有多少存款(键盘录入)。
	如果此人的存款超过500万，则买雪铁龙DS9；
	否则，如果此人的存款超过100万，则买雪铁龙C6；
	否则，如果此人的存款超过50万，则买雪铁龙C5；
	否则，如果此人的存款超过10万，则买雪铁龙爱丽舍；
	否则此人买捷安特。
	分析：
		1.创建键盘录入对象
		2.定义int类型变量money，并通过nextInt()方法获取键盘录入的值赋值给变量money
		3.使用if-else 对money的值进行判断，并打印相关信息
 */
public class Task10 {
	public static void main(String[] args) {
//		1.创建键盘录入对象
		Scanner sc = new Scanner(System.in);
//		2.定义int类型变量money，并通过nextInt()方法获取键盘录入的值赋值给变量money
		int money = sc.nextInt();	//单位是万元
//		3.使用if-else 对money的值进行判断，并打印相关信息
		if(money >= 500) { 			//money>=500
			System.out.println("太好了，我可以买辆雪铁龙DS9");
		} else if(money >= 100) {	//money>=100 && money<500
			System.out.println("不错，我可以买辆雪铁龙C6");
		} else if(money >= 50) {	//money>=50 && money<100
			System.out.println("我可以买辆雪铁龙C5");
		} else if(money >= 10) {	//money>=10 && money<50
			System.out.println("至少我可以买辆雪铁龙爱丽舍");
		} else {					//money<10
			System.out.println("看来我只能买辆捷安特了");
		}
	}
}

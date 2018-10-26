package com.itheima.level02;

import java.util.Scanner;

/*
 * 分析以下需求，并用代码实现：			
	1.功能描述:键盘录入月份，输出对应的季节
	2.要求:
		(1)键盘录入一个整数(代表月份,范围1-12)
		(2)输出该月份对应的季节
			3,4,5春季
			6,7,8夏季
			9,10,11秋季
			12,1,2冬季
		(3)演示格式如下:
			请输入一个月份:3
			控制台输出:3月份是春季
 */
public class Task09 {
	public static void main(String[] args) {
		method01();
//		method02();
//		method03();
	}
	public static void method01(){
		Scanner sc = new Scanner(System.in);	//创建键盘录入对象
		System.out.println("请输入月份");
		int month = sc.nextInt();				//将键盘录入的结果存储在month
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println(month + "月是春季");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(month + "月是夏季");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(month + "月是秋季");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println(month + "月是冬季");
			break;
		default:
			System.out.println("对不起没有对应的季节");
			break;
		}
	}
	public static void method02(){
		Scanner sc = new Scanner(System.in);	//创建键盘录入对象
		System.out.println("请输入月份");
		int month = sc.nextInt();				//将键盘录入的结果存储在month
		
		//用if语句来完成月份对应季节方法一:
		if (month > 12 || month < 1) {
			System.out.println("对不起没有对应的季节");
		}else if (month >= 3 && month <= 5) {
			System.out.println(month + "月是春季");
		}else if (month >= 6 && month <= 8) {
			System.out.println(month + "月是夏季");
		}else if (month >= 9 && month <= 11) {
			System.out.println(month + "月是秋季");
		}else {
			System.out.println(month + "月是冬季");
		}
	}
	public static void method03(){
		Scanner sc = new Scanner(System.in);	//创建键盘录入对象
		System.out.println("请输入月份");
		int month = sc.nextInt();
		//用if语句来完成月份对应季节的方法二:		
        if(month>12 || month<1) {
			System.out.println("输入的数字不正确");
		} else if (month==3 || month==4 || month==4) {
			System.out.println("春季");
		} else if (month==6 || month==7 || month==8) {
			System.out.println("夏季");
		} else if (month==9 || month==10|| month==11) {
			System.out.println("秋季");
		} else {
			System.out.println("冬季");
		}	
	}
	
}



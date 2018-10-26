package com.itheima.level02;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
1.从键盘录入一个日期字符串,格式为 xxxx-xx-xx,代表该人的出生日期
2.利用人出生日期到当前日期所经过的毫秒值计算出这个人活了多少天
 */
public class Task01 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入出生日期：");
		String birthday = sc.nextLine(); // "1998-01-01"
		
		System.out.println("请输入今天日期：");
		// 今天日期
		String now = sc.nextLine(); // "2000-01-01";

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// 将字符串转换成日期对象
		Date d1 = sdf.parse(birthday);
		Date d2 = sdf.parse(now);

		// 将日期对象转换成long类型
		long l = d1.getTime();
		long l2 = d2.getTime();

		System.out.println((l2 - l) / 1000 / 60 / 60 / 24);
	}
}

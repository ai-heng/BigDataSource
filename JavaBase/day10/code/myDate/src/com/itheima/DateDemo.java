package com.itheima;

import java.util.Date;

/*
 * Date:Date表示特定的瞬间，精确到毫秒。
 * 
 * 构造方法：
 * 		Date():根据当前时间创建的日期对象
 * 		Date(long date):根据给定的毫秒值创建对象，从1970 年 1 月 1 日 00:00:00 
 */
public class DateDemo {
	public static void main(String[] args) {
		//Date()
		Date d = new Date();
		System.out.println(d);
		
		//Date(long date) 
		long date = 1000 * 60 * 60;
		Date dd = new Date(date);
		System.out.println(dd);
	}
}

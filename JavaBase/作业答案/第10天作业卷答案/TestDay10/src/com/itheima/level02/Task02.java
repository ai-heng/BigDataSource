package com.itheima.level02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
分析以下需求，并用代码实现
1.已知日期字符串:"2015-10-20",将改日期字符串转换为日期对象
2.将(1)中的日期对象转换为日历类的对象
3.根据日历对象获取改日期是星期几,以及这一年的第几天   
4.通过键盘录入日期字符串，格式(2015-10-20) 
	如输入：2015-10-20，输出"2015年-10月-20日 是 星期二，是2015年的 10 月 20 日"
 */
public class Task02 {
	public static void main(String[] args) throws ParseException {
		// 将字符串转换成日期对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入日期字符串,(格式为2015-10-20)：");
		String dateStr = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(dateStr);
		
		System.out.println("getDate() : " + date.getDate());
		System.out.println("getYear() : " + (date.getYear() + 1900));
		int day = date.getDate();
		int year = date.getYear() + 1900;
		String week = getWeek(date.getDay());
		int month = date.getMonth()+1;
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年-MM月-dd日");
		String newDate = sdf2.format(date);
		System.out.println(newDate + " 是 " + week + "，是" + year + "年的 " + month + " 月" + day + " 日");
	}

	// 获取日历中的星期
	private static String getWeek(int week) {
		if (week > 7 || week < 1) {
			// throw new RunTimeException();
			System.out.println("星期传递有误");
			return null;
		}
		String[] arr = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
		return arr[week];
	}
}

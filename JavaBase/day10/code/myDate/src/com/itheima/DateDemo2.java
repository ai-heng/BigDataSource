package com.itheima;

import java.util.Date;

/*
 * public long getTime():获取的是毫秒值。从1970年1月1日 00:00:00开始的。
 * public void setTime(long time):设置时间，给的是毫秒值。
 * 
 * 从Date得到一个毫秒值：
 * 		getTime()
 * 
 * 从一个毫秒值得到一个Date对象
 * 		构造方法
 * 		setTime(long time)
 */
public class DateDemo2 {
	public static void main(String[] args) {
		//创建对象
		Date d = new Date();
		
		//public long getTime()
		System.out.println(d.getTime());
		
		//public void setTime(long time)
		d.setTime(1000*60*60);
		System.out.println(d.getTime());
	}
}

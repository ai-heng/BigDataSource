package com.itheima;

import java.util.Date;

/*
 * Date:Date��ʾ�ض���˲�䣬��ȷ�����롣
 * 
 * ���췽����
 * 		Date():���ݵ�ǰʱ�䴴�������ڶ���
 * 		Date(long date):���ݸ����ĺ���ֵ�������󣬴�1970 �� 1 �� 1 �� 00:00:00 
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

package com.itheima_01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * SimpleDateFormat:��һ���������Ի����йصķ�ʽ����ʽ���ͽ������ڵľ����ࡣ
 * ��������и�ʽ�������� -> �ı������������ı� -> ���ڣ�
 * 
 * ��ʽ�������� -> �ı���: Date -- String
 * 		public final String format(Date date)
 * 
 * �������ı� -> ���ڣ�:  String -- Date
 * 		public Date parse(String source)
 */
public class SimpleDateFormatDemo {
	public static void main(String[] args) throws ParseException {
		/*
		//Date -- String
		Date d = new Date();
		//SimpleDateFormat(): ��Ĭ�ϵ�ģʽ
		//SimpleDateFormat sdf = new SimpleDateFormat();
		//SimpleDateFormat(String pattern):�ø�����ģʽ
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		String s = sdf.format(d);
		//������Ȼʵ���˰����ڸ�ʽ����һ���ַ��������ǲ���������Ҫ�ĸ�ʽ
		//������Ҫ�ĸ�ʽ�ǣ�xxxx��xx��xx�� xx:xx:xx
		System.out.println(s);
		*/
		
		//String -- Date
		String str = "2080-08-08 12:23:45";
		//��һ���ַ�������Ϊ���ڵ�ʱ����ע��ģʽ�ַ����͸����������ַ����ĸ�ʽҪƥ��
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = sdf.parse(str);
		System.out.println(d);
	}
}

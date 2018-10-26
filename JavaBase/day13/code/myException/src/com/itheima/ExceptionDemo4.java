package com.itheima;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Java�е��쳣����Ϊ�����ࣺ����ʱ�쳣������ʱ�쳣��
 * ���е�RuntimeException�༰�������ʵ������Ϊ����ʱ�쳣���������쳣���Ǳ���ʱ�쳣
 * 
 * ����ʱ�쳣��Java���������ʾ�����������ͻᷢ�������һ����ʾ���޷�ͨ������
 * ����ʱ�쳣��Java����������ʾ����Ҳ���Ժͱ���ʱ�쳣һ������
 */
public class ExceptionDemo4 {
	public static void main(String[] args) {
		System.out.println("����ʼִ��");
		//method();
		method2();
		System.out.println("�������ִ��");
	}
	
	//����ʱ�쳣ParseException
	public static void method() {
		try{
			//String s = "2088-08-08";
			String s = "abcd";
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date d = sdf.parse(s);
			System.out.println(d);
		}catch(ParseException e) {
			e.printStackTrace();
		}
	}
	
	//����ʱ�쳣
	public static void method2() {
		try{
			int a = 10;
			int b = 0;
			System.out.println(a/b);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}
}

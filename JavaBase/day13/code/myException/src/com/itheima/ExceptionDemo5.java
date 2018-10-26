package com.itheima;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * �쳣������2��throws
 * 
 * ����ͨ��try...catch���Զ��쳣���д����ˣ����ǲ��������е�ʱ�����Ƕ���Ȩ�޽����쳣�Ĵ���
 * Ҳ����˵����Щʱ�����Ǵ����ˣ����ǣ����ʱ���쳣ʱ���ڵģ�������Ҳ���У���ô��?
 * ���ʱ��Java���ṩ��throws�Ĵ�������
 * 
 * ��ʽ��
 * 		throws �쳣����
 * 		ע�⣺�����ʽ������ڷ��������ŵĺ���
 * 
 * ע�⣺
 * 		����ʱ�쳣ʱ����Ҫ���д���ģ����ִ�������try...catch...����throws
 * 		����������throws���ַ���������˭���ã����ý��д���
 * 
 * 		����ʱ�쳣���Բ��ô������������������Ҫ�����޸Ĵ��롣
 */
public class ExceptionDemo5 {
	public static void main(String[] args) {
		System.out.println("����ʼִ��");
		try {
			method();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		method2();
		System.out.println("�������ִ��");
	}
	
	//����ʱ�쳣
	public static void method() throws ParseException {
		String s = "2088-08-08";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d = sdf.parse(s);
		System.out.println(d);
	}
	
	//����ʱ�쳣
	public static void method2() throws ArithmeticException {
		int a = 10;
		int b = 0;
		System.out.println(a/b);
	}
	
}

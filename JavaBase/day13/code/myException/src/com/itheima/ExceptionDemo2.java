package com.itheima;
/*
 * �쳣��Ĭ�ϴ���ʽ
 * 
 * java.lang.ArithmeticException:�쳣����������������
 * / by zero:�쳣��ԭ�򣬱�0��
 * at com.itheima.ExceptionDemo2.method(ExceptionDemo2.java:17):�쳣��λ��
 * 
 * ���������������⣬����û�����κεĴ�������JVM������Ĭ�ϵĴ���
 * ��������
 * 		A:���쳣�����ƣ��쳣��ԭ���쳣���ֵ�λ�õ���Ϣ�ڿ���̨���
 * 		B:�ó���ִֹͣ��
 */
public class ExceptionDemo2 {
	public static void main(String[] args) {
		System.out.println("����ʼִ��");
		method();
		System.out.println("�������ִ��");
	}
	
	public static void method() {
		int a = 10;
		int b = 0;
		System.out.println(a/b);
	}
}

package com.itheima_02;
/*
 * String�ഴ��������ص㣺
 * 		A:ͨ�����췽����������
 * 		B:ͨ��ֱ�Ӹ�ֵ�ķ�ʽ��������
 * �����ַ�ʽ�Ĵ�����������ġ�
 * ͨ�����췽���������ַ����������ڶ��ڴ档
 * ͨ��ֱ�Ӹ�ֵ�ķ�ʽ�������ַ����������ڷ������ĳ����ء�
 */
public class StringDemo {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = new String("hello");
		
		String s3 = "hello";
		String s4 = "hello";
		
		System.out.println(s1 == s2);//false
		System.out.println(s1 == s3);//false
		System.out.println(s3 == s4);//true
	}
}

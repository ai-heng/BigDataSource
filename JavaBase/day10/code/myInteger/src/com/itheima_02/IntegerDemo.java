package com.itheima_02;
/*
 * Integer:Integer���ڶ����а�װ��һ���������� int ��ֵ��
 * 
 * ���췽����
 * 		Integer(int value) 
 * 		Integer(String s) 
 * 			ע�⣺����ַ��������������ַ����
 */
public class IntegerDemo {
	public static void main(String[] args) {
		//Integer(int value) 
		int value = 100;
		Integer i = new Integer(value);
		System.out.println(i); //100
		System.out.println("------------");
		
		//Integer(String s) 
		String s = "100";
		//NumberFormatException:���ݸ�ʽ���쳣
		//String s = "abc";
		Integer ii = new Integer(s);
		System.out.println(ii);
	}
}

package com.itheima_01;
/*
 * String�������ַ����ࡣ
 * 		�ɶ���ַ���ɵ�һ�����ݡ�
 * 		�ַ����ı��ʾ���һ���ַ����顣		
 * 
 * ���췽����
 * 		String(String original):���ַ������ݷ�װ���ַ�������
 * 		String(char[] value):���ַ���������ݷ�װ���ַ�������
 * 		String(char[] value, int index, int count):���ַ������һ�������ݷ�װ���ַ�������
 * 
 * public String toString():���ش˶��������Ѿ���һ���ַ��������� 
 */
public class StringDemo {
	public static void main(String[] args) {
		//String(String original):���ַ������ݷ�װ���ַ�������
		String s1 = new String("hello");
		System.out.println(s1);
		System.out.println("----------");
		
		//String(char[] value):���ַ���������ݷ�װ���ַ�������
		char[] value = {'h','e','l','l','o'};
		String s2 = new String(value);
		System.out.println(s2);
		System.out.println("----------");
		
		//String(char[] value, int index, int count):���ַ������һ�������ݷ�װ���ַ�������
		//String s3 = new String(value,0,value.length);
		String s3 = new String(value,0,3);
		System.out.println(s3);
		System.out.println("----------");
		
		//��õ�
		String s4 = "hello";
		System.out.println(s4);
	}
}

package com.itheima_03;
/*
 * ���󣺱����ַ���(��ȡ�ַ����е�ÿһ���ַ�)
 */
public class StringTest2 {
	public static void main(String[] args) {
		//Ҫ�����ַ����������ȵ���һ���ַ���
		String s = "abcde";
		
		//˼������λ�ȡ�ַ����е�ÿһ���ַ�
		//�������������ṩ����������Ӧ���ṩһ��������������ָ��λ�õ��ַ��ķ���
		//����ֵ��char
		//��ʽ������int index
		//public char charAt(int index):����ָ����������ֵ
		//ԭʼ����
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(4));
		System.out.println("-------------------");
		
		//��forѭ���Ľ�
		for(int x=0; x<5; x++) {
			System.out.println(s.charAt(x));
		}
		System.out.println("-------------------");
		
		//Ŀǰforѭ���е�����5�������������ģ���ô�ַ�����û���ṩһ�����������ڻ�ȡ�ַ������ַ��ĸ�����?
		//public int length():�����ַ����е��ַ��������ַ����ĳ���
		for(int x=0; x<s.length(); x++) {
			System.out.println(s.charAt(x));
		}
	}
}

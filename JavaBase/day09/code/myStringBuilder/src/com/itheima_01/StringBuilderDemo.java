package com.itheima_01;
/*
 * StringBuilder:��һ���ɱ���ַ����ࡣ
 * 
 * String��StringBuilder������
 * 		String�������ǹ̶��ġ�
 * 		StringBuilder�������ǿɱ�ġ�
 * 
 * ���췽��
 * public StringBuilder()
 * public StringBuilder(String str)
 * 
 * public String toString():���ش����������ݵ��ַ�����ʾ��ʽ��
 */
public class StringBuilderDemo {
	public static void main(String[] args) {
		//public StringBuilder()
		StringBuilder sb = new StringBuilder();
		System.out.println("sb:"+sb);
		System.out.println(sb.length());
		System.out.println("----------------");
		
		//public StringBuilder(String str)
		StringBuilder sb2 = new StringBuilder("helloworld");
		System.out.println("sb2:"+sb2);
		System.out.println(sb2.length());
	}
}

package com.itheima.level01;

import java.util.Scanner;

/*
 * ���ַ�����ת
 * ����������¼�롱abc��		
 * ����������cba��
 * 
 * ������
 * 		A:����¼��һ���ַ�������
 * 		B:д����ʵ���ַ������ݵķ�ת
 * 			String -- StringBuilder -- reverse() -- String
 * 		C:���÷���
 * 		D:������
 */
public class Task06 {
	public static void main(String[] args) {
		//����¼��һ���ַ�������
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String s = sc.nextLine();
		
		//д����ʵ���ַ������ݵķ�ת
		
		//���÷���
		String result = myReverse(s);
		
		//������
		System.out.println("result:"+result);
		
	}
	
	/*
	 * ������ȷ��
	 * 		����ֵ���ͣ�String
	 * 		�����б�String s
	 */
	public static String myReverse(String s) {
		//String -- StringBuilder -- reverse() -- String
		/*
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		String ss = sb.toString();
		return ss;
		*/
		return new StringBuilder(s).reverse().toString();
	}
}

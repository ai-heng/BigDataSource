package com.itheima_03;

import java.util.Scanner;

/*
 * �����ַ�����ת
 * ����������¼�롱abc��		
 * ����������cba��
 * 
 * ������
 * 		A:����¼���ַ�������
 * 		B:д����ʵ���ַ������ݵķ�ת
 * 			���ַ������ű������ڰ�ÿһ���õ����ַ�ƴ�ӳ�һ���ַ���
 * 		C:���÷���
 * 		D:������
 */
public class StringTest4 {
	public static void main(String[] args) {
		//����¼���ַ�������
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String s = sc.nextLine();
		
		//д����ʵ���ַ������ݵķ�ת
		
		//���÷���
		String result = reverse(s);
		
		//������
		System.out.println("result:"+result);
	}
	
	/*
	 * ������ȷ��
	 * 		����ֵ���ͣ�String
	 * 		�����б�String s
	 */
	public static String reverse(String s) {
		//���ַ������ű������ڰ�ÿһ���õ����ַ�ƴ�ӳ�һ���ַ���
		String ss = "";
		
		for(int x=s.length()-1; x>=0; x--) {
			ss += s.charAt(x);
		}
		
		return ss;
	}
}

package com.itheima;
/*
 * forѭ�����ĸ�ʽ��
 * 		for(��ʼ�����;�ж��������;�����������) {
 * 			ѭ�������;
 * 		}
 * 
 * ִ�����̣�
 * 		A:ִ�г�ʼ�����
 * 		B:ִ���ж�������䣬��������true����false
 * 			�����false���ͽ���ѭ��
 * 			�����true���ͼ���ִ��
 * 		C:ִ��ѭ�������
 * 		D:ִ�п����������
 * 		E:�ص�B����
 */
public class ForDemo {
	public static void main(String[] args) {
		//�����ڿ���̨���5��HelloWorld
		
		//ԭʼ����
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		System.out.println("----------");
		
		//��forѭ���Ľ�
		for(int x=1; x<=5; x++) {
			System.out.println("HelloWorld");
		}
	}
}

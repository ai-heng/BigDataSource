package com.itheima;
/*
 * whileѭ��������ʽ��
 * 		while(�ж��������) {
 * 			ѭ�������;
 * 		}
 * 
 * ������ʽ��
 * 		��ʼ�����;
 * 		while(�ж��������) {
 * 			ѭ�������;
 * 			�����������;
 * 		}
 * 
 * �ع�forѭ��������ʽ��
 * 		for(��ʼ�����;�ж��������;�����������) {
 * 			ѭ�������;
 * 		}
 */
public class WhileDemo {
	public static void main(String[] args) {
		//�ڿ���̨���5��HelloWorld
		//forѭ��ʵ��
		/*
		for(int x=1; x<=5; x++) {
			System.out.println("HelloWorld");
		}
		System.out.println("--------------");
		*/
		
		//whileѭ��ʵ��
		int x=1;
		while(x<=5) {
			System.out.println("HelloWorld");
			x++;
		}
	}
}

package com.itheima;
/*
 * break:�жϵ���˼
 * 
 * ʹ�ó�����
 * 		A:switch����У����ڽ���switch���
 * 		B:ѭ������У����ڽ���ѭ��
 * ���ʹ�ã�
 * 		A:��������ѭ��
 * 		B:�������ѭ��
 * 			�ô���ǩ������ʽ��
 */
public class BreakDemo {
	public static void main(String[] args) {
		//break�������ڽ�����ǰ��ѭ����
		for(int x=1; x<=5; x++) {
			if(x == 3) {
				break;
			}
			System.out.println("HelloWorld");
		}
		System.out.println("-----------------------");
		
		//����Ƕ��ѭ����break���׽��������ĸ�ѭ����?
		//break������������������Ǹ�ѭ��
		//�����Ҫ�������ѭ�����ɲ�������?
		//���ԡ����ʵ����?
		//����ǩ����䣺
		//��ʽ����ǩ��:���
		wc:for(int x=1; x<=3; x++) {
			nc:for(int y=1; y<=4; y++) {
				if(y == 2) {
					break wc;
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

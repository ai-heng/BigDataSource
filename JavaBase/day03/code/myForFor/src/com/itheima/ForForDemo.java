package com.itheima;
/*
 * ���������һ��4��5�е�����(*)ͼ����
 * �����
 * 		*****
 * 		*****
 * 		*****
 * 		*****
 * 
 * ѭ��Ƕ�ף�����ѭ������䱾����һ��ѭ����䡣
 * 
 * ���ۣ�
 * 		��ѭ�����Ƶ����У���ѭ�����Ƶ�����
 */
public class ForForDemo {
	public static void main(String[] args) {
		//ԭʼ������
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("-------------------");
		
		//��Ȼ�����������Ŀ��Ҫ�󣬵��ǲ���
		//���������кܶ�������Ҫ�󣬶����к����Ǳ仯��
		//��������Ҫ�Ľ�Ŀǰ�Ĵ����д��
		//��Ҫ��һ�������һ��*
		//System.out.println("*");
		//��Ҫ��һ�������5��*
		/*
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		*/
		//֮���Գ��������Ľ��������ΪSystem.out.println()ÿ�ΰ�����������һ������
		//�н��������?��
		//��System.out.print()�Ϳ��Խ��
		/*
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		*/
		
		/*
		//��ѭ���Ľ�����
		for(int x=1; x<=5; x++) {
			System.out.print("*");
		}
		//������������ݾͿ���ʵ�ֻ���
		System.out.println();
		
		//�ڶ��е�5��*
		for(int x=1; x<=5; x++) {
			System.out.print("*");
		}
		System.out.println();
		
		//�����е�5��*
		for(int x=1; x<=5; x++) {
			System.out.print("*");
		}
		System.out.println();
		
		//�����е�5��*
		for(int x=1; x<=5; x++) {
			System.out.print("*");
		}
		System.out.println();
		*/
		//�ظ��Ĵ���ִ�ж�Σ���ѭ���Ľ�
		for(int y=1; y<=4; y++) {
			for(int x=1; x<=5; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------------");
		
		for(int y=1; y<=7; y++) {
			for(int x=1; x<=8; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

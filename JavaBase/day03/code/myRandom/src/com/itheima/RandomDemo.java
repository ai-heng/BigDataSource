package com.itheima;

import java.util.Random;

/*
 * Random:���ڲ�����������ࡣ�÷���Scanner���ơ�
 * 
 * ʹ�ò��裺
 * 		A:����
 * 			import java.util.Random;
 * 		B:��������
 * 			Random r = new Random();
 * 		C:��ȡ�����
 * 			int number = r.nextInt(10);
 * 			��ȡ�ķ�Χ��[0,10)	����0��������10
 */
public class RandomDemo {
	public static void main(String[] args) {
		//��������
		Random r = new Random();
		
		for(int x=1; x<=10; x++) {
			//��ȡ�����
			int number = r.nextInt(10);
			System.out.println("number:"+number);
		}
		System.out.println("--------------");
		
		//��λ�ȡһ��1-100֮����������?
		int i = r.nextInt(100)+1;
		System.out.println(i);
	}
}

package com.itheima.level01;

import java.util.Random;
import java.util.Scanner;

/*
 * ���󣺲�����С��Ϸ��
 * 		ϵͳ����һ��1-100֮������������³���������Ƕ���?
 * 
 * ������
 * 		A:ϵͳ����һ��1-100֮��������
 * 			Random r = new Random();
 * 			int number = r.nextInt(100)+1;
 * 		B:����¼������Ҫ�µ�����
 * 		C:�Ƚ����������ݣ������ǲµ��Ƿ���ȷ
 * 			������ˣ���ʾ����µ����ݴ���
 * 			���С�ˣ���ʾ����µ�����С��
 * 			�����ȣ���ʾ����ϲ�㣬������
 * 		D:Ϊ��ʵ�ֶ�β����ݣ����Ǿ�Ҫ����ѭ�����������ֲ�֪���¶��ٴ����С���ô����?
 * 			��ѭ����while(true) {...}
 * 				 for(;;) {...}
 */
public class Task06 {
	public static void main(String[] args) {
		//ϵͳ����һ��1-100֮��������
		Random r = new Random();
		//��ȡ�����
		int number = r.nextInt(100)+1;
		
		//��β�����
		while(true) {
			//��������¼�����
			Scanner sc = new Scanner(System.in);
			//������ʾ
			System.out.println("��������Ҫ�µ�����(1-100)��");
			int guessNumber = sc.nextInt();
			
			//�Ƚ����������ݣ������ǲµ��Ƿ���ȷ
			if(guessNumber > number) {
				System.out.println("��µ�����"+guessNumber+"����");
			}else if(guessNumber < number) {
				System.out.println("��µ�����"+guessNumber+"С��");
			}else {
				System.out.println("��ϲ�㣬������");
				break; //����ѭ��
			}
		}
	}
}

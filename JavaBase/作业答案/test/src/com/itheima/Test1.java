package com.itheima;

import java.util.Scanner;

/*
 * ������
 * 	1���۲췢����Ҫ��ӡ��ͼ����һ�������Σ���Ҫforѭ����Ƕ��
 *  2�������ɼ���¼�룬ÿ����Ҫ��ӡ������ǡ�õ��ڸ��е�����
 *  3����ӡ�����������ε����ģ���Ҫ����һ��������ÿ��ӡһ�Σ���������1
 */
public class Test1 {

	public static void main(String[] args) {
		// ����¼��
		Scanner sc = new Scanner(System.in);
		// ��������
		System.out.println("��������������Χ1-10��");
		int line = sc.nextInt();
		// ��Ҫ��ӡ������
		int num = 1;
		// ѭ��Ƕ��
		for (int i = 0; i < line; i++) { // ����
			// ÿ�д�ӡ�ĸ���
			for (int j = 0; j <= i; j++) {
				// ��ӡ���ݣ�ע�����
				System.out.print(num++ + "\t"); // ת���ַ�
			}
			// ÿ�д�ӡ��ɣ���ӡһ������
			System.out.println();
		}
		
		sc.close();
	}
}

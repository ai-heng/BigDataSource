package com.itheima;

import java.util.Scanner;

/*
 * Scanner:���ڻ�ȡ����¼�����ݡ�(�����������ͣ��ַ�������)
 * public String nextLine()����ȡ����¼���ַ�������
 */
public class ScannerDemo {
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		//��������
		System.out.println("������һ���ַ������ݣ�");
		String line = sc.nextLine();
		
		//������
		System.out.println("line:"+line);
	}
}

package com.itheima.level02;

import java.util.ArrayList;
import java.util.Scanner;

/*
���̶�ȡһ������,ȥ�������ظ��ַ�, ��ӡ����ͬ����Щ�ַ�
˼·��
1������¼���ַ���
2�������ַ�������ÿ���ַ��洢��������
3�� ���������ظ����ַ�ȥ��
4�� �����¼��ϣ������ϼ��ϣ���ȡ�ϼ����е�Ԫ�أ��ж��¼������Ƿ�������Ԫ��
	����������������Ԫ����ӵ��¼�����
5�� ����ϼ�����Ԫ��
6�� ���¼����е�Ԫ����ӵ��ϼ�����
7�������ϼ���
 */
public class Task02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String s = sc.nextLine();
		
		ArrayList<Character> list = new ArrayList<>();
		
		char[] chs = s.toCharArray();
		for (char ch : chs) {
			if(!list.contains(ch))
				list.add(ch);
		}
		
		for (char ch : list) {
			
		}
	}
}


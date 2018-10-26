package com.itheima.level02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
�����������󣬲��ô���ʵ��
1.��֪�����ַ���:"2015-10-20",���������ַ���ת��Ϊ���ڶ���
2.��(1)�е����ڶ���ת��Ϊ������Ķ���
3.�������������ȡ�����������ڼ�,�Լ���һ��ĵڼ���   
4.ͨ������¼�������ַ�������ʽ(2015-10-20) 
	�����룺2015-10-20�����"2015��-10��-20�� �� ���ڶ�����2015��� 10 �� 20 ��"
 */
public class Task02 {
	public static void main(String[] args) throws ParseException {
		// ���ַ���ת�������ڶ���
		Scanner sc = new Scanner(System.in);
		System.out.println("�����������ַ���,(��ʽΪ2015-10-20)��");
		String dateStr = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(dateStr);
		
		System.out.println("getDate() : " + date.getDate());
		System.out.println("getYear() : " + (date.getYear() + 1900));
		int day = date.getDate();
		int year = date.getYear() + 1900;
		String week = getWeek(date.getDay());
		int month = date.getMonth()+1;
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy��-MM��-dd��");
		String newDate = sdf2.format(date);
		System.out.println(newDate + " �� " + week + "����" + year + "��� " + month + " ��" + day + " ��");
	}

	// ��ȡ�����е�����
	private static String getWeek(int week) {
		if (week > 7 || week < 1) {
			// throw new RunTimeException();
			System.out.println("���ڴ�������");
			return null;
		}
		String[] arr = { "������", "����һ", "���ڶ�", "������", "������", "������", "������" };
		return arr[week];
	}
}

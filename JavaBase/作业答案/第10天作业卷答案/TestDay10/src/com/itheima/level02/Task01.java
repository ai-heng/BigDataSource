package com.itheima.level02;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
1.�Ӽ���¼��һ�������ַ���,��ʽΪ xxxx-xx-xx,������˵ĳ�������
2.�����˳������ڵ���ǰ�����������ĺ���ֵ���������˻��˶�����
 */
public class Task01 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("������������ڣ�");
		String birthday = sc.nextLine(); // "1998-01-01"
		
		System.out.println("������������ڣ�");
		// ��������
		String now = sc.nextLine(); // "2000-01-01";

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// ���ַ���ת�������ڶ���
		Date d1 = sdf.parse(birthday);
		Date d2 = sdf.parse(now);

		// �����ڶ���ת����long����
		long l = d1.getTime();
		long l2 = d2.getTime();

		System.out.println((l2 - l) / 1000 / 60 / 60 / 24);
	}
}

package com.itheima.level02;

import java.util.ArrayList;
import java.util.Random;

/*
1.����10��1-20֮��������Ҫ������������ظ�
2.����10������Ϊ10�Ĳ����ظ����ַ���(����ֻ�ܳ��ִ�д��ĸ��Сд��ĸ��0-9������)����������ӡ���
 */
public class Task03 {
	public static void main(String[] args) {
		// ��ȡ�ַ���������Ϊ��д��ĸ+Сд��ĸ+����
		String s = "";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= 9; i++) {
			sb.append(i);
		}
		for (int i = 97; i <= 122; i++) {
			sb.append((char) i);
		}
		for (int i = 65; i <= 90; i++) {
			sb.append((char) i);
		}
		s = sb.toString();
		System.out.println(s);

		// �������������
		Random r = new Random();
		// ��������������
		StringBuilder sb2 = new StringBuilder();

		// �������϶������ڴ洢���ظ����ַ���
		ArrayList<String> list = new ArrayList<>();
		// ������ϳ��Ȳ���10����ô�ͼ�������������ַ���
		while (list.size() < 10) {
			// ѭ����������Ϊ10���ַ���
			for (int i = 0; i < 10; i++) {
				int random = r.nextInt(62);
				sb2.append(s.charAt(random));
			}
			// �жϼ������Ƿ����ָ�����ַ���
			if (!list.contains(sb2.toString())) {
				// ����������������������ַ���
				list.add(sb2.toString());
			}
			// ��ջ�������Ϊ���´μ��������µ��ַ���
			sb2.delete(0, sb2.length());
		}

		System.out.println(list);
	}

}

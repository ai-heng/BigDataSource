package com.itheima.level02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
1.���ü���¼�룬����һ���ַ���
2.ͳ�Ƹ��ַ����и����ַ�������(��ʾ:�ַ���������)
3.�磺
	�û������ַ���"If~you-want~to~change-your_fate_I_think~you~must~come-to-the-dark-horse-to-learn-java"
	������������-(9)I(2)_(3)a(7)c(2)d(1)e(6)f(2)g(1)h(4)i(1)j(1)k(2)l(1)m(2)n(4)o(8)r(4)s(2)t(8)u(4)v(1)w(1)y(3)~(6)
	
�ַ� --- ����

˼·��
1������map���ϣ���ΪCharacter��ֵΪInteger
2������¼���ַ��� str
3�� ���ַ���ת��Ϊ�ַ����飬����������ַ����飬��ȡÿ���ַ�
4�� ��ѭ�����жϼ�����map�����еļ��Ƿ��������ַ������map�����еļ���������
	���ַ�����ô����mapִ��put�����������Ǳ��������ַ���ֵΪ1
	���map�����а��������������map���ϵ�ֵ + 1�洢
5�� ѭ����Ϻ󣬱���map���Ͻ��д�ӡ����ӡ�����а���ָ����ʽ�����С�
 */
public class Task04 {
	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String str = sc.nextLine();
		
		char[] chs = str.toCharArray();
		for (char ch : chs) {
			/*if(map.containsKey(ch))
				map.put(ch, map.get(ch) + 1);
			else 
				map.put(ch, 1);*/
			map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
		}
		
		// ����map����
		for(Map.Entry<Character, Integer> entry : map.entrySet()){
			System.out.println(entry.getKey() + "(" + entry.getValue() + ")");
		}
	}
}


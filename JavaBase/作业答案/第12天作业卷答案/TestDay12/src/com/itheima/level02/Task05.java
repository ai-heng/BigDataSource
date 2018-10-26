package com.itheima.level02;

import java.util.HashMap;
import java.util.Map;

/*
1.ͳ��ÿ�����ʳ��ֵĴ���
2.�������ַ���"If you want to change your fate I think you must come to the dark horse to learn java"(�ÿո���)
3.��ӡ��ʽ��
	to=3
	think=1
	you=2
	//........	
*/
public class Task05 {
	public static void main(String[] args) {
		String s = "If you want to change your fate I think you must come to the dark horse to learn java";
		String[] arr = s.split(" ");

		Map<String, Integer> map = new HashMap<>();

		for (String s1 : arr) {
			map.put(s1, map.containsKey(s1) ? map.get(s1) + 1 : 1);
		}

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
	}
}

package com.itheima_01;

import java.util.HashSet;
import java.util.Set;

/*
 * Set:
 * 		һ���������ظ�Ԫ�ص� collection
 * 
 * HashSet:
 * 		������֤ set �ĵ���˳���ر���������֤��˳���ò���
 */
public class SetDemo {
	public static void main(String[] args) {
		//�������϶���
		Set<String> set = new HashSet<String>();
		
		//���Ԫ��
		set.add("hello");
		set.add("world");
		set.add("java");
		//Ψһ
		set.add("world");
		
		//��������
		for(String s : set) {
			System.out.println(s);
		}
		
	}
}

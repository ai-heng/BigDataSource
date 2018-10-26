package com.itheima.level01;

import java.util.HashMap;
import java.util.Set;

/*
 * ��ѡһ�ַ�ʽ����
 * HashMap<Student,String>
 * ����Student ѧ������
 * ֵ��String ѧ��סַ
 * Ҫ�����ѧ������ĳ�Ա����ֵ��ͬ����˵����ͬһ������
 */
public class Task03 {
	public static void main(String[] args) {
		// �������϶���
		HashMap<Student, String> hm = new HashMap<Student, String>();

		// ����Ԫ�ض���
		Student s1 = new Student("����ϼ", 30);
		Student s2 = new Student("������", 35);
		Student s3 = new Student("������", 33);
		Student s4 = new Student("������", 35);

		// ���Ԫ�ص�������
		hm.put(s1, "����");
		hm.put(s2, "�Ϻ�");
		hm.put(s3, "����");
		hm.put(s4, "���");

		// ����ֵ
		Set<Student> set = hm.keySet();
		for (Student key : set) {
			String value = hm.get(key);
			System.out.println(key.getName() + "---" + key.getAge() + "---" + value);
		}
	}
}

package com.itheima_03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * ��ϰ1�����ַ�ʽ����
 * HashMap<String,Student>
 * ����String ѧ��
 * ֵ��Student ѧ������
 */
public class HashMapTest {
	public static void main(String[] args) {
		// �������϶���
		HashMap<String, Student> hm = new HashMap<String, Student>();

		// ����Ԫ�ض���
		Student s1 = new Student("����ϼ", 30);
		Student s2 = new Student("������", 35);
		Student s3 = new Student("������", 33);

		// ���Ԫ�ص�������
		hm.put("it001", s1);
		hm.put("it002", s2);
		hm.put("it003", s3);

		// ����
		// ���ݼ���ֵ
		Set<String> set = hm.keySet();
		for (String key : set) {
			Student value = hm.get(key);
			System.out.println(key + "---" + value.getName() + "---" + value.getAge());
		}
		System.out.println("---------------------");

		// ���ݼ�ֵ�Զ����Ҽ���ֵ
		Set<Map.Entry<String, Student>> set2 = hm.entrySet();
		for (Map.Entry<String, Student> me : set2) {
			String key = me.getKey();
			Student value = me.getValue();
			System.out.println(key + "---" + value.getName() + "---" + value.getAge());
		}
	}
}

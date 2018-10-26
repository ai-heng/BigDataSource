package com.itheima.tests;

import java.util.ArrayList;

/*
 * ����һ��Person�ࡣ
		���ԣ�����name,����age
		��Ϊ���Է�()      ���������һ�仰�����ڳԷ�
		      ˯��sleep() ���������һ�仰������˯��
	����
	  1����������Person�����
		��һ����������"����"  ���䣺23
		�ڶ�����������"����"  ���䣺24
		��������������"����"  ���䣺25
	  2������һ�����ϣ���������Person������ӵ�������
	  3���������ϣ��õ�ÿһ��Person����
	        �����ǰ�����������"����"����ô��ӡ��ǰ�����������Ϣ��
		��������
			����Ϊ�����죬����Ϊ��24
	                        ���ڳԷ�
			����˯��
			
//			��ӡˮ�ɻ�������ͳ�Ƹ���
//			��ӡˮ�ɻ���
	��ʾ:
1.	�������ArrayList<Person>����ʵ�ּ���.
2.	ע��:��Ϊ�������ַ���, �ַ����ıȽ��ø���: String���equals()����.

 */
public class Test1_05 {
	public static void main(String[] args) {
		Person per1 = new Person("����ʦ", 23);
		Person per2 = new Person("����ʦ", 24);
		Person per3 = new Person("����ʦ", 25);
		
		ArrayList<Person> list = new ArrayList<>();
		list.add(per1);
		list.add(per2);
		list.add(per3);
		
		for (Person per : list) {
			if(per.getName().equals("����ʦ")){
				System.out.println(per.getName()+",����Ϊ��"+per.getAge());
				per.eat();
				per.sleep();
			}
		}
		
		
	}
}

package com.itheima_01;
/*
 * static����һ���ؼ��֣���̬����˼�������������γ�Ա�����ͳ�Ա������
 * static���γ�Ա���ص㣺
 * 		A:��������ж�����
 * 			��ʵҲ���ж�һ����Ա�Ƿ�Ӧ����static���ε�������
 * 		B:����ͨ������ֱ�ӷ���
 * 		C:�����ڶ������
 * 		D:������ļ��ض�����
 */
public class StaticDemo {
	public static void main(String[] args) {
		Student.graduateFrom = "����ѧԺ";
		
		Student s1 = new Student();
		s1.name = "����ϼ";
		s1.age = 30;
		//s1.graduateFrom = "����ѧԺ";
		s1.show();
		System.out.println("----------------------");
		
		Student s2 = new Student();
		s2.name = "���»�";
		s2.age = 28;
		//s2.graduateFrom = "����ѧԺ";
		s2.show();
	}
}

package com.itheima_02;

import java.util.ArrayList;
import java.util.List;

/*
 * List���ϴ洢�Զ�����󲢱���
 * ��ʾ���Զ���һ��ѧ���࣬������Ա����name��age���������ϵ�ʱ���ڿ���̨���ѧ������ĳ�Ա����ֵ��
 * ������ʽ
 * 		��ǿfor
 */
public class ForTest {
	public static void main(String[] args) {
		//�������϶���
		List<Student> list = new ArrayList<Student>();
		
		//����Ԫ�ض���
		Student s1 = new Student("����ϼ",30);
		Student s2 = new Student("������",35);
		Student s3 = new Student("������",33);
		
		//��Ԫ����ӵ�����
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		//��������
		//��ǿfor
		for(Student s : list) {
			System.out.println(s.getName()+"---"+s.getAge());
		}
	}
}

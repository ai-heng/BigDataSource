package com.itheima.level01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * List���ϴ洢�Զ�����󲢱���
 * ��ʾ���Զ���һ��ѧ���࣬������Ա����name��age��
 * �������ϵ�ʱ���ڿ���̨���ѧ������ĳ�Ա����ֵ��
 * ���ַ�ʽ����
 * 		������
 * 		��ͨfor
 */
public class Task02 {
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
		
		//������
		Iterator<Student> it = list.iterator();
		while(it.hasNext()){
			Student s = it.next();
			System.out.println(s.getName()+"---"+s.getAge());
		}
		System.out.println("-----------------");
		
		//��ͨfor
		for(int x=0; x<list.size(); x++) {
			Student s = list.get(x);
			System.out.println(s.getName()+"---"+s.getAge());
		}
	}
}


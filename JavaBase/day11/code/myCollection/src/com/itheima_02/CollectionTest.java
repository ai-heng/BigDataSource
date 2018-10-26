package com.itheima_02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * Collection���ϴ洢�Զ�����󲢱���
 * ��ʾ���Զ���һ��ѧ���࣬������Ա����name��age���������ϵ�ʱ���ڿ���̨���ѧ������ĳ�Ա����ֵ��
 * 
 * ���ϵ�ʹ�ò��裺
 * 		A:�������϶���
 * 		B:����Ԫ�ض���
 * 		C:��Ԫ����ӵ�����
 * 		D:��������
 */
public class CollectionTest {
	public static void main(String[] args) {
		//�������϶���
		Collection<Student> c = new ArrayList<Student>();
		
		//����Ԫ�ض���
		Student s1 = new Student("����ϼ",30);
		Student s2 = new Student("������",35);
		Student s3 = new Student("������",33);
		
		//��Ԫ����ӵ�����
		c.add(s1);
		c.add(s2);
		c.add(s3);
		
		//��������
		Iterator<Student> it = c.iterator();
		while(it.hasNext()){
			Student s = it.next();
			System.out.println(s.getName()+"---"+s.getAge());
		}
	}
}

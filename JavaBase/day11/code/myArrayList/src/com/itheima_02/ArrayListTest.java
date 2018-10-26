package com.itheima_02;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ArrayList���ϴ洢�Զ�����󲢱���
 * ��ʾ���Զ���һ��ѧ���࣬������Ա����name��age���������ϵ�ʱ���ڿ���̨���ѧ������ĳ�Ա����ֵ��
 * ���ַ�ʽ����
 * 		������
 * 		��ͨfor
 * 		��ǿfor
 * 
 * LinkedList��ʹ�ú�ArrayList�����ƣ�����LinkedList����ϰ��Ҫ����Լ���
 */
public class ArrayListTest {
	public static void main(String[] args) {
		//�������϶���
		ArrayList<Student> array = new ArrayList<Student>();
		
		//����Ԫ�ض���
		Student s1 = new Student("����ϼ",30);
		Student s2 = new Student("������",35);
		Student s3 = new Student("������",33);
		
		//��Ԫ����ӵ�����
		array.add(s1);
		array.add(s2);
		array.add(s3);
		
		//������
		Iterator<Student> it = array.iterator();
		while(it.hasNext()){
			Student s = it.next();
			System.out.println(s.getName()+"---"+s.getAge());
		}
		System.out.println("----------------------");
		
		//��ͨfor
		for(int x=0; x<array.size(); x++) {
			Student s = array.get(x);
			System.out.println(s.getName()+"---"+s.getAge());
		}
		System.out.println("----------------------");
		
		//��ǿfor
		for(Student s : array) {
			System.out.println(s.getName()+"---"+s.getAge());
		}
	}
}

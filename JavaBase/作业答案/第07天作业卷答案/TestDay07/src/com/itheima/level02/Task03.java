package com.itheima.level02;

/*
һ��	�����������󣬲��ô���ʵ��
1.	��֪ѧ�������ʦ�����£�
		����:
			����,����
		��Ϊ:
			�Է�
		��ʦ�����еķ���:
			����
		ѧ�������еķ���:
			ѧϰ
2.	Ҫ��:���ϳ�ȡһ������,���������඼�̳��������,���е�����д�ڸ����У�������д�����еķ���
3.	��д������:�����������Ĳ���
 */
public class Task03 {
	public static void main(String[] args) {
		Student2 s = new Student2("С��", 20);
		s.work();
		s.eat();
		
		System.out.println("-------------");
		Teacher t = new Teacher("����ʦ", 18);
		t.work();
		t.eat();
	}
}

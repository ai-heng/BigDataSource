package com.itheima_02;
/*
 * ���ʹ�ã�
 * 		ʹ��һ���࣬��ʵ����ʹ�ø���ĳ�Ա��(��Ա�����ͳ�Ա����)
 * ������Ҫ��ʹ��һ����ĳ�Ա���ͱ�����ӵ�и���Ķ���
 * ��ô�������ӵ��һ����Ķ�����?
 * 		��������Ϳ�����
 * ������δ���������?
 * 		��ʽ��
 * 			����  ������  = new ����();
 * ������η��ʳ�Ա��?
 * 		��Ա������
 * 			������.��Ա����
 * 		��Ա������
 * 			������.��Ա����(...)
 */
public class StudentTest {
	public static void main(String[] args) {
		//����  ������  = new ����();
		Student s = new Student();
		//System.out.println("s:"+s);//com.itheima_02.Student@da6bf4
		
		//ʹ�ó�Ա����
		System.out.println("������"+s.name);//null
		System.out.println("���䣺"+s.age);//0
		System.out.println("----------");
		
		//����Ա������ֵ
		s.name = "����ϼ";
		s.age = 30;
		//�ٴ�ʹ�ó�Ա����
		System.out.println("������"+s.name);//����ϼ
		System.out.println("���䣺"+s.age);//30
		System.out.println("----------");
		
		//���ó�Ա����
		s.study();
		s.eat();
	}
}

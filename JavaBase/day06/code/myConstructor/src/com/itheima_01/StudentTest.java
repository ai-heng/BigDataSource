package com.itheima_01;
/*
 * ������
 */
public class StudentTest {
	public static void main(String[] args) {
		//��ε��ù��췽����?
		//��ʵͨ��new�ؼ��־Ϳ���
		//��ʽ������ ������ = new ���췽����(...);
		Student s = new Student();
		s.show();
		
		//public Student(String name)
		Student s2 = new Student("����ϼ");
		s2.show();
		
		//public Student(int age)
		Student s3 = new Student(30);
		s3.show();
		
		//public Student(String name,int age)
		Student s4 = new Student("����ϼ",30);
		s4.show();
	}
}

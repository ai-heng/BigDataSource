package com.itheima_02;
/*
 * ������
 */
public class StudentTest {
	public static void main(String[] args) {
		//��������
		Student s = new Student();
		System.out.println(s.getName()+"***"+s.getAge());
		
		//����Ա������ֵ
		s.setName("����ϼ");
		s.setAge(30);
		System.out.println(s.getName()+"***"+s.getAge());
	}
}

package com.itheima_01;
/*
 * ������
 */
public class StudentTest {
	public static void main(String[] args) {
		//��������
		Student s = new Student();
		s.show();
		
		//����Ա������ֵ
		s.name = "����ϼ";
		//s.age = 30;
		//s.age = -30;
		//ͨ��������ֵ
		s.setAge(-30);
		s.show();
	}
}

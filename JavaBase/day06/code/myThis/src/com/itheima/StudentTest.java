package com.itheima;

/*
 * ������
 */
public class StudentTest {
	public static void main(String[] args) {
		// ��������
		Student s = new Student();
		System.out.println(s.getName() + "---" + s.getAge());

		s.setName("����ϼ");
		s.setAge(30);
		System.out.println(s.getName() + "---" + s.getAge());
	}
}

package com.itheima_02;
/*
 * ������
 */
public class StudentTest {
	public static void main(String[] args) {
		//�޲ι��췽��+setXxx()
		Student s = new Student();
		s.setName("����ϼ");
		s.setAge(30);
		System.out.println(s.getName()+"---"+s.getAge());
		
		//���ι��췽��
		Student s2 = new Student("����ϼ",30);
		System.out.println(s2.getName()+"---"+s2.getAge());
	}
}

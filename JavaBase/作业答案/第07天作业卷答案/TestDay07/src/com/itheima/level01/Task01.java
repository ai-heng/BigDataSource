package com.itheima.level01;

/*
һ��	�����������󣬲��ô���ʵ�֣�
1.	����Person��
		���ԣ�����name������age��
		�������ղι��췽�������ι��췽����setXxx()��getXxx()������work�� 
2.	�������࣬����һ����ʦ��Teacher 
		��д������������ʦ�Ĺ�����ѧϰ����	
3.	�������࣬����һ��ѧ����Teacher 
		��д����������ѧ���Ĺ�����ѧϰ����
4.	��д������ֱ������2�����������в���
5.	Ҫ�����н��:
		ѧ���Ĺ���Ҫ�ú�ѧϰ
		��ʦ�Ĺ���Ҫ�úý���
*/
public class Task01 {
	public static void main(String[] args) {
		Student s = new Student();
		s.work();

		Teacher t = new Teacher();
		t.work();
	}
}

class Person {
	private String name;
	private int age;

	public Person() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void work() {
		System.out.println("�����˶���Ҫ����");
	}
}

class Student extends Person {
	public void work() {
		System.out.println("ѧ���Ĺ���Ҫ�ú�ѧϰ");
	}
}

class Teacher extends Person {
	public void work() {
		System.out.println("��ʦ�Ĺ���Ҫ�úý���");
	}
}
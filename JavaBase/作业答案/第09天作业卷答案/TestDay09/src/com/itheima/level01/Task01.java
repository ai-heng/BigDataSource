package com.itheima.level01;

/*
����һ��ѧ���࣬����������name������age���ṩ�ղΡ����ι��췽����
setXxx()��getXxx()�������ڲ������д���ѧ������Ϊ����г�ʼ����
��ӡ�ö�����
*/
public class Task01 {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("����ϼ");
		s.setAge(30);
		System.out.println(s);
	}
}

class Student {
	private String name;
	private int age;

	public Student() {
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

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}

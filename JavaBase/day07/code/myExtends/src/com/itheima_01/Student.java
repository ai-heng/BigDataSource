package com.itheima_01;
/*
 * ��׼ѧ����
 */
public class Student {
	//��Ա����
	private String name;
	private int age;
	
	//���췽��
	public Student() {}

	//getXxx(),setXxx()
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
	
	//ѧϰ�ķ���
	public void study() {
		System.out.println("ѧ��Ҫ�ú�ѧϰ");
	}
	
}

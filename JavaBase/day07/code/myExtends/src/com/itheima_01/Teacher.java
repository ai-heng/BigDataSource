package com.itheima_01;
/*
 * ��׼��ʦ��
 */
public class Teacher {
	//��Ա����
	private String name;
	private int age;
	
	//���췽��
	public Teacher() {}

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
	
	//���εķ���
	public void teach() {
		System.out.println("��ʦҪ�úý���");
	}
}

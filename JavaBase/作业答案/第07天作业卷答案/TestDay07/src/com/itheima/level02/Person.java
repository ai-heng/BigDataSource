package com.itheima.level02;

/*
���ԣ�
	����name���Ա�gender������age������nationality��
�������Է�eat��˯��sleep������work��
 */
public class Person {
	private String name;
	private String gender;
	private int age;
	private String nationality;

	public Person() {
		super();
	}

	public Person(String name, String gender, int age, String nationality) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.nationality = nationality;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public void sleep() {
		System.out.println("˯��");
	}

	public void eat() {
		System.out.println("�Է�");
	}

	public void work() {
		System.out.println("����");
	}
}

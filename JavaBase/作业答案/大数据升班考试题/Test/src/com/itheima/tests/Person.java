package com.itheima.tests;

/*
 *  ����һ��Person�ࡣ
		���ԣ�����name,����age
		��Ϊ���Է�()      ���������һ�仰�����ڳԷ�
		      ˯��sleep() ���������һ�仰������˯��
 */
public class Person implements Comparable<Person> {
	private String name;
	private int age;

	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
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

	public void eat() {
		System.out.println("���ڳԷ�");
	}

	public void sleep() {
		System.out.println("����˯��");
	}

	@Override
	public int compareTo(Person o) {
//		this,o
		if(o.getAge()>this.getAge()){
			return 1;
		}
		return 0;
	}
}

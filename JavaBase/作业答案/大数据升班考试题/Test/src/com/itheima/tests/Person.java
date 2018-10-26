package com.itheima.tests;

/*
 *  定义一个Person类。
		属性：姓名name,年龄age
		行为：吃饭()      方法中输出一句话：人在吃饭
		      睡觉sleep() 方法中输出一句话：人在睡觉
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
		System.out.println("人在吃饭");
	}

	public void sleep() {
		System.out.println("人在睡觉");
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

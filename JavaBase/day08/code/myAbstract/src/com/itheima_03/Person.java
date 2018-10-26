package com.itheima_03;

public abstract class Person {
	private int age = 20;
	private final String country = "中国";
	
	public Person() {}
	
	public Person(int age) {
		this.age = age;
	}
	
	public void show() {
		age = 30;
		System.out.println(age);
		//country = "美国";
		System.out.println(country);
	}
	
	public abstract void eat();
}

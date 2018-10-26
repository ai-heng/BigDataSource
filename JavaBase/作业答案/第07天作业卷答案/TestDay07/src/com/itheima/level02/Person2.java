package com.itheima.level02;

public class Person2 {
	private String name;
	private int age;
	public Person2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person2(String name, int age) {
		super();
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
	
	public void eat(){
		System.out.println("吃饭");
	}
	
	public void work(){
		System.out.println("所有人都需要工作");
	}
}

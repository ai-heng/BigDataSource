package com.itheima_01;
/*
 * 标准学生类
 */
public class Student {
	//成员变量
	private String name;
	private int age;
	
	//构造方法
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
	
	//学习的方法
	public void study() {
		System.out.println("学生要好好学习");
	}
	
}

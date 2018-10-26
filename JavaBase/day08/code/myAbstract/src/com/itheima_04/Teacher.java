package com.itheima_04;
//抽象的老师类
public abstract class Teacher {
	private String name;
	private int age;
	
	public Teacher() {}
	
	public Teacher(String name,int age) {
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
	
	//抽象方法
	public abstract void teach();
}

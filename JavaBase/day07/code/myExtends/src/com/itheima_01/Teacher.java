package com.itheima_01;
/*
 * 标准老师类
 */
public class Teacher {
	//成员变量
	private String name;
	private int age;
	
	//构造方法
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
	
	//讲课的方法
	public void teach() {
		System.out.println("老师要好好讲课");
	}
}

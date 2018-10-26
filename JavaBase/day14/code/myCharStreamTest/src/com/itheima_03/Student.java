package com.itheima_03;

public class Student {
	private String sid;
	private String name;
	private int age;
	private String city;

	public Student() {
	}

	public Student(String sid, String name, int age, String city) {
		this.sid = sid;
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}

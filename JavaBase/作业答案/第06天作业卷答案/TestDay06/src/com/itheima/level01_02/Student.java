package com.itheima.level01_02;
/*
 *  1. 设计，并定义一个学员类：Student
 * 		学员编号（String） 
		姓名（String）
		性别（String）
		身高（double）
		年龄（int）
		提供无参和全参的构造方法\get\set
 */
public class Student {
	//成员变量
	private String id;
	private String name;
	private String sex;
	private double height;
	private int age;
	//提供无参和全参的构造方法\get\set
	public Student() {
		super();
	}
	public Student(String id, String name, String sex, double height, int age) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.height = height;
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

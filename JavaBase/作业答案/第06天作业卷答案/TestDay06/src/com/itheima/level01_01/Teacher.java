package com.itheima.level01_01;
/*
 * 	Teacher(教师类)
 * 		教师编号	姓名		性别		年龄		科目
 * 		id		name	sex		age		course
 * 		提供构造方法与get、set方法
 * 
 * 		t001	薛之谦	男		26		Java
		t002	张碧晨	女		24		IOS
		t003	张杰		男		28		Java
 */
public class Teacher {
	//成员变量
	private String id;
	private String name;
	private String sex;
	private int age;
	private String cource;
	//构造方法
	public Teacher() {
		super();
	}
	public Teacher(String id, String name, String sex, int age, String cource) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.cource = cource;
	}
	//get、set方法
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCource() {
		return cource;
	}
	public void setCource(String cource) {
		this.cource = cource;
	}
	

	
}

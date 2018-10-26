package com.itheima.level02_02;
/*
 * 1.老师类Teacher
		属性:
			姓名name
			年龄age
			讲课内容content
		行为:
			吃饭
			讲课
 */
public class Teacher {
	private String name;
	private int age;
	private String content;
	/**
	 * 讲课方法
	 */
	public void jiangke() {
		System.out.println("年龄为"+age+"的"+name+"老师正在亢奋的讲着"+content+"的知识........");
	}
	
	public void eat() {
		System.out.println("年龄为"+age+"的"+name+"老师正在吃饭....");
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
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Teacher() {
	}

	public Teacher(String name, int age, String content) {
		this.name = name;
		this.age = age;
		this.content = content;
	}
	
}

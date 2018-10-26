package com.itheima.level01;

/*
定义一个学生类，属性有姓名name、年龄age，提供空参、满参构造方法，
setXxx()与getXxx()方法，在测试类中创建学生对象并为其进行初始化，
打印该对象名
*/
public class Task01 {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("林青霞");
		s.setAge(30);
		System.out.println(s);
	}
}

class Student {
	private String name;
	private int age;

	public Student() {
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

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}

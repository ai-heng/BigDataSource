package com.itheima.level01;

public class Task05 {
	public static void main(String[] args) {
		// 使用的是具体的类的对象
		// BasicTeacher

		// 多态形式的测试
		Teacher t = new BasicTeacher();
		t.setName("林青霞");
		t.setAge(30);
		System.out.println(t.getName() + "---" + t.getAge());
		t.teach();
		System.out.println("---------------------------");

		t = new BasicTeacher("林青霞", 30);
		System.out.println(t.getName() + "---" + t.getAge());
		t.teach();
	}
}

// 抽象的老师类
abstract class Teacher {
	private String name;
	private int age;

	public Teacher() {
	}

	public Teacher(String name, int age) {
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

	// 抽象方法
	public abstract void teach();
}

/*
 * 就业班老师
 */
class WorkTeacher extends Teacher {
	public WorkTeacher() {
	}

	public WorkTeacher(String name, int age) {
		super(name, age);
	}

	@Override
	public void teach() {
		System.out.println("就业班老师讲解JavaEE的内容");
	}
}

/*
 * 基础班老师
 */
class BasicTeacher extends Teacher {
	public BasicTeacher() {
	}

	public BasicTeacher(String name, int age) {
		super(name, age);
	}

	@Override
	public void teach() {
		System.out.println("基础班老师讲解JavaSE的内容");
	}

}

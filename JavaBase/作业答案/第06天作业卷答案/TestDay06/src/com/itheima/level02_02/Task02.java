package com.itheima.level02_02;

public class Task02 {
	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.setName("周志鹏");
		t.setAge(30);
		t.setContent("java面向对象");
		t.eat();
		t.jiangke();
		Student stu = new Student("韩光",18,"java面向对象");
		stu.eat();
		stu.study();
	}
}

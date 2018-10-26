package com.itheima_02;
/*
 * 标准人类
 * 
 * 继承的格式：
 * 		public class 子类名 extends 父类名 {}
 * 
 * 继承的好处：
 * 		A:提高了代码的复用性
 * 		B:提高了代码的维护性
 * 		C:让类与类之间产生了关系，是多态的前提
 * 
 * 继承的弊端：
 * 		让类与类之间产生了关系，也就让类的耦合性增强了。
 * 
 * 		开发原则：高内聚，低耦合。
 * 			内聚：就是自己完成某件事情的能力
 * 			耦合：类与类的关系
 */
public class Person {
	private String name;
	private int age;
	
	public Person() {}

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
	
}

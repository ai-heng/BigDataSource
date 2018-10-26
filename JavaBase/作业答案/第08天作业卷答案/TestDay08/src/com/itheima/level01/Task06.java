package com.itheima.level01;

public class Task06 {
	public static void main(String[] args) {
		Cat2 c = new Cat2();
		c.setName("加菲猫");
		c.setAge(3);
		System.out.println(c.getName() + "---" + c.getAge());
		c.eat();
		c.jump();
		System.out.println("-------------------------");

		Cat2 c2 = new Cat2("加菲猫", 3);
		System.out.println(c2.getName() + "---" + c2.getAge());
		c2.eat();
		c2.jump();
	}
}

//跳高接口
interface Jumpping {
	public abstract void jump();
}

// 具体的猫类
class Cat2 extends Animal2 implements Jumpping {
	public Cat2() {}

	public Cat2(String name, int age) {
		super(name, age);
	}

	@Override
	public void jump() {
		System.out.println("猫可以跳高了");
	}

	@Override
	public void eat() {
		System.out.println("猫吃鱼");
	}
}

//抽象的动物类
abstract class Animal2 {
	private String name;
	private int age;
	
	public Animal2() {}
	
	public Animal2(String name,int age){
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
	
	public abstract void eat();
}


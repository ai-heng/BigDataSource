package com.itheima.level01;

public class Task04 {
	public static void main(String[] args) {
		//创建对象
		//Animal a = new Animal();
		//按照多态的形式实例化抽象类
		Animal a = new Cat();
		a.eat();
		a.sleep();
	}
}

//抽象类
abstract class Animal {
	//抽象方法
	public abstract void eat();
	
	public void sleep() {
		System.out.println("睡觉");
	}
}

class Cat extends Animal {
	@Override
	public void eat() {
		System.out.println("猫吃鱼");
	}
}

abstract class Dog extends Animal {
	
}


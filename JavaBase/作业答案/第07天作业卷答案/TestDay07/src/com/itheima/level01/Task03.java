package com.itheima.level01;

/*
一、	分析以下需求，并用代码实现：
1.	定义Animal动物类
		方法：吃东西eat。 
2.	根据动物类，派生一个猫类Cat 
		重写吃东西方法（猫吃鱼）。	
3.	根据动物类，派生一个狗类Dog 
		重写吃东西方法（狗吃骨头）。
		狗还有一个特有方法，狗看门
4.	根据动物类，派生一个猪类Pig 
		重写吃东西方法（猪吃白菜）。
5.	根据操作动物类AnimalOperator
		方法：调用动物的吃方法 
6.	编写测试类分别对上述4类事物AnimalOperator、Cat、Dog、Pig创建对象，调用吃东西功能，进行测试
7.	要求运行结果:
		猫吃鱼
		狗吃骨头
		猪吃白菜
*/
public class Task03 {
	public static void main(String[] args) {
		AnimalOperator ao = new AnimalOperator();
		Cat c = new Cat();
		ao.useAnimal(c);
		
		Dog d = new Dog();
		ao.useAnimal(d);
		
		Pig p = new Pig();
		ao.useAnimal(p);
	}
}

class Animal {
	public void eat() {
		System.out.println("吃东西");
	}
}


class AnimalOperator {
	public void useAnimal(Animal a) { //Animal a = new Cat();
		a.eat();
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("猫吃鱼");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("狗吃骨头");
	}
	
	public void lookDoor() {
		System.out.println("狗看门");
	}
}

class Pig extends Animal {
	public void eat() {
		System.out.println("猪吃白菜");
	}
}


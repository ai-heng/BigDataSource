package com.itheima.level01;

public class Task04 {
	public static void main(String[] args) {
		//��������
		//Animal a = new Animal();
		//���ն�̬����ʽʵ����������
		Animal a = new Cat();
		a.eat();
		a.sleep();
	}
}

//������
abstract class Animal {
	//���󷽷�
	public abstract void eat();
	
	public void sleep() {
		System.out.println("˯��");
	}
}

class Cat extends Animal {
	@Override
	public void eat() {
		System.out.println("è����");
	}
}

abstract class Dog extends Animal {
	
}


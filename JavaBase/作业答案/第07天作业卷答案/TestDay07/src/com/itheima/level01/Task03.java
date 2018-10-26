package com.itheima.level01;

/*
һ��	�����������󣬲��ô���ʵ�֣�
1.	����Animal������
		�������Զ���eat�� 
2.	���ݶ����࣬����һ��è��Cat 
		��д�Զ���������è���㣩��	
3.	���ݶ����࣬����һ������Dog 
		��д�Զ������������Թ�ͷ����
		������һ�����з�����������
4.	���ݶ����࣬����һ������Pig 
		��д�Զ�����������԰ײˣ���
5.	���ݲ���������AnimalOperator
		���������ö���ĳԷ��� 
6.	��д������ֱ������4������AnimalOperator��Cat��Dog��Pig�������󣬵��óԶ������ܣ����в���
7.	Ҫ�����н��:
		è����
		���Թ�ͷ
		��԰ײ�
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
		System.out.println("�Զ���");
	}
}


class AnimalOperator {
	public void useAnimal(Animal a) { //Animal a = new Cat();
		a.eat();
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("è����");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("���Թ�ͷ");
	}
	
	public void lookDoor() {
		System.out.println("������");
	}
}

class Pig extends Animal {
	public void eat() {
		System.out.println("��԰ײ�");
	}
}


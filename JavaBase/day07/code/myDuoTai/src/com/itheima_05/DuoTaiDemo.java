package com.itheima_05;

public class DuoTaiDemo {
	public static void main(String[] args) {
		//����ת��
		Animal a = new Cat();
		a.eat();
		
		//����ת��
		Cat c = (Cat) a;
		c.eat();
		c.playGame();
		
		//����ת��
		a = new Dog();
		a.eat();
		
		//����ת��
		Cat cc = (Cat) a; //ClassCastException ����ת���쳣
		cc.eat();
		cc.playGame();
	}
}

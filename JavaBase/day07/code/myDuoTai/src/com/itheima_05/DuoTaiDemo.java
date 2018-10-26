package com.itheima_05;

public class DuoTaiDemo {
	public static void main(String[] args) {
		//向上转型
		Animal a = new Cat();
		a.eat();
		
		//向下转型
		Cat c = (Cat) a;
		c.eat();
		c.playGame();
		
		//向上转型
		a = new Dog();
		a.eat();
		
		//向下转型
		Cat cc = (Cat) a; //ClassCastException 类型转换异常
		cc.eat();
		cc.playGame();
	}
}

package com.itheima_02;
/*
 * 抽象类的特点：
 * 		A:抽象类和抽象方法必须使用abstract关键字修饰
 * 		B:抽象类中不一定有抽象方法，有抽象方法的类一定是抽象类
 * 		C:抽象类不能实例化
 * 			抽象类如何实例化呢?
 * 			参照多态的方式，通过子类对象实例化。
 * 		D:抽象类的子类
 * 			要么重写抽象类中的所有抽象方法
 * 			要么是抽象类
 */
public class AnimalDemo {
	public static void main(String[] args) {
		//创建对象
		//Animal a = new Animal();
		//按照多态的形式实例化抽象类
		Animal a = new Cat();
		a.eat();
		a.sleep();
	}
}

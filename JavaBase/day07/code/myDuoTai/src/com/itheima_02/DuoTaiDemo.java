package com.itheima_02;
/*
 * 多态中成员的访问特点：
 * 		A:成员变量
 * 			编译看左边，执行看左边。
 * 		B:成员方法
 * 			编译看左边，执行看右边。
 * 
 * 		为什么成员变量和成员方法的访问不一样呢?
 * 			因为成员方法有重写，而变量没有。
 */
public class DuoTaiDemo {
	public static void main(String[] args) {
		//多态
		Animal a = new Cat();
		System.out.println(a.age);
		//System.out.println(a.weight);
		
		a.eat();
		//a.playGame();
	}
}

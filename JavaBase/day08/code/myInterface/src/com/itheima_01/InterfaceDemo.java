package com.itheima_01;
/*
 * 接口的特点：
 * 		A:定义接口使用的是interface关键字
 * 		B:类和接口之间是实现关系，用implements关键字表示
 * 		C:接口不能实例化
 * 			接口有没有其他的方式实例化呢?
 * 			参照多态的形式使用实现类来实例化。
 * 		D:接口的实现类
 * 			要么重写接口中的所有的抽象方法
 * 			要么是一个抽象类
 * 
 * 多态的几种形式：
 * 		具体类多态(几乎不用)
 * 		抽象类多态(常用)
 * 		接口多态(最常用)
 */
public class InterfaceDemo {
	public static void main(String[] args) {
		//Jumpping j = new Jumpping();
		//接口多态的形式实例化
		Jumpping j = new Cat();
		j.jump();
	}
}

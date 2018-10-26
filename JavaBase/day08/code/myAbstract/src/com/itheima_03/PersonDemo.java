package com.itheima_03;
/*
 * 抽象类的成员特点：
 * 		成员变量：
 * 			有成员变量，成员变量可以是变量，也可以是常量。
 * 		构造方法：
 * 			有构造方法。
 * 			抽象类中构造方法的作用?
 * 				用于子类访问父类数据的初始化。
 * 		成员方法：
 * 			有成员方法，成员方法可以是抽象的，也可以是非抽象的。
 * 			抽象方法：限定子类必须完成某些动作
 * 			非抽象方法：提高代码的复用性
 */
public class PersonDemo {
	public static void main(String[] args) {
		Person p = new Student();
		p.show();
	}
}

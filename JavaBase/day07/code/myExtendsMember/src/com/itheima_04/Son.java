package com.itheima_04;
/*
 * Java继承中成员方法的访问特点：
 * 		A:子类中方法和父类中方法的声明不一样，这个太简单
 * 		B:子类中方法和父类中方法的声明一样，调用的到底是谁的呢?
 * 			执行的是子类中的方法。
 * 
 * 通过子类对象调用方法：
 * 		a:在子类中找，有就使用
 * 		b:在父类中找，有就使用
 * 		c:如果没有就报错
 */
public class Son extends Father {
	public void method() {
		System.out.println("Son method");
	}
	
	public void show() {
		System.out.println("Son show");
	}
}

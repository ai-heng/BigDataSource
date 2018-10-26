package com.itheima_02;
/*
 * 接口的成员特点：
 * 		成员变量：
 * 			有成员变量，而且变量只能是常量。
 * 			默认修饰符：public static final
 * 		构造方法：
 * 			没有构造方法。
 * 		成员方法：
 * 			有成员方法，而且都是抽象的。
 * 			默认修饰符：public abstract
 * 
 * Object:是类层次结构的根类，所有的类都直接的或者间接的继承自该类。
 */
public class InterfaceDemo {
	public static void main(String[] args) {
		//按照多态的形式创建接口对象
		Inter i = new InterImpl();
		//i.num = 30;
		//System.out.println(i.num);
		//i.num2 = 40;
		//System.out.println(i.num2);
		System.out.println(Inter.num);
		System.out.println(Inter.num2);
	}
}

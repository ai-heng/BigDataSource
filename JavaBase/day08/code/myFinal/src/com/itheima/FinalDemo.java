package com.itheima;
/*
 * final：是一个关键字，表示最终的意思。可以用来修饰类，修饰变量，修饰方法。
 * 修饰类：表明该类是最终类，不能被继承
 * 修饰变量：表明该变量是常量，不能再次被赋值
 * 修饰方法：表明该方法是最终方法，不能被重写
 */
public class FinalDemo {
	public static void main(String[] args) {
		Son s = new Son();
		s.show();
	}
}

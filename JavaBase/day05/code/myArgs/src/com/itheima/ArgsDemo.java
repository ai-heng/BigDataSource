package com.itheima;
/*
 * 基本类型作为方法的参数，形式参数的改变不影响实际参数。
 * 
 * 形式参数：用于接收实际参数的变量
 * 实际参数：实际参与运算的数据
 */
public class ArgsDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("a:" + a + ",b:" + b);//a:10,b:20
		change(a, b);
		System.out.println("a:" + a + ",b:" + b);//???
	}

	public static void change(int a, int b) {//a=10,b=20
		System.out.println("a:" + a + ",b:" + b);//a:10,b:20
		a = b;//a=20;
		b = a + b;//b=40;
		System.out.println("a:" + a + ",b:" + b);//a:20,b:40
	}

}

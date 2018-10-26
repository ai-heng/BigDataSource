package com.itheima;
/*
 * 异常的默认处理方式
 * 
 * java.lang.ArithmeticException:异常的类名，包括包名
 * / by zero:异常的原因，被0除
 * at com.itheima.ExceptionDemo2.method(ExceptionDemo2.java:17):异常的位置
 * 
 * 如果程序出现了问题，我们没有做任何的处理，最终JVM会做出默认的处理。
 * 处理方案：
 * 		A:把异常的名称，异常的原因，异常出现的位置等信息在控制台输出
 * 		B:让程序停止执行
 */
public class ExceptionDemo2 {
	public static void main(String[] args) {
		System.out.println("程序开始执行");
		method();
		System.out.println("程序结束执行");
	}
	
	public static void method() {
		int a = 10;
		int b = 0;
		System.out.println(a/b);
	}
}

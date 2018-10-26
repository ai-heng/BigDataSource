package com.itheima;
/*
 * 异常：就是程序出现了不正常的情况。
 * 
 * ArithmeticException:当出现异常的运算条件时，抛出此异常。例如，一个整数“除以零”时，抛出此类的一个实例。
 * 
 * Throwable 类是 Java 语言中所有错误或异常的超类。
 * 
 * Error 是 Throwable 的子类，用于指示合理的应用程序不应该试图捕获的严重问题。
 * 		也就是说针对程序发生了Error的情况，Java程序本身是无能为力的，比如说：硬件层面的问题，内存不足等。
 * 		所以，针对Error的问题我们不处理。
 * 
 * Exception 类及其子类是 Throwable 的一种形式，它指出了合理的应用程序想要捕获的条件。 
 * 		也就是说针对程序发生了Exception的情况，是我们需要处理的问题。
 * 
 * RuntimeException 是那些可能在 Java 虚拟机正常运行期间抛出的异常的超类。
 * 
 * Exception分为运行期和编译期：
 * 		运行期的异常：在编译期是不处理的，在程序运行时候出现了问题，需要我们回来修改代码。
 * 		编译期的异常：在编译期就必须处理，否则程序不能通过编译，就更不能正常的执行了。
 * 
 * 异常的体系：
 * Throwable
 * 		Error:严重问题，不需要处理
 * 		Exception
 * 			RuntimeException:在编译期是不处理的，在程序运行时候出现了问题，需要我们回来修改代码。
 * 			非RuntimeException:在编译期就必须处理，否则程序不能通过编译，就更不能正常的执行了。
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		method();
	}
	
	public static void method() {
		int a = 10;
		int b = 5;
		//b = 0;
		System.out.println(a/b);
	}
}

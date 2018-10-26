package com.itheima;
/*
 * 异常处理：
 * 方案1：try...catch...
 * 
 * 格式：
 * 		try {
 * 			可能出现异常的代码;
 * 		}catch(异常类名  变量名) {
 * 			异常的处理代码;
 * 		}
 * 
 * 执行流程：
 * 		程序从try开始执行，执行到哪里出现了问题，就会跳转到catch里面执行。
 * 		执行完毕后，程序还能继续往下执行。
 * 
 * public void printStackTrace():把异常的错误信息输出在了控制台。
 * 在实际开发中，我们遇见了异常，会给出一个页面进行提示，而我们目前做不了，
 * 所以，就用异常对象调用printStackTrace()就可以了。
 * 这样做了以后，我们的程序还可以继续往下执行。
 */
public class ExceptionDemo3 {
	public static void main(String[] args) {
		System.out.println("程序开始执行");
		method();
		System.out.println("程序结束执行");
	}
	
	public static void method() {
//		try{
//			int a = 10;
//			int b = 0;
//			System.out.println(a/b);
//			System.out.println("你们猜猜这里可以执行吗?");
//		}catch(ArithmeticException e) {
//			System.out.println("除数不能为0");
//		}
//		System.out.println("你们再猜猜这里可以执行吗?");
		
		try{
			int a = 10;
			int b = 0;
			System.out.println(a/b);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}
}

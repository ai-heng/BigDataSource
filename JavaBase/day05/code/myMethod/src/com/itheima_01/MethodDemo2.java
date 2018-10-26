package com.itheima_01;
/*
 * 方法的调用：(有明确返回值的方法的调用)
 * 		A:单独调用，没有意义
 * 		B:赋值调用(我们推荐的方式)
 * 		C:输出调用
 */
public class MethodDemo2 {
	public static void main(String[] args) {
		//如何调用方法呢?
		//我们应该根据方法名来调用
		//sum();
		//调用方法，不仅仅要看方法名，还要看方法的参数(个数和类型)
		//sum(10,20);
	
		//因为该方法返回了一个int类型的值，所以我们应该用一个int类型的变量接收
		int result = sum(10,20);
		System.out.println("result:"+result);
		
		//输出调用
		//System.out.println(sum(10,20));
	}
	
	/*
	 * 求两个数据和的方法
	 */
	public static int sum(int a,int b) {
		int c = a + b;
		return c;
	}
}

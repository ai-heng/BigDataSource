package com.itheima.level01;
/*
 * 定义一个方法,实现同时求出两个整数的加减乘除的结果,并同时把这个结果返回
 */
public class Task07 {
	public static void main(String[] args) {
		//1. 定义2个变量
		int a =20;
		int b = 5;
		//2. 调用方法，实现得到加减乘除的结果
		int[] result = getNums(a, b);
		//3. 打印结果
		System.out.println("两个整数的加减乘除的结果为：");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	/*
	 * 1.定义一个方法,实现同时求出两个整数的加减乘除的结果,并同时把这个结果返回
	 * 指定方法的名称： getNums
	 * 指定方法的参数： int a, int b
	 * 指定方法的返回值： int[]
	 */
	public static int[] getNums(int a, int b){
		//定义一个数组，存放加减乘除的结果
		int[] arr = new int[4];
		arr[0] = a+b;
		arr[1] = a-b;
		arr[2] = a*b;
		arr[3] = a/b;
		return arr;
	}
}

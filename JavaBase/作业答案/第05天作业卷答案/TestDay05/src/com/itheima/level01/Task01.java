package com.itheima.level01;
/*
 * 定义一个方法 能接受一个整数(这个整数大于3)打印0到这个整数(包含)之间的所有的偶数
	如 接受的数字是6则调用完方法打印出来的偶数是 0 2 4 6
	如 接受的数字是 5则调用完方法打印出来的偶数是 0 2 4
 */
public class Task01 {
	public static void main(String[] args) {
		//1.定义一个方法 ， 用来打印0到n(包含n)之间的所有的偶数
		//2.调用方法
		//printNum(6);
		printNum(5);
	}
	
	/*
	 * 定义一个方法 ， 用来打印0到n(包含n)之间的所有的偶数
	 * 指定方法的名称 printNum
	 * 指定方法的参数 int n
	 * 指定方法的返回值 void
	 */
	public static void printNum(int n){
		//1.获取到0-n之间的每一个数字
		for (int i = 0; i <= n; i++) {
			//2.判断当前的数字是否为偶数，是偶数的话，打印当前数字
			if (i%2==0) {
				System.out.print(i + " ");
			}
		}
	}
	
}

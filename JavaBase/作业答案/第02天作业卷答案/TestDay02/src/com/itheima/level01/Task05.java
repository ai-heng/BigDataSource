package com.itheima.level01;
/*
 * 定义int类型的变量a,定义int类型的变量b,
 * 使用三元运算符判断如果a大于b返回a与b的和,
 * 否则返回a与b的乘积,打印结果
 */
public class Task05 {
	public static void main(String[] args) {
		//1.定义int类型的变量a、b
		int a = 10;
		int b = 20;
		//2.比较变量a与变量b的值的大小
			//如果a大，返回a+b； 如果b大，返回a*b
		int result = (a>b) ? (a+b) : (a*b);
		//3.打印结果
		System.out.println(result);
	}
}

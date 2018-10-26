package com.itheima.level01;

/*
 * 使用循环语句,求出1-100之间的奇数之和.
 * 
 */
public class Task01 {
	public static void main(String[] args) {
		// 1.定义一个变量，记录奇数的累加和
		int sum = 0;
		// 2.使用循环语句，得到1-100之间的每一个数
		for (int i = 1; i <= 100; i++) {
			// 判断当前的数字是否为奇数 （1、3、5、7、9） 数字%2 == 1
			if (i % 2 == 1) {
				// 把奇数进行累计和
				//sum = sum + i;
				sum += i;
			}	
		}
		// 3.打印奇数和
		System.out.println("1-100的奇数累加和：" + sum);
	}
}

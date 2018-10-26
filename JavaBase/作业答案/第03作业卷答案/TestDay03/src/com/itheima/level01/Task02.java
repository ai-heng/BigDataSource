package com.itheima.level01;
/*
 * 求出1到100之间的既是3的倍数又是5倍数的数字之和.
 */
public class Task02 {
	public static void main(String[] args) {
		
		//定义一个变量，记录既是3的倍数又是5倍数的数字的累加和
		int sum = 0;
		//使用循环，获取到1-100之间的每一个数字
		for (int i = 1; i <= 100; i++) {
			//判断当前的数字是否能被3整除，同时能被5整除 ( 数字%3==0 并且 数字%5==0 )
			if (i%3==0 && i%5==0) {
				//对满足条件的数字，进行累加和操作
				sum += i;
				System.out.println(i);
			}	
		}
		System.out.println("1-100之间既是3的倍数又是5倍数的数字之和:" + sum);
		
	}
}

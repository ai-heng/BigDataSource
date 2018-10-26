package com.itheima.level01;

import java.util.Random;

/*
 * 随机产生两个整数,随机数的范围均是[1,100],定义方法求这两个整数的和并打印和值
 */
public class Task02 {
	public static void main(String[] args) {
		//1.随机产生两个整数
		//随机数的范围均是[1,100]
		Random r = new Random();
		int x = r.nextInt(100) + 1;//[1,100]
		int y = r.nextInt(100) + 1;//[1,100]
		//3.调用方法，打印和值
		System.out.println( add(x, y) );
	}
	
	//2.定义方法求这两个整数的和
	/*
	 * 指定方法的名称 add
	 * 指定方法的参数 int a, int b
	 * 返回值：int
	 */
	public static int add(int a, int b){
		System.out.println("a="+a);
		System.out.println("b="+b);
		return a+b;
	}
}

package com.itheima.level01;

import java.util.Random;

/*
 * 定义一个长度为3的一维数组,给每个元素赋值. 
 * (要求数组中每个元素的值是0-9的随机数)
 * 遍历数组打印每个元素的值
 * 
 */
public class Task02 {
	public static void main(String[] args) {
		//1.定义一个长度为3的一维数组
		int[] arr = new int[3];
		//2.给每个元素赋值(循环的方式)
		for (int i = 0; i < arr.length; i++) {
			//数组中每个元素的值是0-9的随机数
			Random r = new Random();
			int num = r.nextInt(10); //0-9的随机数
			arr[i] = num; //把随机数赋值给数组元素
		}
		//3.遍历数组打印每个元素的值(循环的方式)
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
	}
}

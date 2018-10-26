package com.itheima.level01;
/*
 * 定义一个含有五个元素的数组,并为每个元素赋值,求数组中所有元素的最小值
 */
public class Task01 {
	public static void main(String[] args) {
		//1.定义一个含有五个元素的数组,并为每个元素赋值
		int[] arr = {23,54,22,13,55};
		//2.求数组中所有元素的最小值
		//创建一个变量，记录最小值
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			//获取数组中的每个元素
			//arr[i]
			//逐一比较，得到最小值
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("min = " + min);
	}
}

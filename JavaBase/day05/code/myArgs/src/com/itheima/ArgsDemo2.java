package com.itheima;
/*
 * 基本数据类型作为参数传递，形式参数的改变不影响实际参数
 * 引用数据类型作为参数传递，形式参数的改变直接影响实际参数
 */
public class ArgsDemo2 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int x = 0; x < arr.length; x++) {
			System.out.println(arr[x]);//1,2,3,4,5
		}
		change(arr);
		for (int x = 0; x < arr.length; x++) {
			System.out.println(arr[x]);//1,4,3,8,5
		}
	}

	public static void change(int[] arr) {
		for (int x = 0; x < arr.length; x++) {
			//如果数组元素是偶数，值就变成了以前的2倍
			if (arr[x] % 2 == 0) {
				arr[x] *= 2;
			}
		}
	}

}

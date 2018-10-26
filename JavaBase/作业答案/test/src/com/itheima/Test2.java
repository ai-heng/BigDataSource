package com.itheima;

import java.util.Arrays;

// 交换数组的对称位置     
public class Test2 {

	public static void main(String[] args) {
		int[] arr = {22, 33, 88, 66, 77, 99};
		
		System.out.println("原数组：" + Arrays.toString(arr));
		
		// 调用方法
		changeArr(arr);
		
		System.out.println("转换后：" + Arrays.toString(arr));
		
	}
	
	/*
	 * 返回值：void
	 * 参数列表：需要操作的数组 int[] arr
	 */
	public static void changeArr(int[] arr) {
		// 循环到数组一半即可
		for (int i = 0; i < arr.length / 2; i++) {
			// 交换对称位置
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
	}

}

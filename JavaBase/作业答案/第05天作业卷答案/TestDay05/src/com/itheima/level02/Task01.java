package com.itheima.level02;
/*
 * 主方法中给定数组int[] arr= {10,20,30,40,50,60};
 * 这个数组没有重复元素.定义一个方法可以接受这个给定的数组并返回这个数组中最大元素值的索引值
 */
public class Task01 {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60};
		System.out.println(getMaxIndex(arr));
	}

	public static int getMaxIndex(int[] arr){
		int max = arr[0];
		//定义最大元素的索引值
		int maxIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]){
				max = arr[i];
				//索引值随着最大元素改变而改变
				maxIndex = i;
			}
		}
		return maxIndex;
	}
}

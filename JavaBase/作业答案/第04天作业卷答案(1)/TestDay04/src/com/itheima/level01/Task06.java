package com.itheima.level01;
/*
 * 需求：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
 * 假如兔子都不死，问第二十个月的兔子对数为多少？ 
 * 
 * 规律：
 * 		第一个月：1
 * 		第二个月：1
 * 		第三个月：2
 * 		第四个月：3
 * 		第五个月：5
 * 		...
 * 
 * 		从第三个月开始，每个月的兔子对数是前两个月的兔子对数之和
 * 		第一个月和第二个月的兔子对数都是1
 * 
 * 分析：
 * 		A:由于数据比较多，所以我们定义数组实现	
 * 			int[] arr = new int[20];
 * 		B:给数组中的元素赋值
 * 			arr[0] = 1;
 * 			arr[1] = 1;
 * 		C:从第三个月开始，根据规律赋值
 * 			arr[2] = arr[1] + arr[0];
 * 			arr[3] = arr[2] + arr[1];
 * 			arr[4] = arr[3] + arr[2];
 * 			...
 * 		D:输出第二十个月的兔子对数，其实就是输出arr[19]
 */
public class Task06 {
	public static void main(String[] args) {
		//定义数组
		int[] arr = new int[20];
		
		//给数组中的元素赋值
		arr[0] = 1;
		arr[1] = 1;
		
		//从第三个月开始，根据规律赋值
		for(int x=2; x<arr.length; x++) {
			arr[x] = arr[x-1] + arr[x-2];
		}
		
		//输出第二十个月的兔子对数，其实就是输出arr[19]
		System.out.println("第二十个月的兔子对数是："+arr[19]);
	}
}

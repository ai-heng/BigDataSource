package com.itheima;
/*
 * 需求：数组遍历(依次输出数组中的每一个元素)
 */
public class ArrayOperatorDemo {
	public static void main(String[] args) {
		//定义一个数组
		int[] arr = {11,22,33,44,55};
		
		//原始做法
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println("------------------");
		
		//用循环改进代码
		//用for循环获取到数据0-4
		for(int x=0; x<5; x++) {
			System.out.println(arr[x]);
		}
		System.out.println("------------------");
		
		//为了解决我们去数数组中的元素个数问题，数组就提供了一个属性：length
		//用于获取数组中的元素个数
		//使用格式：数组名.length
		System.out.println("arr数组共有"+arr.length+"个元素");
		System.out.println("------------------");
		
		//数组遍历的标准版代码
		for(int x=0; x<arr.length; x++) {
			System.out.println(arr[x]);
		}
		
	}
}

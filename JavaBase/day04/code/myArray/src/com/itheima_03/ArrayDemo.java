package com.itheima_03;
/*
 * 静态初始化：给出数组中的元素值，由系统决定数组的长度。
 * 
 * 格式：
 * 		数据类型[] 数组名 = new 数据类型[]{元素1,元素2,元素3,...};
 * 
 * 举例：
 * 		int[] arr = new int[]{1,2,3};
 * 
 * 简化的格式：
 * 		数据类型[] 数组名 = {元素1,元素2,元素3,...};
 * 简化格式的代码：
 * 		int[] arr = {1,2,3};
 */
public class ArrayDemo {
	public static void main(String[] args) {
		//定义数组
		int[] arr = {1,2,3};
		
		//输出数组名和元素值
		System.out.println("arr:"+arr);
		System.out.println("arr[0]:"+arr[0]);
		System.out.println("arr[1]:"+arr[1]);
		System.out.println("arr[2]:"+arr[2]);
	}
}

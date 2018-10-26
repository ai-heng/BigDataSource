package com.itheima;

import java.util.Arrays;

/*
 * Arrays:提供了对数组操作的各种方法。
 * public static String toString(int[] a):把数组转成字符串
 * public static void sort(int[] a):对数组进行升序排序
 */
public class ArraysDemo {
	public static void main(String[] args) {
		//定义一个数组
		int[] arr = {24,69,80,57,13};
		
		//public static String toString(int[] a):把数组转成字符串
		System.out.println("排序前："+Arrays.toString(arr));
		
		//public static void sort(int[] a):对数组进行升序排序
		Arrays.sort(arr);
		
		System.out.println("排序后："+Arrays.toString(arr));
	}
}

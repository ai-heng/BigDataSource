package com.itheima.level02;

import java.util.Random;

/*
 * 分析以下需求，并用代码实现
	1.创建两个长度为10的数组，数组内元素为随机生成的、不重复的 1-100之间的整数.
	2.定义一个方法，传入两个数组，方法中将两个数组不同的元素拼接成一个字符串，并且将该字符串以及字符串的长度输出到控制台上；
		如果没有则输出"对不起两个数组的所有元素均相同"
		
	思路
		1.定义一个方法，用来为数组生成不重复的随机数赋值，方法参数是数组类型
			循环生成随机数，每生成一个，就判断一下这个数组中是否包含这个数，如果不包含，就赋值，如果包含，就重新生成。
			
	第二小问思路：
			先遍历其中一个数组，拿其中的每一个元素去判断在另一个数组中是否存在，如果存在不拼接，如果不存在就拼接
			再遍历另外一个数组，拿其中的每一个元素去判断在另一个数组中是否存在，如果存在不拼接，如果不存在就拼接
 */
public class Task08 {
	public static void main(String[] args) {
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		createRandomElment(arr1);
		createRandomElment(arr2);
		printArr(arr1);
		printArr(arr2);
		pinJie(arr1, arr2);
	}
	/*
	 * 遍历数组
	 */
	public static void printArr(int[] arr) {
		System.out.print("[");
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length - 1) {
				System.out.println(arr[i] + "]");
			} else {
				System.out.print(arr[i]+", ");
			}
		}
	}
	/*
	 * 为数组生成不重复的随机数
	 */
	public static void createRandomElment(int[] arr) {
		Random r = new Random();
		//定义一个变量，用来当做已经赋值的索引
		int index = 0;
		//判断如果这个索引是 arr.length - 1。代表已经赋值满了，就结束循环
		while(index < arr.length) {//如果index < 数组的长度，代表赋值没有满
			//生成随机数
			int num = r.nextInt(100) + 1;
			//判断一下这个数组中是否包含刚刚生成的随机数
			boolean flag = exist(arr, num);
			if(!flag) {//如果不存在
				arr[index] = num;
				index++;
			}
		}
	}
	/*
	 * 判断一下这个数组中是否包含这个数
	 * 参数：数组，要判断的数
	 * 遍历这个数组
	 * 	判断当前遍历到的数是否== 我们要判断的数，如果相等，直接返回 true
	 * 		           如果不等于，就一直继续遍历判断
	 * 如果遍历完了都没有找到，返回false
	 */
	public static boolean exist(int[] arr, int num) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				return true;
			}
		}
		return false;
	}
	/*
	 * 
	 * 定义一个方法，传入两个数组，方法中将两个数组不同的元素拼接成一个字符串，并且将该字符串以及字符串的长度输出到控制台上；
		如果没有则输出"对不起两个数组的所有元素均相同"
	 * 第二小问思路：
			先遍历其中一个数组，拿其中的每一个元素去判断在另一个数组中是否存在，如果存在不拼接，如果不存在就拼接
			再遍历另外一个数组，拿其中的每一个元素去判断在另一个数组中是否存在，如果存在不拼接，如果不存在就拼接
	 */
	/*
	 * 方法两个参数 int[]  int[]
	 */
	
	public static void pinJie(int[] arr1, int[] arr2) {
		//定义字符串类型变量，用来拼接
		String str = "";
//		先遍历其中一个数组，拿其中的每一个元素去判断在另一个数组中是否存在，如果存在不拼接，如果不存在就拼接
		for(int i = 0; i < arr1.length; i++) {
			//判断当前遍历到的元素是否在另一数组中存在
			boolean flag = exist(arr2,arr1[i]);
			if(!flag) {//如果不存在，就拼接
				str = str + arr1[i] + " ";
			}
		}
		//再遍历另外一个数组，拿其中的每一个元素去判断在另一个数组中是否存在，如果存在不拼接，如果不存在就拼接
		for(int i = 0; i < arr2.length; i++) {
			//判断当前遍历到的元素是否在另一数组中存在
			boolean flag = exist(arr1,arr2[i]);
			if(!flag) {//如果不存在，就拼接
				str = str + arr2[i] + " ";
			}
		}
		System.out.println(str);
		if(str.length() == 0) {
			System.out.println("不存在");
		} else {
			System.out.println("长度是" + str.length());
		}
	}
}

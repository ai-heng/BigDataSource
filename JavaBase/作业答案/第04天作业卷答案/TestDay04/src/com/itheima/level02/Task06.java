package com.itheima.level02;

import java.util.Random;

/*
 * 定义长度为10的int数组,数组中的10个元素为随机生成的1-100的数字,要求:按格式打印数组中的元素内容
	举例:
	数组原内容:{1,2,3,4,5}
	打印的内容:[1, 2, 3, 4, 5]
	分析:
		1.打印[
		2.遍历数组
			(1)打印当前元素
			(2)如果不是最后一个元素,则打印逗号空格及", "
		3.打印]
			

 */
public class Task06 {
	public static void main(String[] args) {
		//定义一个长度为10的int类型的数组
		int[] arr = new int[10];
		//定义Random对象
		Random r = new Random();
		//生成10个1-100的随机数为数组元素赋值
		for(int i = 0;i<arr.length;i++) {
			arr[i] = r.nextInt(100)+1;
		}
		
		// 1.打印[
		System.out.print("[");
		// 2.遍历数组
		for(int i = 0;i<arr.length;i++) {
		// (1)打印当前元素
			System.out.print(arr[i]);
		// (2)如果是最后一个元素,则打印逗号空格及", "
			if(i!=arr.length-1)
				System.out.print(", ");
		}
		// 3.打印]
		System.out.println("]");
		
	}
}

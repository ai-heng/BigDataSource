package com.itheima.level02;

import java.util.Random;

/*
 * 	将数字1-10保存到一个长度为10的一维数组中
	定义一个新数组,长度为3,取出原来数组中随机三个元素(不考虑是否重复)
	给新数组的元素赋值
	求新数组所有元素的和
 */
public class Task01 {
	public static void main(String[] args) {
		//将数字1-10保存到一个长度为10的一维数组中
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = i+1;
		}
		//定义一个新数组,长度为3,取出原来数组中随机三个元素(不考虑是否重复)
		int[] newArr = new int[3];
		for (int i = 0; i < newArr.length; i++) {
			Random r = new Random();
			//取出原来数组中的随机元素为新数组元素赋值
			int index = r.nextInt(arr.length);
			newArr[i] = arr[index];
		}
		
		//求新数组所有元素的和
		int sum = 0;
		for (int i = 0; i < newArr.length; i++) {
			System.out.println(newArr[i]);
			sum += newArr[i];
		}
		System.out.println("sum =" + sum);
	}
}

package com.itheima.level01;

/*
 * 已知数组int[] nums = {5,10,15},要求创建一个新数组
 * 1.新数组的长度和已知数组相同
 * 2.新数组每个元素的值 是已知数组对应位置元素的2倍
 * 3.在控制台中打印新数组的所有元素
 */
public class Task03 {
	public static void main(String[] args) {
		//1.定义已知数组int[] nums = {5,10,15}
		int[] nums = {5,10,15};
		//2.创建一个新数组，新数组的长度和已知数组相同
		int len = nums.length;
		int[] newArr = new int[len];
		//3.新数组每个元素的值 是已知数组对应位置元素的2倍
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = nums[i] * 2;//元素的值 是已知数组对应位置元素的2倍
		}
		//4.在控制台中打印新数组的所有元素
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + "  ");
		}
	}
}
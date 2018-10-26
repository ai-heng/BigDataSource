package com.itheima.level02;

import java.util.ArrayList;

/*
1.定义一个长度为10的int数组,并存入10个int类型的数据,其中有一些数据是重复的
2.利用集合的知识对数组进行去重,产生新数组,不能改变数组中原来数字的大小顺序
3.打印新数组中的内容
*/
public class Task01 {
	public static void main(String[] args) {
		int[] arr = {33, 22, 11, 33, 15, 66, 88, 22, 10, 97};
		
		ArrayList<Integer> list = new ArrayList<>();
		// 遍历数组
		for(int in : arr){
			// 判断集合中是否包含指定元素
			if(!list.contains(in))
				list.add(in);
		}
		
		int[] newArr = new int[list.size()];
		// 定义新集合的索引
		int index = 0;
		// 遍历集合，为新数组元素赋值
		for (int in : list) {
			newArr[index++] = in;
		}
	}
}

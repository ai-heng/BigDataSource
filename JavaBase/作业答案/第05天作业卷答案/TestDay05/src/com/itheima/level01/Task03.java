package com.itheima.level01;
/*
 * 主方法中给定数组int[] arr= {10,20,30,40,50,60};定义一个方法可以接受这个给定的数组
	并返回这个数组中元素的最小值
 */
public class Task03 {
	public static void main(String[] args) {
		//1. 给定数组int[] arr= {10,20,30,40,50,60}
		int[] arr= {10,20,30,40,50,60};
		//3. 调用方法，打印数组中元素的最小值
		System.out.println( getMin(arr) );
	}
	
	//2. 定义一个方法可以接受这个给定的数组,并返回这个数组中元素的最小值
	/*
	 * 指定方法的名称： getMin
	 * 指定方法的参数：int[] 
	 * 指定方法的返回值：int
	 */
	public static int getMin(int[] att){
		//定义一个变量，用来记录找到的最小值
		int min = att[0];
		//使用循环与数组中其他元素依次比较，最终得到最小值
		for (int i = 1; i < att.length; i++) {
			if (min > att[i]) {
				//更新最小值为当前数组元素值
				min = att[i];
			}
		}
		return min;
	}

	
}

package com.itheima;
/*
 * 需求：把获取数组最值改进为方法实现，并调用方法
 */
public class MethodTest2 {
	public static void main(String[] args) {
		//定义数组
		int[] arr = {24,36,90,75,81};
		
		//调用方法
		int max = getMax(arr);
		
		//输出结果
		System.out.println("max:"+max);
	}
	
	/*
	 * 数组获取最值的方法
	 * 
	 * 两个明确：
	 * 		返回值类型：int
	 * 		参数列表：int[] arr
	 */
	public static int getMax(int[] arr) {
		//定义参照物
		int max = arr[0];
		
		//遍历，获取元素，进行比较
		for(int x=1; x<arr.length; x++) {
			if(arr[x] > max) {
				max = arr[x];
			}
		}
		
		return max;
	}
}

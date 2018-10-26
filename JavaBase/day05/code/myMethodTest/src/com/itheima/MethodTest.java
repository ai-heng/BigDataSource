package com.itheima;
/*
 * 需求：把遍历数组改进为方法实现，并调用方法
 */
public class MethodTest {
	public static void main(String[] args) {
		//定义数组
		int[] arr = {11,22,33,44,55};
		
		//调用方法
		//printArray(arr);
		
		//我们已经实现了需求，但是我觉得这个效果不好看，我想要如下的效果可以吗
		//[元素1, 元素2, 元素3, ...]
		//我们的结果应该是这样的：[11, 22, 33, 44, 55]
		printArray(arr);
	}
	
	/*
	 * 遍历数组的方法。
	 * 
	 * 两个明确：
	 * 		返回值类型：void
	 * 		参数列表：int[] arr
	 */
	/*
	public static void printArray(int[] arr) {
		for(int x=0; x<arr.length; x++) {
			System.out.println(arr[x]);
		}
	}
	*/
	public static void printArray(int[] arr) {
		System.out.print("[");
		for(int x=0; x<arr.length; x++) {
			if(x == arr.length-1) {
				//判断是否是最后一个元素
				System.out.print(arr[x]);
			}else {
				System.out.print(arr[x]+", ");
			}
			
		}
		System.out.println("]");
	}
}

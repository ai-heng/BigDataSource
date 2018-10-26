package com.itheima.level01;
/*
 * 定义一个方法,求出给定的数字在给定int型数组中出现的次数,如果一次没有出现则返回0
	如:给定数字3 求出3在数组 int[] arr = {3,4,3,5,7,9};中出现的次数 
 */
public class Task05 {
	public static void main(String[] args) {
		//1.指定要查找的数字
		int key = 3;
		//2.指定数组
		int[] arr = {3,4,3,5,7,9};
		//3.求出给定的数字在给定int型数组中出现的次数
		int count = getCount(arr, 3);
		System.out.println("出现的次数:" + count);
		
	}
	
	/*
	 * 求出给定的数字在给定int型数组中出现的次数
	 * 指定方法的名称： getCount
	 * 指定方法的参数： int[] arr,  int key
	 * 指定方法的返回值： int 
	 */
	public static int getCount(int[] arr, int key){
		//1.记录key出现的次数
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			//比较数组元素与key至是否相同
			if (arr[i] == key) {
				//key出现的次数 + 1
				count++;
			}
		}
		return count;
	}
}

package com.itheima;
/*
 * 需求：数组获取最值(获取数组中的最大值最小值)
 */
public class ArrayOperatorDemo2 {
	public static void main(String[] args) {
		//定义一个数组
		int[] arr = {12,45,98,73,60};
		
		//定义参照物
		int max = arr[0];
		
		//从第二个元素开始遍历
		for(int x=1; x<arr.length; x++) {
			if(arr[x] > max) {
				//如果元素比max大，那么，就留下来继续做参照物
				max = arr[x];
			}
		}
		
		//输出max就可以了
		System.out.println("max:"+max);
		System.out.println("----------------------");
		
		//定义参照物
		int min = arr[0];
		
		for(int x=1; x<arr.length; x++) {
			if(arr[x] < min) {
				min = arr[x];
			}
		}
		
		System.out.println("min:"+min);
	}
}

package com.itheima_04;
/*
 * 两个常见小问题：
 * 		ArrayIndexOutOfBoundsException:数组索引越界异常
 * 			如何产生的呢?我们访问了不存在的索引。
 * 
 * 		NullPointerException:空指针异常
 * 			如何产生的呢?null是指不再指向堆内存的数据，而我们还在访问堆内存的数据
 */
public class ArrayDemo {
	public static void main(String[] args) {
		//定义数组
		int[] arr = {1,2,3};
		
		//访问数组中的元素
		//System.out.println(arr[3]);
		
		//引用数据类型：类，接口，数组
		//常量：null，它是可以赋值给引用数据类型的，表示该引用不再指向堆内存的数据
		arr = null;
		System.out.println(arr[1]);
	}
}

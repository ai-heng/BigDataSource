package com.itheima.tests;

import java.util.Arrays;

/*
 * 已知字符串数组String[] arr={“am”,”ieh”,”ia”,”ow” };,
 * 将该数组中的每一个字符串进行反转,然后重新拼接成新的字符串,并将结果打印到控制台上.
 */
public class Test3_03 {
	public static void main(String[] args) {
		String[] arr={"am","ieh","ia","ow" };
		
		String[] arrnew = new String[arr.length];
		
		for (int j = 0; j < arr.length; j++) {
			//取它的一个元素放到StringBuiler里
			StringBuilder sb = new StringBuilder(arr[j]);
			//利用sb的反转方法，对字符串进行返回
			sb.reverse();
			//把结果再放到arrnew里
			arrnew[j] = sb.toString();
			
		}
			
		System.out.println(Arrays.toString(arrnew));
		
	}
}

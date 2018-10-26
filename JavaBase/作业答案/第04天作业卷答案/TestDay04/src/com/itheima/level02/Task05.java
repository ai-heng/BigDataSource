package com.itheima.level02;

import java.util.Arrays;
import java.util.Random;

/*
 * 定义长度为10的int数组,数组中的10个元素为随机生成的1-100的数字,要求:打印数组中第二大的数和第二小的数字
 */
public class Task05 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		Random r = new Random();
		for(int i = 0;i<arr.length;i++) {
			arr[i] = r.nextInt(100)+1;
		}
		//为了方便查看结果,先对数组中的元素按照从小到大的顺序排序
		
		//Arrays.sort(arr);
		System.out.println("原数组内容");
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//打印数组中第二大的数
		int firstMax = Integer.MIN_VALUE,secondMax = Integer.MIN_VALUE;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] > secondMax) {
				if(arr[i] > firstMax) {
					secondMax = firstMax;
					firstMax = arr[i];
				} else {
					secondMax = arr[i];
				}
			}
		}
		System.out.println("数组中的第二大的数字为:"+secondMax);
		//打印数组中第二小的数
		int firstMin = Integer.MAX_VALUE,secondMin = Integer.MAX_VALUE;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] < secondMin) {
				if(arr[i] < firstMin) {
					secondMin = firstMin;
					firstMin = arr[i];
				} else {
					secondMin = arr[i];
				}
			}
		}
		System.out.println("数组中的第二小的数字为:"+secondMin);
	}
}

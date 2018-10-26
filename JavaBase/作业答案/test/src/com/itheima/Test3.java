package com.itheima;

import java.util.Arrays;
import java.util.Random;

/*
3、	随机生成20个1-100之间的整数，存入数组中。
	a)	输出它们的平均值
	b)	输出与平均值相差最小的数组元素

 */
public class Test3 {

	public static void main(String[] args) {
		// 随机数对象
		Random r = new Random();
		// 数组
		int[] arr = new int[20];
		// 生成20个存入数组中
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100) + 1;
		}
		// 看一下
		System.out.println(Arrays.toString(arr));
		
		// 定义方法求数组的平均值
		double avg = getAvg(arr);
		System.out.println("平均值：" + avg);
		
		// 定义方法获取与平均值相差最小的元素
		int value = getElementNearAvg(arr, avg);
		System.out.println("与平均值相差最小的元素是：" + value);
	}
	
	/*
	 * 返回值类型： int
	 * 参数列表：int[] arr, double avg
	 */
	public static int getElementNearAvg(int[] arr, double avg) {
		// 参照物
		int e = arr[0];
		// 循环查找
		for (int i = 1; i < arr.length; i++) {
			// 计算每个元素与平均值的差值
			double cha = avg > arr[i] ? avg - arr[i] : arr[i] - avg;
			// 或者取绝对值
			//double cha = Math.abs(avg - arr[i]);
			
			// 注意：比较的是差值
			if (cha < Math.abs(avg - e)) {
				e = arr[i];
			}
		}
		return e;
	}
	
	/*
	 * 返回值类型 double
	 * 参数列表 int[] arr
	 */
	public static double getAvg(int[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum / arr.length;
	}

}

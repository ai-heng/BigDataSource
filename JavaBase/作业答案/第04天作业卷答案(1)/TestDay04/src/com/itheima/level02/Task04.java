package com.itheima.level02;

import java.util.Scanner;

/*
	假设有一个长度为5的数组，数组元素通过键盘录入，如下所示：
	int[] arr = {1,3,-1,5,-2}
	要求：
		创建一个新数组newArr[],新数组中元素的存放顺序与原数组中的元素逆序，并且如果原数组中的元素值小于0，
		在新数组中按0存储。最后输出原数组和新数组中的内容
	分析：
		1.创建键盘录入对象
		2.定义长度为5的int类型的数组arr
		3.利用for循环通过键盘录入给数组元素赋值
		4.定义长度为5的int类型的新数组newArr，定义int类型的变量index=0，用来表示新数组的元素索引
		5.倒着遍历原数组
			(1)定义int类型的变量num，并将数组当前元素的值赋值给num
			(2)使用if判断num的值
				a.如果num>=0,直接将num赋值给新数组的当前元素，index++
				b.否则直接将0复制给新数组的当前元素，index++
		6.打印原数组和新数组的内容（利用for循环）
 */
public class Task04 {
	public static void main(String[] args) {
//		1.创建键盘录入对象
		Scanner sc = new Scanner(System.in);
//		2.定义长度为5的int类型的数组arr
		int[] arr = new int[5];
//		3.利用for循环通过键盘录入给数组元素赋值
		System.out.println("请输入5个整数：");
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
//		4.定义长度为5的int类型的新数组newArr，定义int类型的变量index=0，用来表示新数组的元素索引
		int[] newArr = new int[5];
		int index = 0;
//		5.倒着遍历原数组
		for(int i = arr.length-1;i>=0;i--) {
//			(1)定义int类型的变量num，并将数组当前元素的值赋值给num
			int num = arr[i];
//			(2)使用if判断num的值
			if(num>=0) {//a.如果num>=0,直接将num赋值给新数组的当前元素，index++
				newArr[index] = num;
//				index++;
			} else {
//				b.否则直接将0复制给新数组的当前元素，index++
				newArr[index] = 0;
//				index++;
			}
			index++;
		}
//		6.打印原数组和新数组的内容（利用for循环）
		System.out.println("原数组内容：");
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("新数组内容：");
		for(int i = 0;i<newArr.length;i++) {
			System.out.print(newArr[i]+" ");
		}
		System.out.println();
		
	}
}

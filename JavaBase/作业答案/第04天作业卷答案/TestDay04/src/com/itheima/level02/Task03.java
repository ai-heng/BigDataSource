package com.itheima.level02;

import java.util.Scanner;

/*
	从键盘上输入10个整数，合法值位1、2或3，不是这3个数则为非法数字。试编程统计每个整数和非法数字的个数。
	分析：
		1.创建键盘录入对象
		2.定义长度为10的int类型的数组
		3.定义int类型的变量count1（统计1的个数）、count2（统计2的个数）、count3（统计3的个数）、count4（统计非法数字的个数）
		4.利用for循环给数组元素赋值
		5.利用for循环遍历数组
			(1)获取当前元素
			(2)使用if进行判断
				a.如果等于1 count1++
				b.否则，如果等于2 count2++
				c.否则，如果等于3 count3++
				d.否则 count4++
				
		6.打印统计结果
		
 */
public class Task03 {
	public static void main(String[] args) {
//		1.创建键盘录入对象
		Scanner sc = new Scanner(System.in);
//		2.定义长度为10的int类型的数组
		int[] arr = new int[10];
//		3.定义int类型的变量count1（统计1的个数）、count2（统计2的个数）、count3（统计3的个数）、count4（统计非法数字的个数）
		int count1 = 0,count2 = 0,count3 = 0,count4 = 0;
//		4.利用for循环给数组元素赋值
		System.out.println("请输入10个整数：");
		for(int i = 0;i < arr.length; i++)  {
			arr[i] = sc.nextInt();
		}
//		5.利用for循环遍历数组
		for(int i = 0;i < arr.length;i++) {
//			(1)获取当前元素
			int num = arr[i];
//			(2)使用if进行判断
			if(num == 1) { //a.如果等于1 count1++
				count1++;
			} else if(num == 2) {//b.否则，如果等于2 count2++
				count2++;
			} else if(num == 3) {//c.否则，如果等于3 count3++
				count3++;
			} else {//d.否则 count4++
				count4++;
			}
		}
//		6.打印统计结果
		System.out.println("数字1的个数：" + count1);
		System.out.println("数字2的个数：" + count2);
		System.out.println("数字3的个数：" + count3);
		System.out.println("非法数字的个数：" + count4);
	}
}






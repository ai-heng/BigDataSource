package com.itheima.level02;

import java.util.Random;
import java.util.Scanner;

/*
 	分析以下需求，并用代码实现
	1.键盘录入班级人数
	2.根据录入的班级人数创建数组
	3.利用随机数产生0-100的成绩(包含0和100)
	4.要求:
		(1)打印该班级的不及格人数
		(2)打印该班级的平均分
		(3)演示格式如下:
			请输入班级人数:
			键盘录入:100
			控制台输出:
				不及格人数:19
				班级平均分:87
	分析：
		1.创建键盘录入对象
		2.定义int类型的变量num，并通过键盘录入给num赋值
		3.创建int类型的数组，数组长度为num
		4.创建Random对象
		5.遍历数组
			(1)随机产生[0-100]的值
			(2)将随机产生的数值赋值给数组中的当前元素
		6.定义变量count用于统计不及格学员数量，定义变量sum用于统计总分
		7.遍历数组
			(1)将当前元素的值累加到sum中
			(2)判断当前元素的值如果<60,count++
		8.打印不及格数量和平均分（sum/num）
 
 */
public class Task02 {
	public static void main(String[] args) {
//		1.创建键盘录入对象
		Scanner sc = new Scanner(System.in);
//		2.定义int类型的变量num，并通过键盘录入给num赋值
		System.out.println("请输入班级人数:");
		int num = sc.nextInt();
//		3.创建int类型的数组，数组长度为num
		int[] arr = new int[num];
//		4.创建Random对象
		Random r = new Random();
//		5.遍历数组
		for(int i = 0;i<arr.length;i++) {
//			(1)随机产生[0-100]的值
			int score = r.nextInt(101);
//			(2)将随机产生的数值赋值给数组中的当前元素
			arr[i] = score;
		}
//		6.定义变量count用于统计不及格学员数量，定义变量sum用于统计总分
		int count = 0;
		int sum = 0;
//		7.遍历数组
		for(int i = 0;i<arr.length;i++) {
//			(1)将当前元素的值累加到sum中
			sum+=arr[i];
//			(2)判断当前元素的值如果<60,count++
			if(arr[i]<60)
				count++;
		}
//		8.打印不及格数量和平均分（sum/num）
		System.out.println("不及格人数:"+count);
		System.out.println("班级平均分:"+sum/num);
		
	}
}

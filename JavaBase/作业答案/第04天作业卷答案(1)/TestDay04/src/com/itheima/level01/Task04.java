package com.itheima.level01;

import java.util.Random;
import java.util.Scanner;

/*
 * 键盘录入一个整数，创建一个该长度的数组，为每一个元素赋值为1-10的随机整数，最后打印数组中所有值大于5且为偶数的元素.
 */
public class Task04 {
	public static void main(String[] args) {
		//1. 键盘录入一个整数
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		//2. 通过输入的整数，创建数组
		int[] arr = new int[len];
		//3. 数组元素赋值（循环的方式）
		System.out.print("arr数组元素值为：");
		for (int i = 0; i < arr.length; i++) {
			//每一个元素赋值为1-10的随机整数
			Random r = new Random();
			int n = r.nextInt(10) + 1;//1-10的随机整数
			arr[i] = n;//给数组元素赋值
			
			System.out.print(arr[i] + "  ");
		}
		//4. 打印数组元素值
		System.out.println();
		System.out.print("满足条件的元素为：");
		for (int i = 0; i < arr.length; i++) {
			//获取数组元素到n中
			int n = arr[i];
			//元素值大于5且为偶数的元素
			if (n>5 && n%2==0) {
				System.out.print(n + "  ");
			}
		}
	}
}

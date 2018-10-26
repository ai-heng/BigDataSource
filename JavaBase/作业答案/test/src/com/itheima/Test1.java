package com.itheima;

import java.util.Scanner;

/*
 * 分析：
 * 	1、观察发现需要打印的图形是一个三角形，需要for循环的嵌套
 *  2、行数由键盘录入，每行需要打印的数据恰好等于该行的行数
 *  3、打印的数据是依次递增的，需要定义一个变量，每打印一次，变量自增1
 */
public class Test1 {

	public static void main(String[] args) {
		// 键盘录入
		Scanner sc = new Scanner(System.in);
		// 输入行数
		System.out.println("请输入行数，范围1-10：");
		int line = sc.nextInt();
		// 需要打印的数据
		int num = 1;
		// 循环嵌套
		for (int i = 0; i < line; i++) { // 行数
			// 每行打印的个数
			for (int j = 0; j <= i; j++) {
				// 打印数据，注意别换行
				System.out.print(num++ + "\t"); // 转义字符
			}
			// 每行打印完成，打印一个换行
			System.out.println();
		}
		
		sc.close();
	}
}

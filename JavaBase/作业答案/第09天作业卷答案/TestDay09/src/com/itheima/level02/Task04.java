package com.itheima.level02;

import java.util.Scanner;

/*
分析以下需求,并用代码实现
	1.键盘录入一个字符串
	2.将该字符串变成字符数组(不能使用toCharArray()方法)
	3.将字符数组中的所有大写字母变成小写字母(不能使用toLowerCase()方法)
	4.如果第一位和最后一位的内容不相同,则交换
	5.将字符数组中索引为偶数的元素变成'~'
	6.打印数组元素的内容
*/
public class Task04 {
	public static void main(String[] args) {
		// 1.键盘录入一个字符串
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		// 2.将该字符串变成字符数组(不能使用toCharArray()方法)
		char[] chs = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			chs[i] = str.charAt(i);
			// 3.将字符数组中的所有大写字母变成小写字母(不能使用toLowerCase()方法)
			if (chs[i] >= 'A' && chs[i] <= 'Z') {
				chs[i] += 32;
			}
		}
		// 4.如果第一位和最后一位的内容不相同,则交换
		if (chs[0] != chs[chs.length - 1]) {
			char temp = chs[0];
			chs[0] = chs[chs.length - 1];
			chs[chs.length - 1] = temp;
		}

		for (int i = 0; i < chs.length; i++) {
			// 5.将字符数组中索引为偶数的元素变成'~'
			if (i % 2 == 0) {
				chs[i] = '~';
			}
			// 6.打印数组元素的内容
			System.out.print(chs[i] + " ");
		}
	}
}
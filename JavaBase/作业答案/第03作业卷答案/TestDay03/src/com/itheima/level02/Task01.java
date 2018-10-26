package com.itheima.level02;

import java.util.Scanner;

/*
 * 分析以下需求，并用代码实现：
	1.珠穆朗玛峰高度为8848米，有一张足够大的纸，厚度为0.0001米。
	2.请问，我折叠多少次，可以折成珠穆朗玛峰的高度。
 */
public class Task01 {
	public static void main(String[] args) {
		int count = 0;
		int mountainHigh = 8848000;//毫米
		int paperHigh = 1;//毫米
		while(paperHigh<mountainHigh) {
			paperHigh*=2;
			count++;
//			System.out.println(paperHigh);
		}
		System.out.println("总共折了 "+ count+" 次，最后纸张的高度："+paperHigh);
	}
}

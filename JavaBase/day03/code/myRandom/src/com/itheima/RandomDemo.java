package com.itheima;

import java.util.Random;

/*
 * Random:用于产生随机数的类。用法和Scanner类似。
 * 
 * 使用步骤：
 * 		A:导包
 * 			import java.util.Random;
 * 		B:创建对象
 * 			Random r = new Random();
 * 		C:获取随机数
 * 			int number = r.nextInt(10);
 * 			获取的范围：[0,10)	包括0，不包括10
 */
public class RandomDemo {
	public static void main(String[] args) {
		//创建对象
		Random r = new Random();
		
		for(int x=1; x<=10; x++) {
			//获取随机数
			int number = r.nextInt(10);
			System.out.println("number:"+number);
		}
		System.out.println("--------------");
		
		//如何获取一个1-100之间的随机数呢?
		int i = r.nextInt(100)+1;
		System.out.println(i);
	}
}

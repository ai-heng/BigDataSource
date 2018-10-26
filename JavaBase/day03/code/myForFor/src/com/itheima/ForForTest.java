package com.itheima;
/*
 * 需求：请输出如下图形
 *			*
 *			**
 *			***
 *			****
 *			*****
 */
public class ForForTest {
	public static void main(String[] args) {
		//通过简单的观察，我们发现这是一个5行的，列数变化的形状
		//首先来实现一个5行5列的形状
		for(int x=1; x<=5; x++) {
			for(int y=1; y<=5; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------------");
		
		//虽然我们实现了一个5行5列的形状
		//但是这不是我们想要的
		//我们要的形状是列数变化的
		//怎么办呢?
		//第一行：1	y=1; y<=1
		//第二行：2	y=1; y<=2
		//第三行：3	y=1; y<=3
		//第四行：4	y=1; y<=4
		//第五行：5	y=1; y<=5
		//我们需要一个变量的变量是从1开始，到5结束
		int z = 1;
		for(int x=1; x<=5; x++) {
			for(int y=1; y<=z; y++) {
				System.out.print("*");
			}
			System.out.println();
			z++;
		}
		System.out.println("----------------------");
		
		//我们现在已经实现了我们的需求，但是我们继续观察会发现
		//第一次：x的值是1
		//第二次：x的值是2
		//...
		//x和z是一样的变化过程，这样的话，我们就可以省略z，直接用x替代
		for(int x=1; x<=5; x++) {
			for(int y=1; y<=x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------------");
	}
}

package com.itheima;
/*
 * 需求：请输出一个4行5列的星星(*)图案。
 * 结果：
 * 		*****
 * 		*****
 * 		*****
 * 		*****
 * 
 * 循环嵌套：就是循环体语句本身是一个循环语句。
 * 
 * 结论：
 * 		外循环控制的是行，内循环控制的是列
 */
public class ForForDemo {
	public static void main(String[] args) {
		//原始的做法
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("-------------------");
		
		//虽然我们完成了题目的要求，但是不好
		//假如我们有很多这样的要求，而且行和列是变化的
		//所以我们要改进目前的代码的写法
		//我要在一行上输出一颗*
		//System.out.println("*");
		//我要在一行上输出5颗*
		/*
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		*/
		//之所以出现这样的结果，是因为System.out.println()每次把内容输出后加一个换行
		//有解决方案呢?有
		//用System.out.print()就可以解决
		/*
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		*/
		
		/*
		//用循环改进代码
		for(int x=1; x<=5; x++) {
			System.out.print("*");
		}
		//采用下面的内容就可以实现换行
		System.out.println();
		
		//第二行的5颗*
		for(int x=1; x<=5; x++) {
			System.out.print("*");
		}
		System.out.println();
		
		//第三行的5颗*
		for(int x=1; x<=5; x++) {
			System.out.print("*");
		}
		System.out.println();
		
		//第四行的5颗*
		for(int x=1; x<=5; x++) {
			System.out.print("*");
		}
		System.out.println();
		*/
		//重复的代码执行多次，用循环改进
		for(int y=1; y<=4; y++) {
			for(int x=1; x<=5; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------------");
		
		for(int y=1; y<=7; y++) {
			for(int x=1; x<=8; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

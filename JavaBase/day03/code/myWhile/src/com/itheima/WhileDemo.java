package com.itheima;
/*
 * while循环的语句格式：
 * 		while(判断条件语句) {
 * 			循环体语句;
 * 		}
 * 
 * 完整格式：
 * 		初始化语句;
 * 		while(判断条件语句) {
 * 			循环体语句;
 * 			控制条件语句;
 * 		}
 * 
 * 回顾for循环的语句格式：
 * 		for(初始化语句;判断条件语句;控制条件语句) {
 * 			循环体语句;
 * 		}
 */
public class WhileDemo {
	public static void main(String[] args) {
		//在控制台输出5次HelloWorld
		//for循环实现
		/*
		for(int x=1; x<=5; x++) {
			System.out.println("HelloWorld");
		}
		System.out.println("--------------");
		*/
		
		//while循环实现
		int x=1;
		while(x<=5) {
			System.out.println("HelloWorld");
			x++;
		}
	}
}

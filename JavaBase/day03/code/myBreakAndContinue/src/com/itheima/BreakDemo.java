package com.itheima;
/*
 * break:中断的意思
 * 
 * 使用场景：
 * 		A:switch语句中，用于结束switch语句
 * 		B:循环语句中，用于结束循环
 * 如何使用：
 * 		A:跳出单层循环
 * 		B:跳出多层循环
 * 			用带标签的语句格式。
 */
public class BreakDemo {
	public static void main(String[] args) {
		//break可以用于结束当前的循环。
		for(int x=1; x<=5; x++) {
			if(x == 3) {
				break;
			}
			System.out.println("HelloWorld");
		}
		System.out.println("-----------------------");
		
		//如果是多层循环，break到底结束的是哪个循环呢?
		//break结束的是离他最近的那个循环
		//如果我要跳出外层循环，可不可以呢?
		//可以。如何实现呢?
		//带标签的语句：
		//格式：标签名:语句
		wc:for(int x=1; x<=3; x++) {
			nc:for(int y=1; y<=4; y++) {
				if(y == 2) {
					break wc;
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

package com.itheima;
/*
 * continue:继续的意思
 * 
 * 使用场景：
 * 		循环中。离开使用场景是没有意义的。
 * 
 * break和continue的区别：
 * 		break:跳出整个循环
 * 		continue:跳出这一次的操作，进入下一次的执行
 */
public class ContinueDemo {
	public static void main(String[] args) {
		for(int x=1; x<=5; x++) {
			if(x == 3) {
				continue;
			}
			System.out.println("HelloWorld"+x);
		}
	}
}

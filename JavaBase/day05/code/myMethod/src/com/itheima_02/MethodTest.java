package com.itheima_02;
/*
 * 需求：写一个方法，把所有的水仙花数打印在控制台
 */
public class MethodTest {
	public static void main(String[] args) {
		//调用方法
		printFlower();
	}
	
	/*
	 * 把所有的水仙花数打印在控制台
	 * 
	 * 两个明确：
	 * 		返回值类型：void
	 * 		参数列表：
	 */
	public static void printFlower() {
		for(int x=100; x<1000; x++) {
			int ge = x%10;
			int shi = x/10%10;
			int bai = x/10/10%10;
			
			if((ge*ge*ge+shi*shi*shi+bai*bai*bai) == x) {
				System.out.println(x);
			}
		}
	}
}

package com.itheima;
/*
 * 需求：求1-100之间的数据和。
 */
public class WhileTest {
	public static void main(String[] args) {
		//for循环实现
		/*
		//定义求和变量
		int sum = 0;
		
		for(int x=1; x<=100; x++) {
			//累加即可
			sum += x;
		}
		
		//输出结果
		System.out.println("sum:"+sum);
		*/
		
		//while循环实现
		//定义求和变量
		int sum = 0;
		
		int x=1;
		while(x<=100) {
			//累加即可
			sum += x;
			x++;
		}
		
		//输出结果
		System.out.println("sum:"+sum);
	}
}

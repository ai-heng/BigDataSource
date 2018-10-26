package com.itheima;
/*
 * 需求：求出1-5之间数据之和
 * 
 * 分析：
 * 		A:定义一个求和变量，初始化值是0
 * 		B:获取1-5的数据，用for循环就可以实现
 * 		C:把每一次获取到的数据累加到求和变量
 * 		D:输出求和变量
 */
public class ForTest2 {
	public static void main(String[] args) {
		//定义一个求和变量，初始化值是0
		int sum = 0;
		
		//获取1-5的数据，用for循环就可以实现
		for(int x=1; x<=5; x++) {
			//把每一次获取到的数据累加到求和变量
			//sum = sum + x;
			sum += x;
			/*
			 * 第一次：sum = sum + x = 0 + 1 = 1
			 * 第二次：sum = sum + x = 1 + 2 = 3
			 * 第三次：sum = sum + x = 3 + 3 = 6
			 * 第四次：sum = sum + x = 6 + 4 = 10
			 * 第五次：sum = sum + x = 10 + 5 = 15
			 */
		}
		
		//输出求和变量
		System.out.println("sum:"+sum);
	}
}

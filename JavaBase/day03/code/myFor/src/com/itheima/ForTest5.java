package com.itheima;
/*
 * 需求：统计”水仙花数”共有多少个
 * 
 * 分析：
 * 		A:定义统计变量，初始化值是0
 * 		B:获取三位数，用for循环实现
 * 		C:获取每个位上的数据
 * 		D:判断数据是否是水仙花数
 * 			如果是，就统计变量++
 * 		E:输出统计变量
 */
public class ForTest5 {
	public static void main(String[] args) {
		//定义统计变量，初始化值是0
		int count = 0;
		
		//获取三位数，用for循环实现
		for(int x=100; x<1000; x++) {
			//获取每个位上的数据
			int ge = x%10;
			int shi = x/10%10;
			int bai = x/10/10%10;
			
			//判断数据是否是水仙花数
			if((ge*ge*ge+shi*shi*shi+bai*bai*bai) == x){
				//如果是，就统计变量++
				count++;
			}
		}
		
		//输出统计变量
		System.out.println("水仙花的个数是："+count);
	}
}

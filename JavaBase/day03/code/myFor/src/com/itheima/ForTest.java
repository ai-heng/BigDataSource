package com.itheima;
/*
 * 需求：获取数据1-5和5-1
 */
public class ForTest {
	public static void main(String[] args) {
		//原始做法
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println("-------------");
		
		//for循环改进
		for(int x=1; x<=5; x++) {
			System.out.println(x);
		}
		System.out.println("-------------");
		
		//获取数据5-1
		for(int x=5; x>=1; x--) {
			System.out.println(x);
		}
		System.out.println("-------------");
		
	}
}

package com.itheima.tests;
/*
 * 需求: 将1-100之间所有的质数, 按照5个一行,中间用空格隔开的格式打印到控制台上.
	格式如下
	质数是一个只能被1和它本身整除的数  2  3  5  7  11  13  17  19 
	
 */
public class Test3_01 {
	public static void main(String[] args) {
		
		int count = 0;
		
		for (int i = 2; i < 100; i++) {//13
			boolean flag = true;//我先认为i是一个质数
			for (int j = 2; j < i; j++) {
				if(i%j==0){
					//不是一个质数
					flag = false;//发现它可以被别的数整除，把标识位置为false
				}
			}
//			if(flag==true){
			if(flag){
				System.out.print(i +" ");
				count++;
				if(count%5==0){
					System.out.println();
				}
			}
		}
	}
}

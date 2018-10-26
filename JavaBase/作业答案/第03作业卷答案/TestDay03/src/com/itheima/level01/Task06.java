package com.itheima.level01;

import java.util.Random;
import java.util.Scanner;

/*
 * 需求：猜数字小游戏。
 * 		系统产生一个1-100之间的随机数，请猜出这个数据是多少?
 * 
 * 分析：
 * 		A:系统产生一个1-100之间的随机数
 * 			Random r = new Random();
 * 			int number = r.nextInt(100)+1;
 * 		B:键盘录入我们要猜的数据
 * 		C:比较这两个数据，看我们猜的是否正确
 * 			如果大了，提示：你猜的数据大了
 * 			如果小了，提示：你猜的数据小了
 * 			如果相等，提示：恭喜你，猜中了
 * 		D:为了实现多次猜数据，我们就要加入循环，而我们又不知道猜多少次能中。怎么办呢?
 * 			死循环：while(true) {...}
 * 				 for(;;) {...}
 */
public class Task06 {
	public static void main(String[] args) {
		//系统产生一个1-100之间的随机数
		Random r = new Random();
		//获取随机数
		int number = r.nextInt(100)+1;
		
		//多次猜数据
		while(true) {
			//创建键盘录入对象
			Scanner sc = new Scanner(System.in);
			//给出提示
			System.out.println("请输入你要猜的整数(1-100)：");
			int guessNumber = sc.nextInt();
			
			//比较这两个数据，看我们猜的是否正确
			if(guessNumber > number) {
				System.out.println("你猜的数据"+guessNumber+"大了");
			}else if(guessNumber < number) {
				System.out.println("你猜的数据"+guessNumber+"小了");
			}else {
				System.out.println("恭喜你，猜中了");
				break; //跳出循环
			}
		}
	}
}

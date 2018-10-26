package com.itheima.level02;

import java.util.Scanner;
/*
 * 分析以下需求，并用代码实现：
	1.按照从大到小的顺序输出四位数中的个位+百位=十位+千位(3553,2332,1166,8228,3773)的数字及个数
	2.每行输出5个满足条件的数，之间用空格分隔
	3.如：9999 9988 9977 9966 9955 	
	分析：
	1.定义计数器（用于实现打印数字时5个一行）
	2.遍历1000-9999
		(1)获取四位数字的个位(ge)，十位(ten)，百位(bai)，千位(qian)
		(2)进行逻辑判断，当(个位+百位=十位+千位)时
			a.计数器+1
			b.打印该数字
			c.判断计数器是否能被5整除
				A.如果能被5整除，打印换行
 */
public class Task03 {
	public static void main(String[] args) {
//		1.定义计数器（用于实现打印数字时5个一行）
		int count = 0;
//		2.遍历1000-9999
		for(int i = 1000;i<=9999;i++) {
//			(1)获取四位数字的个位(ge)，十位(ten)，百位(bai)，千位(qian)
			int ge = i%10;
			int shi = i/10%10;
			int bai = i/100%10;
			int qian = i/1000%10;
//			(2)进行逻辑判断，当(个位+百位=十位+千位)时
			if((ge+bai)==(shi+qian)) {
//				a.计数器+1
				count++;
//				b.打印该数字
				System.out.print(i+" ");
//				c.判断计数器是否能被5整除
				if(count%5==0)
					System.out.println();//A.如果能被5整除，打印换行

			}
		}
	}
}

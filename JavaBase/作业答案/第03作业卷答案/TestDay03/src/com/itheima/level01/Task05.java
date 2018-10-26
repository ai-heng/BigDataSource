package com.itheima.level01;
/*
 * 	2个一行打印水仙花数（中间用空格隔开）,最后打印水仙花输的总数
 */
public class Task05 {
	public static void main(String[] args) {
		int count = 0;
		//通过循环获取到每一个三位数
		for(int x=100; x<1000; x++) {
			//获取个位，十位，百位
			int ge = x%10;
			int shi = x/10%10;
			int bai = x/10/10%10;
			if(ge*ge*ge+shi*shi*shi+bai*bai*bai== x) {				
				System.out.print(x+" ");
				count++;
				if(count%2==0)
					System.out.println();
			}
		}
		System.out.println("总共有 "+count+" 个水仙花数");
	}
}

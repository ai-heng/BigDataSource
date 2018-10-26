package com.itheima.level02;

import java.util.Scanner;

/*
分析以下需求，并用代码实现
	1.键盘录入一个大字符串,再录入一个小字符串
	2.统计小字符串在大字符串中出现的次数
	3.代码运行打印格式:
		请输入大字符串:woaiheima,heimabutongyubaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma
		请输入小字符串:heima
		控制台输出:小字符串heima,在大字符串woaiheima,heimabutongyubaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma中共出现3次
 */
public class Task02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1.键盘录入一个大字符串,再录入一个小字符串
		System.out.print("请输入大字符串:");
		String big = sc.nextLine();
		System.out.print("请输入小字符串:");
		String small = sc.nextLine();
		// 2.统计小字符串在大字符串中出现的次数
		int count = getCount(big, small);
		// 3.代码运行打印格式:
		System.out.println("小字符串"+ small +",在大字符串"+ big +"中共出现"+ count +"次");
	}

	/*
	 * 方法功能：统计小字符串在大字符串中出现的次数
	 * 参数：big 代表大字符串
	 * 参数：small 代表小字符串
	 * 返回值：小字符串在大字符串中出现的次数
	 */
	public static int getCount(String big, String small) {
		int index = 0;
		int count = 0;
		/*
		 * indexOf(String str, int fromIndex) 
		 * 该方法作用：从fromIndex位置开始查找，字符串str第一次出现的位置；若没找到，放回-1
		 */
		while((index = big.indexOf(small, index)) != -1){
			index++;
			count++;
		}
		return count;
	}
}

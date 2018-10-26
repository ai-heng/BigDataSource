package com.itheima.level02;

import java.util.Scanner;

/*
 * 分析以下需求，并用代码实现
	1.键盘录入一个整数(正数或者负数都可以,但是符号位不算有效的数字位)
	2.定义一个方法,该方法的功能是计算该数字是几位数字,并将位数返回
	3.在main方法中打印该数字是几位数
	4.演示格式如下:
		(1)演示一:
			请输入一个整数:1234
			控制台输出:1234是4位数字
		(2)演示二:
			请输入一个整数:-34567           3456   345   34  4
			控制台输出:-34567是5位数字
			
	思路：
	1位数 除1次10 等于0
	2位数 除2次10 等于0
	3位数 除3次10 等于0
	4位数 除4次10 等于0
	
	方法参数：一个数字 int
	返回值：几位数 int
	
	1.定义一个计数器，用来记录位数
	2.使用while循环，一直除10，每次除10，就把计数器+1，知道结果等于0，就跳出循环
 */
public class Task05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请您输入一个数字");
		int num = sc.nextInt();
		int weishu = getWeiShu(num);
		System.out.println("这个数的位数是:"+weishu);
	}
	public static int getWeiShu(int num) {
		//定义一个计数器，用来记录位数
		int count = 1;//位数是从1开始
		while(true) {//死循环除 
			num /= 10;//每次除10
			if(num == 0) {//结果等于0，就跳出循环
				break;
			}
			count ++;//如果除10不等于0，就把位数+1
		}
		return count;
	}
}

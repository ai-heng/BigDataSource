package com.itheima.level02;

import java.util.Scanner;

/*
	分析以下需求，并用代码实现
	1.商场推出幸运抽奖活动，抽奖规则如下：
		(1)键盘录入四位数字(1000-9999的数字),作为顾客的会员卡号
		(2)该会员卡号(键盘录入的四位数字)各位数字之和大于20，则为幸运客户
	2.打印格式：
		请输入4位会员卡号：3569
		会员卡号3569各位之和：23
		会员卡号3569是幸运客户
		
		请输入4位会员卡号：1234
		会员卡号3569各位之和：10
		会员卡号3569不是幸运客户
		
	分析：
		1.创建键盘录入对象
		2.定义int类型的变量（保存会员卡号），并通过键盘录入给变量赋值
		3.使用/和%求出个位、十位、百位、千位上的数字
		4.定义int类型的变量sum
		5.计算各位数字之和并复制给sum
		6.按照格式打印
			(1)打印各位数字之和
			(2)打印是或者不是幸运客户(是或者不是，可以通过三元运算符判断sum的值获取是或者不是)
 */
public class Task04 {
	public static void main(String[] args) {
//		1.创建键盘录入对象
		Scanner sc = new Scanner(System.in);
//		2.定义int类型的变量（保存会员卡号），并通过键盘录入给变量赋值
		System.out.print("请输入四位会员卡号：");
		int custNo = sc.nextInt();
//		3.使用/和%求出个位、十位、百位、千位上的数字
		int qian = custNo/1000;		//获取千位
		int bai = custNo%1000/100;	//获取百位
		int shi = custNo%100/10;	//获取十位
		int ge = custNo%10;			//获取各位
//		4.定义int类型的变量sum
		int sum;		
//		5.计算各位数字之和并复制给sum
		sum = ge + shi + bai + qian;
//		6.按照格式打印
//			(1)打印各位数字之和
		System.out.println("会员卡号" + custNo + "各位数字之和：" + sum);
//			(2)打印是或者不是幸运客户(是或者不是，可以通过三元运算符判断sum的值获取是或者不是)
		String isLuck = sum>20?"是":"不是";
		System.out.println("会员卡号" + custNo + isLuck + "幸运客户");
	}
}

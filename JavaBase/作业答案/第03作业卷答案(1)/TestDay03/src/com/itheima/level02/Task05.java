package com.itheima.level02;

import java.util.Random;
import java.util.Scanner;

/*
	某商场实行新的抽奖规则：如果会员号的百位数字等于产生的随机数字，则该会员为幸运会员，且实现以下要求：
	从键盘上接收会员号
	使用if-else选择结构实现幸运抽奖
	分析：
		1.产生随机数
		2.从控制台接收一个4位会员号
		3.分解获得的百位数字
		4.判断该会员是否是幸运会员
		5.按照格式打印
 */
public class Task05 {
	public static void main(String[] args) {
//		1.产生随机数
		Random r = new Random();
		int randomNum = r.nextInt(10);//产生[0,9]的随机数字
//		2.从控制台接收一个4位会员号
		Scanner sc = new Scanner(System.in);
		int custNo = sc.nextInt();
//		3.分解获得的百位数字
		int bai = custNo/100%10;
//		4.判断该会员是否是幸运会员
		if(randomNum == bai) {
			System.out.println(custNo + "是幸运客户，获精美MP3一个。");
		} else {
			System.out.println(custNo + " 谢谢您的支持！");
		}
//		5.按照格式打印
	}
}

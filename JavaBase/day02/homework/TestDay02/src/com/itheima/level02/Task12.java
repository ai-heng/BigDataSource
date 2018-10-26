package com.itheima.level02;

import java.util.Scanner;

/*
	某商场购物可以打折，具体办法如下：
		普通顾客购满100元打9折
		会员购物打8折
		会员购物满200元打7.5折
		请根据此优惠计划进行购物结算
	分析：
		1.创建键盘录入对象
		2.定义int类型的变量identity（其值为0/1,0表示为非会员，1表示为会员），double类型的变量money表示购物金额
		3.通过键盘录入给变量identity和变量money赋值
		4.使用嵌套if选择结构实现
		5.先判断顾客是否是会员
			(1)非会员，直接打9折
			(2)会员，接着判断顾客购物是否达到相应的打折的数量要求，根据结果做不同的处理
 */
public class Task12 {
	public static void main(String[] args) {
//		1.创建键盘录入对象
		Scanner sc = new Scanner(System.in);
//		2.定义int类型的变量identity（其值为0/1,0表示为非会员，1表示为会员），double类型的变量money表示购物金额
		int identity;
		double money;
//		3.通过键盘录入给变量identity和变量money赋值
		System.out.println("请输入是否是会员：是(y)/否(其他字符)");
		identity = sc.nextInt();
		System.out.println("请输入购物金额：");
		money = sc.nextDouble();
//		4.使用嵌套if选择结构实现
		if(identity == 1) {	//是会员
//		5.先判断顾客是否是会员
//			(1)会员，接着判断顾客购物是否达到相应的打折的数量要求，根据结果做不同的处理
			if(money >= 200) { //会员购物200元以上打7.5折
				money = money * 0.75;
			} else {	//会员200元以内的大8折
				money = money * 0.8;
			}
		} else {
//			(2)非会员，直接打9折
			if(money >= 100) { //非会员购物100元以上打9折
				money = money * 0.9;
			}
		}
		System.out.println("实际支付："+money);
	}
}

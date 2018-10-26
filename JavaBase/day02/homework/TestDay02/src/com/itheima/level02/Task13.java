package com.itheima.level02;

import java.util.Scanner;

/*
	某人准备去海南旅游，现在要订购机票。机票的价格收季节忘记、淡季的影响，头等舱和经济舱价格也不同。
	假设机票原价假设为5000元（键盘录入），4-10月为旺季，旺季头等舱打9折，经济舱打8折，淡季头等舱打5折，经济舱打4折。
	编写程序，使用嵌套if选择结构根据出行的月份和选择的仓位输出实际的机票价格
	分析：
		1.创建键盘录入对象
		2.创建int类型的money表示机票价格，int类型的month表示月份
		3.通过键盘录入给变量money和month赋值
		4.定义int类型的变量type表示机票的类型和double类型的变量discount表示折扣率
		5.通过键盘录入给变量type赋值
		6.使用if语句根据type和month的值，计算实际的机票价格
		7.打印最后的结果
	
 */
public class Task13 {
	public static void main(String[] args) {
//		1.创建键盘录入对象
		Scanner sc =  new Scanner(System.in);
//		2.创建int类型的money表示机票价格，int类型的month表示月份
		int money;	//表示机票价格
		int month;	//表示出行的月份
//		3.通过键盘录入给变量money和month赋值
		System.out.println("请输入机票的原始价格：");
		money = sc.nextInt();
		System.out.println("请输入您要出行的月份：1~12");
		month = sc.nextInt();
//		4.定义int类型的变量type表示机票的类型和double类型的变量discount表示折扣率
		int type;
		double discount = 1.0;
//		5.通过键盘录入给变量type赋值
		System.out.println("请选择头等舱还是经济舱？头等舱输入1，经济舱输入2");
		type = sc.nextInt();
//		6.使用if语句根据type和month的值，计算实际的机票价格
		if(month >= 4 && month <= 10) {		//旺季
			if(type == 1) {		//头等舱打9折
				discount = 0.9;
			} else if(type == 2) {	//经济舱打8折
				discount = 0.8; 
			}
		} else if((month >= 1 && month <4) || (month >10 && month <= 12)){ //淡季
			if(type == 1) {		//头等舱打5折
				discount = 0.5;
			} else if(type == 2) {	//经济舱打4折
				discount = 0.4; 
			}
		} else {
			System.out.println("出行月份录入错入~");
			return;//结束main方法的运行
		}
//		7.打印最后的结果
		//旺季4月份出行，头等舱打0.5折，原价5000，折后价3000
		System.out.println(((month>=4&&month<=10)?"旺季 ":"淡季 ")+month+" 月份出行，"+(type==1?"头等舱 ":"经济舱 ")+"打 "+(int)(discount*10)+" 折，原价 "+money+" 元，折后价 "+(money*discount)+" 元");
	}
}

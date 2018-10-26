package com.itheima.level02;

import java.util.Scanner;

/*
	假设一个简单的在ATM的取款过程如下：首先提示用户输入密码（password），
	最多只能输入3次，超过3次则提示用户"密码错误，请取卡"交易结束。
	如果用户密码正确，再提示用户输入金额（amount），ATM只能输出100元的纸币，一次取钱数要求最低0元，最高1000元。
	如果用户输入的金额符合上述要求，则打印输出用户取的钱数，最后提示用户"交易完成，请取卡"，否则提示用户重新输入金额。假设用户密码是"111111"。
	分析：
		1.创建键盘录入对象
		2.定义boolean类型的变量isError（表示是否正确取款，初始值为true，表示取款失败）
		3.利用for循环，循环录入密码（最多三次）
			(1)定义int类型的变量password，并通过键盘录入给password赋值
			(2)使用if判断password的值
				a.如果password不等于111111，continue提前结束本次循环，继续进行下次密码的输入
				b.如果password等于111111，进行取款操作
					A.通过while循环录入取款金额
						aa.定义int类型的变量amount，并通过键盘录入给amount变量赋值
						bb.使用if判断，如果amount的值在0到1000之间
							打印"取走现金XX元"
							isError赋值为false
							break;//取款成功，终止while循环
						cc.如果amount的值不在0到1000之间
							提示"您输入的取款金额有误，请重新输入：",while循环继续执行
				
		4.使用if判断isError的值
			(1)如果isError为true，打印"密码错误，请取卡"
			(2)如果isError为false，打印"交易完成，请取卡"
 */
public class Task07 {
	public static void main(String[] args) {
//		1.创建键盘录入对象
		Scanner sc = new Scanner(System.in);
//		2.定义boolean类型的变量isError（表示是否正确取款，初始值为true，表示取款失败）
		boolean isError = true;
		System.out.print("请输入密码：");
//		3.利用for循环，循环录入密码（最多三次）
		wc:for(int i = 0;i<3;i++) {
//			(1)定义int类型的变量password，并通过键盘录入给password赋值
			int password = sc.nextInt();
//			(2)使用if判断password的值
//			a.如果password不等于111111，continue提前结束本次循环，继续进行下次密码的输入
			if(!(111111==password)) {
				if(i!=2) {
					System.out.print("密码错误，请重新输入：");
				}
				continue;
			}
			System.out.print("请输入取款金额：");
//			b.如果password等于111111，进行取款操作
//			A.通过while循环录入取款金额
			while(true) {
//				aa.定义int类型的变量amount，并通过键盘录入给amount变量赋值
				int amount = sc.nextInt();
//				bb.使用if判断，如果amount的值在0到1000之间
				if(amount>=0&&amount<=1000) {
//					打印"取走现金XX元"
//					isError赋值为false
//					break;//取款成功，终止while循环
					System.out.println("请取走现金："+ amount + "元");
					isError = false;
					break wc;
				}
//				cc.如果amount的值不再0到1000之间
//				提示"您输入的取款金额有误，请重新输入：",while循环继续执行
				System.out.print("您输入的取款金额有误，请重新输入：");
				
			}
			
		}
//		4.使用if判断isError的值
//		(1)如果isError为true，打印"密码错误，请取卡"
		if(isError) {
			System.out.println("密码错误，请取卡");			
		} else {
//			(2)如果isError为false，打印"交易完成，请取卡"
			System.out.println("交易完成，请取卡");
		}
	}
}

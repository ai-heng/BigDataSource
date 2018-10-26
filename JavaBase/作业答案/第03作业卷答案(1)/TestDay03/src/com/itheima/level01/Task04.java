package com.itheima.level01;

import java.util.Scanner;

/*
 * 请按如下要求编写程序,打印菜单:
  		1.从键盘上录入一个1到5的数字;
  		2.当数字为1时打印菜单"新建";
  		  当数字为2时打印菜单"打开文件";
  		  当数字为3时打印菜单"保存";
  		  当数字为4时打印菜单"刷新";
  		  当数字为5时打印菜单"退出",并退出程序;
		  	退出程序代码: System.exit(0);
 */
public class Task04 {
	public static void main(String[] args) {
		while(true){
			//1.从键盘上录入一个1到5的数字;
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			//判断输入的是1-5之间的哪个数字，对应的数字打印不同的内容
			switch (n) {
			case 1://1 -- 新建
				System.out.println("新建");
				break;
			case 2://2 -- 打开文件
				System.out.println("打开文件");
				break;
			case 3://3 -- 保存
				System.out.println("保存");
				break;
			case 4://4 -- 刷新
				System.out.println("刷新");
				break;
			case 5://5 -- 退出
				System.out.println("结束java程序的运行");
				//退出程序代码: System.exit(0);
				System.exit(0);
				break;
			}
		}
	}
}

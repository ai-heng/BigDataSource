package com.itheima.level01;

import java.util.Scanner;

/*
 * 有定义一个方法,可以接受一个整型的分数,
	如果分数为[90,100]这个范围方法返回’A’
	如果分数为[80,90)这个范围方法返回’B’
	如果分数为[70,80)这个范围方法返回’C’
	如果分数为[60,70)这个范围方法返回’D’
	如果分数为[0,60)这个范围方法返回’E’
	分数不在以上范围的返回’F’
 */
public class Task04 {
	public static void main(String[] args) {
		//1. 键盘输入一个整数，用来指定分数
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数字：");
		int n = sc.nextInt();
		//3. 调用方法，打印分数所对应的等级
		System.out.println("分数所对应的等级：" + getLevel(n));
	}
	
	//2. 定义方法
	/*
	 * 指定方法的名称：getLevel
	 * 指定方法的参数：int
	 * 指定方法的返回值：char
	 */
	public static char getLevel(int n){
		
		if (n>=90 && n<=100) {//如果分数为[90,100]这个范围方法返回’A’
			return 'A';
		} else if (n>=80 && n<90){//如果分数为[80,90)这个范围方法返回’B’
			return 'B';
		} else if (n>=70 && n<80){//如果分数为[70,80)这个范围方法返回’C’
			return 'C';
		} else if (n>=60 && n<70){//如果分数为[60,70)这个范围方法返回’D’
			return 'D';
		} else if (n>=0 && n<60){//如果分数为[0,60)这个范围方法返回’E’
			return 'E';
		} else {//分数不在以上范围的返回’F’
			return 'F';
		}
		
		//if (n<0 || n>100) {//分数不在以上范围的返回’F’
		//	return 'F';
		//}
	}
}

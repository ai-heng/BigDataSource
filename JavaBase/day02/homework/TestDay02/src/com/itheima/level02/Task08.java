package com.itheima.level02;

import java.util.Scanner;

/*
 * 分析以下需求，并用代码实现：
	1.键盘录入三个整数，按照从小到大的顺序输出
	2.如果用户输入的是3 2 1，程序运行后打印格式"按照从小到大排序后的顺序为：1 2 3"
	分析:
 		a,b,c -> a>b&&a>c ->a>b&&a>c&&b>c a b c  a>b&&a>c&&b<c   a c b 
 */
public class Task08 {
	public static void main(String[] args) {
//		method01();
//		method02();
//		method03();
//		method04();
		method05();
		
	}
	public static void method01() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个整数:");
		int a = sc.nextInt();
		System.out.println("请输入第二个整数:");
		int b = sc.nextInt();
		System.out.println("请输入第三个整数:");
		int c = sc.nextInt();
		
		if(a>b) {//a>b
			if(a>c) {//a>b&&a>c   a是最大的
				if(b>c) {//a>b&&a>c&&b>c
					System.out.println("a="+a+",b="+b+",c="+c);
				} else {//a>b&&a>c&&b<=c
					System.out.println("a="+a+",c="+c+",b="+b);
				}
			} else {//a>b&&a<=c  ->c a b
				System.out.println("c="+c+",a="+a+",b="+b);
			}
		} else {//b>=a
			if(c>b) {//b>=a&&c>b  c b a
				System.out.println("c="+c+",b="+b+",a="+a);
			} else {//b>=a&&b>=c   b 
				if(a>c) {//b>=a&&b>=c&&a>c  b a c 
					System.out.println("b="+b+",a="+a+",c="+c);
				} else {//b>=a&&b>=c&&a<=c  b c a  
					System.out.println("b="+b+",c="+c+",a="+a);
				}
			}
		}
	}
	public static void method02() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个整数:");
		int a = sc.nextInt();
		System.out.println("请输入第二个整数:");
		int b = sc.nextInt();
		System.out.println("请输入第三个整数:");
		int c = sc.nextInt();
		if(a>b&&a>c&&b>c) {
			System.out.println("a="+a+",b="+b+",c="+c);
		}
		if(a>b&&a>c&&b<=c) {
			System.out.println("a="+a+",c="+c+",b="+b);
		}
		if(a>b&&a<=c) {
			System.out.println("c="+c+",a="+a+",b="+b);
		}
		if(b>=a&&c>b) {
			System.out.println("c="+c+",b="+b+",a="+a);
		}
		if(b>=a&&b>=c&&a>c) {
			System.out.println("b="+b+",a="+a+",c="+c);
		}
		if(b>=a&&b>=c&&a<=c) {
			System.out.println("b="+b+",c="+c+",a="+a);
		}		
	}
	//选择排序
	public static void method03() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个整数:");
		int a = sc.nextInt();
		System.out.println("请输入第二个整数:");
		int b = sc.nextInt();
		System.out.println("请输入第三个整数:");
		int c = sc.nextInt();
		//a中保留了a和b两个数字中的较大中的值
		if(a<b) {
			int temp = a;
			a = b;
			b = temp;
		}
		//让a中保存三个数中的较大的数字
		if(a<c) {
			int temp = a;
			a = c;
			c = temp;
		}
		if(b<c) {
			int temp = b;
			b = c;
			c = temp;
		}
		
		System.out.println("a="+a+",b="+b+",c="+c);		
	}
	//冒泡排序
	public static void method04() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个整数:");
		int a = sc.nextInt();
		System.out.println("请输入第二个整数:");
		int b = sc.nextInt();
		System.out.println("请输入第三个整数:");
		int c = sc.nextInt();
		//a中保留了a和b两个数字中的较大中的值
		if(a<b) {
			int temp = a;
			a = b;
			b = temp;
		}
		//b中保留了b和c两个数字中的较大中的值,此时c中已经是最小值了
		if(b<c) {
			int temp = b;
			b = c;
			c = temp;
		}
		//经过上面的操作c中已经确定了最小值，只需要再确定a和b就可以了
		if(a<b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		System.out.println("a="+a+",b="+b+",c="+c);		
	}
	
	//a,b,c中的较大值要么是a，要么是b，要么是c，只有这三种情况
	public static void method05() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个整数:");
		int a = sc.nextInt();
		System.out.println("请输入第二个整数:");
		int b = sc.nextInt();
		System.out.println("请输入第三个整数:");
		int c = sc.nextInt();
		
		if(a>b&&a>c) {//假如a是最大值
			if(b>c) {//b是第二大的，c是最小的
				System.out.println("a="+a+",b="+b+",c="+c);	
			} else {//c是第二大的，b是最小的
				System.out.println("a="+a+",c="+c+",b="+b);	
			}
			
		} else if(b>a&&b>c) {//假如b是最大值
			if(a>c) {//a是第二大的，c是最小的
				System.out.println("b="+b+",a="+a+",c="+c);	
			} else {//c是第二大的，a是最小的
				System.out.println("b="+b+",c="+c+",a="+a);	
			}
			
		}else if(c>a&&c>b) {//假如c是最大值
			if(a>b) {//a是第二大的，b是最小的
				System.out.println("c="+c+",a="+a+",b="+b);	
			} else {//b是第二大的，a是最小的
				System.out.println("c="+c+",b="+b+",a="+a);	
			}
		}			
	}
}

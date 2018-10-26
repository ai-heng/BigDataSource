package com.itheima_01;

import java.util.Scanner;

/*
 * 需求：键盘录入两个数据，比较两个数据是否相等
 */
public class MethodTest2 {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		//获取数据
		System.out.println("请输入第一个数据：");
		int x = sc.nextInt();
		
		System.out.println("请输入第二个数据：");
		int y = sc.nextInt();
		
		//调用方法(人家返回什么数据类型，你就该用什么数据类型接收)
		boolean b = compare(x,y);
		
		//输出结果
		System.out.println("b:"+b);
	}
	
	/*
	 * 比较两个数据是否相等
	 * 
	 * 两个明确：
	 * 		返回值类型：boolean
	 * 		参数列表：int a,int b
	 */
	public static boolean compare(int a,int b) {
		if(a == b) {
			return true;
		}else {
			return false;
		}
	}
}

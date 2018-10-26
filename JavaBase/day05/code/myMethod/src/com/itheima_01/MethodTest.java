package com.itheima_01;

import java.util.Scanner;

/*
 * 需求：键盘录入两个数据，返回两个数中的较大值
 * 
 * 思考：
 * 		键盘录入两个数据的动作放在哪里比较合适呢?
 * 		假如键盘录入数据的动作放在了返回两个数中的较大值的方法里面，那么，我如果不想返回键盘录入
 * 		的数据的较大值，我就想返回两个固定值的较大值，我们是不是又得修改代码了。这个时候发现
 * 		是不合理的，所以我们应该把键盘录入数据的动作放在main方法中。
 * 
 * 命名习惯问题：
 * 		类：
 * 			如果是一个单词，首字母大写。Student
 * 			如果是多个单词，每个单词的首字母大写。HelloWorld
 * 
 * 		方法：和变量的命名是一样的规则。
 * 			如果是一个单词，首字母小写。sum()
 * 			如果是多个单词，从第二个单词开始，每个单词首字母大写。getMax()
 */
public class MethodTest {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		//获取数据
		System.out.println("请输入第一个数据：");
		int a = sc.nextInt();
		
		System.out.println("请输入第二个数据：");
		int b = sc.nextInt();
		
		//调用方法
		int max = getMax(a,b);
		
		//输出结果
		System.out.println("max:"+max);
	}
	
	/*
	 * 返回两个数中的较大值
	 * 
	 * 两个明确：
	 * 		返回值类型：int
	 * 		参数列表：int a,int b
	 */
	public static int getMax(int a,int b) {
		if(a > b) {
			return a;
		}else {
			return b;
		}
	}
}

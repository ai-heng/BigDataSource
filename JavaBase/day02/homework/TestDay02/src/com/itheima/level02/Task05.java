package com.itheima.level02;

import java.util.Scanner;

/*
 * 分析以下需求，并用代码实现：
	1.根据工龄(整数)给员工涨工资(整数),工龄和基本工资通过键盘录入
	2.涨工资的条件如下（假设员工在公司最多干15年）
		[10-15)     +5000 
		[5-10)      +2500
		[3~5)       +1000
		[1~3)       +500
		[0~1)       +200
	3.如果用户输入的工龄为10，基本工资为3000，程序运行后打印格式"您目前工作了10年，基本工资为 3000元, 应涨工资 5000元,涨后工资 8000元"
	分析：
		1.创建键盘录入对象
		2.定义变量age表示工龄（假设为int类型），定义变量salary表示基本工资（假设为int类型），定义变量addSalary表示上涨部分（初始值为0）
		3.通过键盘录入给工龄age赋值和基本工资salary赋值
		4.对工龄进行逻辑判断，根据不同的工龄区间，计算addSalary的值
		5.按照格式进行打印（salay+addSalary为最终的工资）
		
		注意：此题目从不同的角度分析，可以写出多种形式，以下只列出4中写法，同学们在学习的过程中要发散思维，
		尽量多写几种代码
		
 */
public class Task05 {
	public static void main(String[] args) {
//		method01();
//		method02();
		method03();
		method04();
	}

	private static void method01() {
		// 1.创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		// 2.定义变量age表示工龄（假设为int类型），定义变量salary表示基本工资（假设为int类型）
//		int age,salary;
		// 3.通过键盘录入给工龄age赋值和基本工资salary赋值
//		age = sc.nextInt();
//		salary = sc.nextInt();
		int age = sc.nextInt();
		int salary = sc.nextInt();
		int addSalary = 0;
		// 4.对工龄进行逻辑判断，根据不同的工龄区间，进行涨工资salary+=n；（n表示：涨工资的数量）
		if(age>=15||age<0) {//age<0  || age>=15 认为是非法工龄
			System.out.println("您输入的工龄不合法~");
			return ;
		}
		//[10-15)     +5000
		if(age>=10&&age<15)
			addSalary = 5000;
		//[5-10)      +2500
		if(age>=5&&age<10)
			addSalary = 2500;
		//[3~5)       +1000
		if(age>=3&&age<5)
			addSalary = 1000;
		//[1~3)       +500
		if(age>=1&&age<3)
			addSalary = 500;
		//[0~1)       +200
		if(age>=0&&age<1)
			addSalary = 200;		
		// 5.按照格式进行打印
		System.out.println("您目前工作了"+age+"年，基本工资为 "+salary+"元, 应涨工资 "+addSalary+"元,涨后工资 "+(salary+addSalary)+"元");
	}
	private static void method02() {
		// 1.创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		// 2.定义变量age表示工龄（假设为int类型），定义变量salary表示基本工资（假设为int类型）
//		int age,salary;
		// 3.通过键盘录入给工龄age赋值和基本工资salary赋值
//		age = sc.nextInt();
//		salary = sc.nextInt();
		int age = sc.nextInt();
		int salary = sc.nextInt();
		int addSalary = 0;
		// 4.对工龄进行逻辑判断，根据不同的工龄区间，进行涨工资salary+=n；（n表示：涨工资的数量）
		if(age>=15||age<0) {
			System.out.println("您输入的工龄不合法~");
			return ;
		}
		//[10-15)     +5000
		if(age>=10&&age<15) {
			addSalary = 5000;
		} else if(age>=5&&age<10){//[5-10)      +2500
			addSalary = 2500;
		} else if(age>=3&&age<5) {//[3~5)       +1000
			addSalary = 1000;
		} else if(age>=1&&age<3) {//[1~3)       +500
			addSalary = 500;
		} else if(age>=0&&age<1) {//[0~1)       +200
			addSalary = 200;
		} 				
		// 5.按照格式进行打印
		System.out.println("您目前工作了"+age+"年，基本工资为 "+salary+"元, 应涨工资 "+addSalary+"元,涨后工资 "+(salary+addSalary)+"元");
	}
	private static void method03() {
		// 1.创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		// 2.定义变量age表示工龄（假设为int类型），定义变量salary表示基本工资（假设为int类型）
//		int age,salary;
		// 3.通过键盘录入给工龄age赋值和基本工资salary赋值
//		age = sc.nextInt();
//		salary = sc.nextInt();
		int age = sc.nextInt();
		int salary = sc.nextInt();
		int addSalary = 0;
		// 4.对工龄进行逻辑判断，根据不同的工龄区间，进行涨工资salary+=n；（n表示：涨工资的数量）
		if(age>=15||age<0) {
			System.out.println("您输入的工龄不合法~");
			return ;
		} else if(age<1) { //else表示上面的if不成立（age<15&&age>=0）&&age<1 =>  [0-1)     +200
			addSalary = 200;
		} else if(age<3){ //else表示上面的if不成立（age<15&&age>=0）&&age>=110&&age<3 =>[1-3)      +500
			addSalary = 500;
		} else if(age<5) {//[3~5)       +1000
			addSalary = 1000;
		} else if(age<10) {//[5~10)       +2500
			addSalary = 2500;
		} else if(age<15) {//[10~15)       +5000
			addSalary = 5000;
		} 				
		// 5.按照格式进行打印
		System.out.println("您目前工作了"+age+"年，基本工资为 "+salary+"元, 应涨工资 "+addSalary+"元,涨后工资 "+(salary+addSalary)+"元");
	}
	private static void method04() {
		// 1.创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		// 2.定义变量age表示工龄（假设为int类型），定义变量salary表示基本工资（假设为int类型）
//		int age,salary;
		// 3.通过键盘录入给工龄age赋值和基本工资salary赋值
//		age = sc.nextInt();
//		salary = sc.nextInt();
		int age = sc.nextInt();
		int salary = sc.nextInt();
		int addSalary = 0;
		// 4.对工龄进行逻辑判断，根据不同的工龄区间，进行涨工资salary+=n；（n表示：涨工资的数量）
		if(age>=15||age<0) {
			System.out.println("您输入的工龄不合法~");
			return ;
		} else if(age>=10) { //else表示上面的if不成立（age<15&&age>=0）&&age>=10 =>  [10-15)     +5000
			addSalary = 5000;
		} else if(age>=5){ //else表示上面的if不成立（age<15&&age>=0）&&age<10&&age>=5 =>[5-10)      +2500
			addSalary = 2500;
		} else if(age>=3) {//[3~5)       +1000
			addSalary = 1000;
		} else if(age>=1) {//[1~3)       +500
			addSalary = 500;
		} else if(age>=0) {//[0~1)       +200
			addSalary = 200;
		} 				
		// 5.按照格式进行打印
		System.out.println("您目前工作了"+age+"年，基本工资为 "+salary+"元, 应涨工资 "+addSalary+"元,涨后工资 "+(salary+addSalary)+"元");
	}
}

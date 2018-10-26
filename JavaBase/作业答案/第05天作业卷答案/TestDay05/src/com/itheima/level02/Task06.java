package com.itheima.level02;
/*
分析以下需求，并用代码实现(每个小需求都需要封装成方法)
	1.求两个数据之和(整数和小数)
	2.判断两个数据是否相等(整数和小数)
	3.获取两个数中较大的值(整数和小数)
	4.获取两个数中较小的值(整数和小数)
	5.否能用一个方法实现3和4的两个功能
	
	分析：
		1.求两个数据之和(整数和小数)
			(1)参数类型：int或者double
			(2)返回值类型：int或者double
			所以需要定义两个重载的方法，一个为求两个int数据的和，一个为求两个double数据的和
		2.判断两个数据是否相等(整数和小数)
			(1)参数类型：int或者double
			(2)返回值类型：boolean
			所以需要定义两个重载的方法，一个为判断两个int数据是否相等，一个为判断两个double数据是否相等
		3.获取两个数中较大的值(整数和小数)
			(1)参数类型：int或者double
			(2)返回值类型：int或者double
			所以需要定义两个重载的方法，一个为求两个int数据的最大值，一个为求两个double数据的最大值
		4.获取两个数中较小的值(整数和小数)	
			(1)参数类型：int或者double
			(2)返回值类型：int或者double
			所以需要定义两个重载的方法，一个为求两个int数据的最校值，一个为求两个double数据的最小值
		5.否能用一个方法实现3和4的两个功能
			(1)参数类型：int或者double，但必须有个flag标记用于表示到底是求最大值还是最小值(boolean类型)
			(2)返回值类型：int或者double
			所以需要定义两个重载的方法，一个为求两个int数据的最校值，一个为求两个double数据的最小值
 */	
public class Task06 {
	public static void main(String[] args) {
		//测试代码省略。。。。。
	}
	/**
	 * 
	 * @param num1 int 类型
	 * @param num2 int 类型
	 * @return 求num1和num2的和，返回为int类型
	 */
	public static int sum(int num1,int num2) {
		return num1 + num2;
	}
	/**
	 * 
	 * @param num1 double 类型
	 * @param num2 double 类型
	 * @return 求num1和num2的和，返回为double类型
	 */
	public static double sum(double num1,double num2) {
		return num1 + num2;
	}
	
	/**
	 * 
	 * @param num1 int 类型
	 * @param num2 int 类型
	 * @return 判断num1和num2是否相等，返回为boolean类型
	 */
	public static boolean equals(int num1,int num2) {
		return num1 == num2;
	}
	
	/**
	 * 
	 * @param num1 double 类型
	 * @param num2 double 类型
	 * @return 判断num1和num2是否相等，返回为boolean类型
	 */
	public static boolean equals(double num1,double num2) {
		
		return num1 == num2;
	}
	/**
	 * 
	 * @param num1 int 类型
	 * @param num2 int 类型
	 * @return 返回num1和num2中的较大值，返回为int类型
	 */
	public static int max(int num1,int num2) {
		
		return num1>num2?num1:num2;
	}
	
	/**
	 * 
	 * @param num1 double 类型
	 * @param num2 double 类型
	 * @return 返回num1和num2中的较大值，返回为double类型
	 */
	public static double max(double num1,double num2) {
		
		return num1>num2?num1:num2;
	}
	
	/**
	 * 
	 * @param num1 int 类型
	 * @param num2 int 类型
	 * @return 返回num1和num2中的较小值，返回为int类型
	 */
	public static int min(int num1,int num2) {
		
		return num1>num2?num1:num2;
	}
	
	/**
	 * 
	 * @param num1 double 类型
	 * @param num2 double 类型
	 * @return 返回num1和num2中的较小值，返回为double类型
	 */
	public static double min(double num1,double num2) {
		
		return num1>num2?num2:num1;
	}
	/**
	 * 
	 * @param num1 int 类型
	 * @param num2 int 类型
	 * @param flag true表示求最大值，false表示求最小值
	 * @return 返回num1和num2中的较大值或者最小值，返回为int类型
	 */
	public static int maxOrMin(int num1,int num2,boolean flag) {
		if(flag)
			return num1>num2?num1:num2;
		return num1>num2?num2:num1;	
	}
	
	/**
	 * 
	 * @param num1 double 类型
	 * @param num2 double 类型
	 * @param flag true表示求最大值，false表示求最小值
	 * @return 返回num1和num2中的较大值或者最小值，返回为double类型
	 */
	public static double maxOrMin(double num1,double num2,boolean flag) {
		if(flag)
			return num1>num2?num1:num2;
		return num1>num2?num2:num1;	
	}
}

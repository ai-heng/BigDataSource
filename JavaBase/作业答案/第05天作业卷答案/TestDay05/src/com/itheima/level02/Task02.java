package com.itheima.level02;

import java.util.Scanner;

/*
 * 分析以下需求，并用代码实现
	1.键盘录入长方形的长和宽
		定义方法计算该长方形的周长,并在main方法中打印周长
	2.键盘录入长方形的长和宽
		定义方法计算该长方形的面积,并在main方法中打印面积
	3.键盘录入圆的半径
		定义方法计算该圆的周长,并在main方法中打印周长
	4.键盘录入圆的半径
		定义方法计算该圆的面积,并在main方法中打印面积
 */
public class Task02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入长方形的长");
		int length = sc.nextInt();
		System.out.println("请输入长方形的宽");
		int width = sc.nextInt();
		int zc = getRectZhouChang(length, width);
		System.out.println("长方形周长："+zc);
		int area = getRectArea(length, width);
		System.out.println("长方形面积："+area);
		
		System.out.println("请输入圆的半径");
		int r = sc.nextInt();
		double area2 = getCirlArea(r);
		System.out.println("圆的面积："+area2);
		double zc2 = getCirlZhouChang(r);
		System.out.println("圆的周长："+zc2);
	}
	/*
	 * 返回值：double 周长
	 * 参数：长、宽
	 */
	public static int getRectZhouChang(int length, int width) {
		int zc = (length + width) * 2;
		return zc;
	}
	/*
	 *  求面积
	 *  参数：长、宽
	 */
	public static int getRectArea(int length, int width) {
		return length * width;
	}
	/*
	 * 返回值：double 周长
	 * 参数：半径
	 */
	public static double getCirlZhouChang(double r) {
		double zc = 2 * 3.14159265358979323846 * r;
		return zc;
	}
	/*
	 *  求面积
	 */
	public static double getCirlArea(double r) {
		return 3.14159265358979323846 * r * r;
	}
}

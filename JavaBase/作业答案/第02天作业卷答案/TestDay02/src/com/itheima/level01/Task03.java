package com.itheima.level01;
/*
 * 定义一个int类型的变量,初始化值为123,求这个数的个位,十位,百位分别是多少,
 * 输出结果:123的个位是3,十位是2,百位是1
 */
public class Task03 {
	public static void main(String[] args) {
		//1.定义一个变量，值为123
		int n = 123;
		//2.获取该数字中个位、十位、百位的数字
		// 个位： 数字 % 10
		int ge = n % 10;
		// 十位： 数字 / 10 % 10;
		int shi = n / 10 % 10;
		// 百位： 数字 / 100 % 10;
		int bai = n /100 % 10;
		//3.打印结果
		//123的个位是3,十位是2,百位是1
		System.out.println(n + "的个位是"+ ge +",十位是"+ shi +",百位是" + bai);
	}
}

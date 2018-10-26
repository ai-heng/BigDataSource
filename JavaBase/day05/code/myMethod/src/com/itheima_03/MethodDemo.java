package com.itheima_03;
/*
 * 方法重载：在同一个类中，出现了方法名相同的情况。
 * 
 * 方法重载的特点：
 * 		方法名相同，参数列表不同。方法重载与返回值无关。
 * 
 * 		参数列表不同：
 * 			参数的个数不同。
 * 			参数对应的数据类型不同。
 * 
 * 注意事项：
 * 		在调用方法的时候，java虚拟机会根据方法名及参数列表的不同来区分方法。
 */
public class MethodDemo {
	public static void main(String[] args) {
		//定义两个变量
		int a = 10;
		int b = 20;
		
		//求和
		int result = sum(a,b);
		System.out.println("result:"+result);
		
		//定义变量
		int c = 30;
		//int result2 = sum2(a,b,c);
		int result2 = sum(a,b,c);
		System.out.println("result2:"+result2);
	}
	
	/*
	public static int sum(int x,int y) {
		return x + y;
	}
	*/
	
	public static float sum(float a,float b) {
		return a + b;
	}
	
	//求三个数据的和
	/*
	public static int sum2(int a,int b,int c) {
		return a + b + c;
	}
	*/
	public static int sum(int a,int b,int c) {
		return a + b + c;
	}
	
	//求两个数据的和
	public static int sum(int a,int b) {
		/*
		int c = a + b;
		return c;
		*/
		
		return a + b;
	}
}

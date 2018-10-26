package com.itheima_03;
/*
 * int类型和String类型的相互转换
 * 
 * int	--	String
 * 		String类中：public static String valueOf(int i)
 * 
 * String	--	int
 * 		Integer类中：public static int parseInt(String s)
 */
public class IntegerDemo {
	public static void main(String[] args) {
		//int	--	String
		int number = 100;
		//方式1
		String s1 = "" + number;
		System.out.println(s1);
		//方式2
		//public static String valueOf(int i)
		String s2 = String.valueOf(number);
		System.out.println(s2);
		System.out.println("--------------");
		
		//String  -- int
		String s = "100";
		//方式1
		//String -- Integer -- int
		Integer i = new Integer(s);
		//public int intValue()
		int x = i.intValue();
		System.out.println(x);
		//方式2
		//public static int parseInt(String s)
		int y = Integer.parseInt(s);
		System.out.println(y);
		
	}
}

package com.itheima_02;
/*
 * 非静态的成员方法：
 * 		能访问静态的成员变量
 * 		能访问非静态的成员变量
 * 		能访问静态的成员方法
 * 		能访问非静态的成员方法
 * 
 * 静态的成员方法：
 * 		能访问静态的成员变量
 * 		能访问静态的成员方法
 * 
 * 注意事项：
 * 		静态成员方法中不能出现this,super这样的关键字。
 * 		原因是：静态是随着类的加载而加载，this,super这样的关键字是随着对象的创建而存在。
 * 			    先进内存的，不能访问后进内存的。
 */
public class Student {
	//非静态的成员变量
	private String name = "林青霞";
	//静态的成员变量
	private static int age = 30;
	
	//非静态的成员方法
	public void show() {
		this.name = "刘德华";
		System.out.println(name);
		System.out.println(age);
		show2();
		show4();
	}
	
	public void show2() {}
	
	//静态的成员方法
	public static void show3() {
		//this.age
		//this.name
		
		//System.out.println(name);
		System.out.println(age);
		//show2();
		show4();
	}
	
	public static void show4() {}
}

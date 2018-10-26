package com.itheima.level01;

public class Task03 {
	public static void main(String[] args){
		
	}
}

class Student2 {
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

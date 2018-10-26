package com.itheima_01;

public class Student {
	public String name;
	public int age;
	//public String graduateFrom; //毕业院校
	public static String graduateFrom; //毕业院校
	
	public void show() {
		System.out.println(name+"---"+age+"---"+graduateFrom);
	}
}

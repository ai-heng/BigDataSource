package com.itheima_02;
/*
 * super和this的用法很像：
 * 		this:代表本类对象的引用
 * 		super:代表父类的存储空间(可以理解为代表父类对象的引用)
 * 
 * 用法：
 * 		访问成员变量：
 * 			this.成员变量
 * 			super.成员变量
 * 		访问构造方法：
 * 			this(...)
 * 			super(...)
 * 		访问成员方法：
 * 			this.成员方法()
 * 			super.成员方法()
 */
public class Son extends Father {
	public int age = 20;
	
	public void printAge() {
		int age = 10;
		System.out.println(age);
		//我要访问成员范围的age?
		System.out.println(this.age);
		//我要访问父类成员范围的age?
		System.out.println(super.age);
	}
}

package com.itheima_01;
/*
 * Java继承中成员变量的特点：
 * 		A:成员变量名称不一样，使用的时候非常简单。
 * 		B:成员变量名称一样的情况
 * 			在子类方法中访问变量：
 * 				a:在方法的局部范围找，如果有就使用
 * 				b:在子类的成员范围找，如果有就使用
 * 				c:在父类的成员范围找，如果有就使用
 * 				d:如果还找不到，就报错
 * 			就近原则。
 */
public class Son extends Father {
	//身高
	public int height = 170;
	//年龄
	public int age = 20;
	
	public void show() {
		System.out.println(height);
		System.out.println(age);
	}
	
	public void printAge() {
		int age = 10;
		System.out.println(age);
	}
}

package com.itheima_01;
/*
 * static：是一个关键字，静态的意思。可以用来修饰成员变量和成员方法。
 * static修饰成员的特点：
 * 		A:被类的所有对象共享。
 * 			其实也是判断一个成员是否应该用static修饰的条件。
 * 		B:可以通过类名直接访问
 * 		C:优先于对象存在
 * 		D:随着类的加载而加载
 */
public class StaticDemo {
	public static void main(String[] args) {
		Student.graduateFrom = "传智学院";
		
		Student s1 = new Student();
		s1.name = "林青霞";
		s1.age = 30;
		//s1.graduateFrom = "传智学院";
		s1.show();
		System.out.println("----------------------");
		
		Student s2 = new Student();
		s2.name = "刘德华";
		s2.age = 28;
		//s2.graduateFrom = "传智学院";
		s2.show();
	}
}

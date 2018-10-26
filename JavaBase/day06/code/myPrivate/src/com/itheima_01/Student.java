package com.itheima_01;
/*
 * 直接使用对象名访问成员变量，会存在数据的安全问题
 * 这个时候，我们就应该思考能不能让外界不要直接访问成员变量?
 * 能
 * 如何实现呢?
 * 		用private关键字
 * private:
 * 		是一个修饰符
 * 		可以修饰成员变量，也可以修饰成员方法
 * 		被private修饰的成员只能在本类中被访问
 * 
 * 针对被private修饰的成员变量，我们会相应的给出getXxx()和setXxx()用于获取和设置成员变量的值，
 * 方法用public修饰
 */
public class Student {
	String name;
	//int age;
	private int age;
	
	public void setAge(int a) {
		if(a<0 || a>200) {
			System.out.println("你给的年龄有误");
		}else {
			age = a;
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public void show() {
		System.out.println(name+"***"+age);
	}
}

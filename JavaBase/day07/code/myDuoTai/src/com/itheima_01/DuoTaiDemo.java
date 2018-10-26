package com.itheima_01;
/*
 * 多态：同一个对象，在不同时刻体现出来的不同状态。
 * 举例：
 * 		猫：猫是猫，猫是动物。
 * 		水：液体，固体，气体。
 * 
 * Java中多态的前提：
 * 		A:有继承关系
 * 		B:有方法重写
 * 		C:有父类引用指向子类对象
 * 			Fu f = new Fu();
 * 			Zi z = new Zi();
 * 
 * 			Fu f = new Zi();
 */
public class DuoTaiDemo {
	public static void main(String[] args) {
		//有父类引用指向子类对象
		Animal a = new Cat();
	}
}

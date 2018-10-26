package com.itheima_03;
/*
 * Java继承中构造方法的访问特点：
 * 		A:子类构造方法执行前都会先执行父类无参构造方法
 * 		B:为什么呢?
 * 			因为子类继承父类，会继承父类的非私有成员。
 * 			而子类在初始化的时候，可能会使用父类的数据，如果父类数据没有先初始化，
 * 			子类就不能使用这些数据，所以，在子类初始化之前，一定要先完成父类数据的初始化。
 * 
 * 		注意：在子类的构造方法中，默认第一行有一条语句：super()
 * 
 * 问题：假如父类中没有无参构造方法，怎么办呢?
 * 		A:在父类中添加一个无参构造方法。
 * 		B:可以通过super去访问父类的带参构造方法。
 * 建议使用第一种解决方案，其实就是要求我们写代码的时候，每次都手动的给出无参构造方法。
 */
public class Son extends Father {
	public Son() {
		//super();
		super("林青霞");
		System.out.println("Son无参构造方法");
	}
	
	public Son(String name) {
		//super();
		super("林青霞");
		System.out.println("Son带参构造方法");
		System.out.println(name);
	}
}

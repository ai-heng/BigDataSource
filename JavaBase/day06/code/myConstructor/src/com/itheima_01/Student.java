package com.itheima_01;
/*
 * 构造方法：用于给对象的数据进行初始化
 * 
 * 格式：
 * 		方法名和类名相同
 * 		没有返回值类型，连void都不能写
 * 		没有具体的返回值
 * 
 * 构造方法的注意事项：
 * 		A:如果我们没有给出构造方法，系统将给出一个默认的无参数构造方法供我们使用
 * 		B:如果我们给出了构造方法，系统将不再提供默认的构造方法供我们使用。
 * 			这个时候，我们如果还想使用无参数构造方法，就必须自己提供。
 * 			我们推荐：自己给出无参数构造方法。
 * 		C:构造方法也是可以重载的。
 * 
 * 给成员变量赋值的方式：
 * 		A:通过setXxx()
 * 		B:通过构造方法
 */
public class Student {
	private String name;
	private int age;
	
	/*
	public Student() {
		System.out.println("这是构造方法");
	}
	*/
	
	public Student() {}
	
	public Student(String name) {
		this.name = name;
	}
	
	public Student(int age) {
		this.age = age;
	}
	
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println(name+"---"+age);
	}
}

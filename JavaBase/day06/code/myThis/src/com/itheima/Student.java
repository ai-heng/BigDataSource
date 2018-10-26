package com.itheima;

/*
 * 学生类
 * 
 * 目前代码中的n和a没有做到见名知意，需要改进。
 * 
 * 如果局部变量名称和成员变量名称一致，在方法中使用的时候采用的是就近原则。
 * 
 * 我们有没有办法把局部变量的name赋值给成员变量的name呢?
 * 有
 * 
 * 有什么办法呢?
 * 		用this关键字就可以解决这个问题
 * 
 * this:代表所在类的对象引用
 * 		方法被哪个对象调用，this就代表谁。
 * 
 * 使用场景：
 * 		就是用于解决成员变量被隐藏的问题。		
 */
public class Student {
	private String name;
	private int age;

	public void setName(String name) { //"林青霞"
		//name = name;
		this.name = name;
	}

	public String getName() {
		return name;
		//return this.name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
}

package com.itheima;

import java.util.Arrays;

/*
 * Arrays类中真的没有构造方法吗?
 * 		一个类中没有构造方法，系统将提供一个无参构造方法。
 * 		而我们在帮助文档中没有看到Arrays类的构造方法，这是为什么呢?
 * 			Arrays类中有构造方法，只不过构造方法被private修饰，外界是无法使用的。
 * 			因为外界无法使用，所以帮助文档中就看不到。
 * 
 * 通过查看源码，我们找到了如下的内容：
 * private Arrays() {}
 * 
 * 
 * Arrays类的这种设计是常用的工具类的设计思想：
 * 		构造方法私有。
 * 		成员都用static修饰。
 * 
 * Math，Collections等
 */
public class ArraysDemo2 {
	public static void main(String[] args) {
		//Arrays;
		
		//Arrays a = new Arrays();
	}
}

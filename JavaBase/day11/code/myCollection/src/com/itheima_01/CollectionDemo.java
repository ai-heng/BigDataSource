package com.itheima_01;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 为什么出现集合类：
 * 		我们学习的是面向对象的编程语言，面向对象的编程语言对事物的描述都是通过对象体现的，
 * 为了方便对多个对象进行操作，我们就必须把这多个对象进行存储，而要想存储多个对象，就不能是
 * 基本的变量了，应该是一个容器类型的变量。回顾我们学过的知识，有哪些是容器类型的呢?
 * 		数组，StringBuilder
 * 		首先说StringBuilder，它的结果是一个字符串，不一定满足我们的需求，所以我们只能
 * 选择数组了，而数组的长度固定，不能适应变化的需求，在这种情况下，Java就提供了集合类供我们使用。
 * 由此可见，集合类的长度是可变的。
 * 	
 * 集合类的特点：长度可变。
 * 
 * Collection:是单列集合的顶层接口。
 * Collection 表示一组对象，这些对象也称为 collection 的元素。
 * 一些 collection 允许有重复的元素，而另一些则不允许。
 * 一些 collection 是有序的，而另一些则是无序的。
 * JDK 不提供此接口的任何直接 实现：它提供更具体的子接口（如 Set 和 List）实现。
 * 
 * 创建Collection集合的对象，我们采用的是多态的方式，使用的是具体的ArrayList类。
 * 因为这个类是最常用的集合类。
 * ArrayList() 
 * 
 * Collection<E>：
 * 		<E>:是一种特殊的数据类型，泛型。这里我们会使用就可以了。
 * 		如何使用呢?
 * 			在出现E的地方用引用数据类型替换即可。
 * 			举例：Collection<String>,Collection<Student>
 */
public class CollectionDemo {
	public static void main(String[] args) {
		//创建Collection集合对象
		//JDK7的新特性，看懂就可以
		//Collection<String> c = new ArrayList<>(); //多态的方式
		Collection<String> c = new ArrayList<String>(); //多态的方式
		
		//boolean add(E e):添加元素
		c.add("hello");
		c.add("world");
		c.add("java");
		
		//输出集合对象
		System.out.println(c);
		//输出了集合中的元素按照指定格式拼接的内容，说明ArrayList重写了toString()方法
	}
}

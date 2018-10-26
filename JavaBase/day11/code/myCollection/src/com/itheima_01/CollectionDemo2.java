package com.itheima_01;

import java.util.ArrayList;
import java.util.Collection;

/*
 * boolean add(E e):添加元素
 * boolean remove(Object o):从集合中移除元素
 * void clear():清空集合中的元素
 * boolean contains(Object o):判断集合中是否存在指定的元素
 * boolean isEmpty():判断集合是否为空
 * int size():集合的长度，也就是集合中元素的个数
 */
public class CollectionDemo2 {
	public static void main(String[] args) {
		//创建集合对象
		Collection<String> c = new ArrayList<String>();
		
		//boolean add(E e):添加元素
		//System.out.println("add:"+c.add("hello"));
		//System.out.println("add:"+c.add("world"));
		//通过查看源码，我们知道ArrayList集合的add方法的返回值永远都是true
		c.add("hello");
		c.add("world");
		c.add("java");
		
		//boolean remove(Object o):从集合中移除元素
		//System.out.println("remove:"+c.remove("world"));
		//System.out.println("remove:"+c.remove("haha"));
		
		//void clear():清空集合中的元素
		//c.clear();
		
		//boolean contains(Object o):判断集合中是否存在指定的元素
		//System.out.println("contains:"+c.contains("world"));
		//System.out.println("contains:"+c.contains("haha"));
		
		//boolean isEmpty():判断集合是否为空
		//System.out.println("isEmpty:"+c.isEmpty());
		
		//int size():集合的长度，也就是集合中元素的个数
		System.out.println("size:"+c.size());
		
		//输出集合对象
		System.out.println(c);
	} 
}

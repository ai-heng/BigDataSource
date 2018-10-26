package com.itheima_01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * Collection集合的遍历
 * 
 * Iterator<E> iterator():返回在此 collection 的元素上进行迭代的迭代器。
 * 通过集合对象调用iterator()方法得到迭代器对象。
 * 
 * Iterator:
 * 		E next():返回迭代的下一个元素。 
 * 		boolean hasNext():如果仍有元素可以迭代，则返回 true。
 */
public class CollectionDemo3 {
	public static void main(String[] args) {
		//创建集合对象
		Collection<String> c = new ArrayList<String>();
		
		//添加元素
		c.add("hello");
		c.add("world");
		c.add("java");
		
		//Iterator<E> iterator()
		Iterator<String> it = c.iterator();//返回的是迭代器接口的实现类的对象
		//System.out.println(it.next());
		//System.out.println(it.next());
		//System.out.println(it.next());
		//NoSuchElementException:没有这样的元素异常
		//System.out.println(it.next());
		
		//boolean hasNext()
		while(it.hasNext()){
			//System.out.println(it.next());
			String s = it.next();
			System.out.println(s);
		}
		
	}
}

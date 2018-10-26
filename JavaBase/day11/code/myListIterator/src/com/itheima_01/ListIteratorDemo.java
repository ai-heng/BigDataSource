package com.itheima_01;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 * ListIterator:
 * 		ListIterator<E> listIterator():返回此列表元素的列表迭代器
 * 		public interface ListIterator<E>extends Iterator<E>
 * 
 * 特有功能：
 * 		E previous():返回列表中的前一个元素。
 * 		boolean hasPrevious():如果以逆向遍历列表，列表迭代器有多个元素，则返回 true。（
 *		注意：ListIterator可以实现逆向遍历，但是要求先正向遍历，才能逆向遍历。
 */
public class ListIteratorDemo {
	public static void main(String[] args) {
		//创建集合对象
		List<String> list = new ArrayList<String>();
		
		//添加元素
		list.add("hello");
		list.add("world");
		list.add("java");
		
		ListIterator<String> lit = list.listIterator();
//		while(lit.hasNext()){
//			String s = lit.next();
//			System.out.println(s);
//		}
		System.out.println("--------------------------");
		
		while(lit.hasPrevious()) {
			String s = lit.previous();
			System.out.println(s);
		}
	}
}

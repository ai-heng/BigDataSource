package com.itheima_01;

import java.util.ArrayList;
import java.util.List;

/*
 * void add(int index,E element):在指定位置添加元素
 * E remove(int index):删除指定位置的元素
 * E get(int index):获取指定位置的元素
 * E set(int index,E element):修改指定位置的元素
 */
public class ListDemo2 {
	public static void main(String[] args) {
		//创建集合对象
		List<String> list = new ArrayList<String>();
		
		//使用继承Collection的添加功能
		list.add("hello");
		list.add("world");
		list.add("java");
		
		//void add(int index,E element):在指定位置添加元素
		//list.add(1, "javaee");
		//IndexOutOfBoundsException
		//list.add(11,"javase");
		
		//E remove(int index):删除指定位置的元素,返回被删除的元素
		//System.out.println("remove:"+list.remove(1));
		//System.out.println("remove:"+list.remove(11));
		
		//E get(int index):获取指定位置的元素
		//System.out.println("get:"+list.get(1));
		//System.out.println("get:"+list.get(11));
		
		//E set(int index,E element):修改指定位置的元素,返回被修改的元素
		//System.out.println("set:"+list.set(1, "javaee"));
		
		//输出集合对象
		System.out.println(list);
	}
}

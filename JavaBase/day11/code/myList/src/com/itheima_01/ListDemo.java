package com.itheima_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * List:有序的 collection（也称为序列）。
 * 此接口的用户可以对列表中每个元素的插入位置进行精确地控制。
 * 用户可以根据元素的整数索引（在列表中的位置）访问元素，并搜索列表中的元素。
 * 与 set 不同，列表通常允许重复的元素。
 * 
 * List集合的特点：
 * 		A:有序(存储和取出元素的顺序一致)
 * 		B:存储的元素可以重复
 */
public class ListDemo {
	public static void main(String[] args) {
		//创建集合对象
		List<String> list = new ArrayList<String>();
		
		//存储元素
		list.add("hello");
		list.add("world");
		list.add("java");
		list.add("world");
		
		//遍历集合
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
	}
}

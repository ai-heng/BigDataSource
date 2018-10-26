package com.itheima_01;

import java.util.ArrayList;
import java.util.List;

/*
 * List集合的遍历：
 * 		A:迭代器
 * 		B:普通for循环
 */
public class ListDemo3 {
	public static void main(String[] args) {
		// 创建集合对象
		List<String> list = new ArrayList<String>();

		// 添加元素
		list.add("hello");
		list.add("world");
		list.add("java");

		// E get(int index):获取指定位置的元素
		// System.out.println(list.get(0));
		// System.out.println(list.get(1));
		// System.out.println(list.get(2));
		// IndexOutOfBoundsException
		// System.out.println(list.get(3));
		// System.out.println("-----------");
		// ctrl+/ 可以对选中的代码进行单行注释，再来一次就是取消单行注释

		// 循环改进
		// for (int x = 0; x < 3; x++) {
		// System.out.println(list.get(x));
		// }
		
		//int size():集合的长度，也就是集合中元素的个数
		for(int x=0; x<list.size(); x++) {
			//System.out.println(list.get(x));
			String s = list.get(x);
			System.out.println(s);
		}

	}
}

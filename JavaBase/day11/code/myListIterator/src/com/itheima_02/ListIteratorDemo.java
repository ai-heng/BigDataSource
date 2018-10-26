package com.itheima_02;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 * 我有一个集合：List<String> list = new ArrayList<String>();
 * 里面有三个元素list.add("hello");list.add("world");list.add("java");
 * 我想判断里面有没有"world"这个元素，如果有，我就添加一个"javaee"元素，请写代码实现。
 * 
 * ConcurrentModificationException:当方法检测到对象的并发修改，但不允许这种修改时，抛出此异常。 
 * 
 * 产生的原因：
 * 		迭代器依赖于集合而存在，在判断成功后，集合中添加了新的元素，而迭代器并不知道，所有就报错了。
 * 		其实这个问题说的是：迭代器遍历集合中的元素的时候，不要使用集合对象去修改集合中的元素。
 * 如何解决呢?
 * 		A:迭代器遍历的时候，我可以通过迭代器修改集合中的元素
 * 			元素是跟在刚才迭代的元素后面的
 * 		B:集合遍历的时候，我可以通过集合对象修改集合中的元素
 * 			元素是在最后添加的
 */
public class ListIteratorDemo {
	public static void main(String[] args) {
		// 创建集合对象
		List<String> list = new ArrayList<String>();

		// 添加元素
		list.add("hello");
		list.add("world");
		list.add("java");
		
		//我想判断里面有没有"world"这个元素，如果有，我就添加一个"javaee"元素
//		Iterator<String> it = list.iterator();
//		while(it.hasNext()){
//			String s = it.next();
//			if(s.equals("world")) {
//				list.add("javaee");
//			}
//		}
		
		//迭代器遍历的时候，我可以通过迭代器修改集合中的元素
		ListIterator<String> lit = list.listIterator();
		while(lit.hasNext()) {
			String s = lit.next();
			if(s.equals("world")) {
				lit.add("javaee");
			}
		}
		
		//集合遍历的时候，我可以通过集合对象修改集合中的元素
//		for(int x=0; x<list.size(); x++) {
//			String s = list.get(x);
//			if(s.equals("world")) {
//				list.add("javaee");
//			}
//		}
		
		System.out.println(list);
	}
}

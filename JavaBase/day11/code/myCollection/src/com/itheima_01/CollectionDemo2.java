package com.itheima_01;

import java.util.ArrayList;
import java.util.Collection;

/*
 * boolean add(E e):���Ԫ��
 * boolean remove(Object o):�Ӽ������Ƴ�Ԫ��
 * void clear():��ռ����е�Ԫ��
 * boolean contains(Object o):�жϼ������Ƿ����ָ����Ԫ��
 * boolean isEmpty():�жϼ����Ƿ�Ϊ��
 * int size():���ϵĳ��ȣ�Ҳ���Ǽ�����Ԫ�صĸ���
 */
public class CollectionDemo2 {
	public static void main(String[] args) {
		//�������϶���
		Collection<String> c = new ArrayList<String>();
		
		//boolean add(E e):���Ԫ��
		//System.out.println("add:"+c.add("hello"));
		//System.out.println("add:"+c.add("world"));
		//ͨ���鿴Դ�룬����֪��ArrayList���ϵ�add�����ķ���ֵ��Զ����true
		c.add("hello");
		c.add("world");
		c.add("java");
		
		//boolean remove(Object o):�Ӽ������Ƴ�Ԫ��
		//System.out.println("remove:"+c.remove("world"));
		//System.out.println("remove:"+c.remove("haha"));
		
		//void clear():��ռ����е�Ԫ��
		//c.clear();
		
		//boolean contains(Object o):�жϼ������Ƿ����ָ����Ԫ��
		//System.out.println("contains:"+c.contains("world"));
		//System.out.println("contains:"+c.contains("haha"));
		
		//boolean isEmpty():�жϼ����Ƿ�Ϊ��
		//System.out.println("isEmpty:"+c.isEmpty());
		
		//int size():���ϵĳ��ȣ�Ҳ���Ǽ�����Ԫ�صĸ���
		System.out.println("size:"+c.size());
		
		//������϶���
		System.out.println(c);
	} 
}

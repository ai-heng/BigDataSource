package com.itheima_01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * Collection���ϵı���
 * 
 * Iterator<E> iterator():�����ڴ� collection ��Ԫ���Ͻ��е����ĵ�������
 * ͨ�����϶������iterator()�����õ�����������
 * 
 * Iterator:
 * 		E next():���ص�������һ��Ԫ�ء� 
 * 		boolean hasNext():�������Ԫ�ؿ��Ե������򷵻� true��
 */
public class CollectionDemo3 {
	public static void main(String[] args) {
		//�������϶���
		Collection<String> c = new ArrayList<String>();
		
		//���Ԫ��
		c.add("hello");
		c.add("world");
		c.add("java");
		
		//Iterator<E> iterator()
		Iterator<String> it = c.iterator();//���ص��ǵ������ӿڵ�ʵ����Ķ���
		//System.out.println(it.next());
		//System.out.println(it.next());
		//System.out.println(it.next());
		//NoSuchElementException:û��������Ԫ���쳣
		//System.out.println(it.next());
		
		//boolean hasNext()
		while(it.hasNext()){
			//System.out.println(it.next());
			String s = it.next();
			System.out.println(s);
		}
		
	}
}

package com.itheima_01;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 * ListIterator:
 * 		ListIterator<E> listIterator():���ش��б�Ԫ�ص��б������
 * 		public interface ListIterator<E>extends Iterator<E>
 * 
 * ���й��ܣ�
 * 		E previous():�����б��е�ǰһ��Ԫ�ء�
 * 		boolean hasPrevious():�������������б��б�������ж��Ԫ�أ��򷵻� true����
 *		ע�⣺ListIterator����ʵ���������������Ҫ��������������������������
 */
public class ListIteratorDemo {
	public static void main(String[] args) {
		//�������϶���
		List<String> list = new ArrayList<String>();
		
		//���Ԫ��
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

package com.itheima_02;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 * ����һ�����ϣ�List<String> list = new ArrayList<String>();
 * ����������Ԫ��list.add("hello");list.add("world");list.add("java");
 * �����ж�������û��"world"���Ԫ�أ�����У��Ҿ����һ��"javaee"Ԫ�أ���д����ʵ�֡�
 * 
 * ConcurrentModificationException:��������⵽����Ĳ����޸ģ��������������޸�ʱ���׳����쳣�� 
 * 
 * ������ԭ��
 * 		�����������ڼ��϶����ڣ����жϳɹ��󣬼�����������µ�Ԫ�أ�������������֪�������оͱ����ˡ�
 * 		��ʵ�������˵���ǣ����������������е�Ԫ�ص�ʱ�򣬲�Ҫʹ�ü��϶���ȥ�޸ļ����е�Ԫ�ء�
 * ��ν����?
 * 		A:������������ʱ���ҿ���ͨ���������޸ļ����е�Ԫ��
 * 			Ԫ���Ǹ��ڸղŵ�����Ԫ�غ����
 * 		B:���ϱ�����ʱ���ҿ���ͨ�����϶����޸ļ����е�Ԫ��
 * 			Ԫ�����������ӵ�
 */
public class ListIteratorDemo {
	public static void main(String[] args) {
		// �������϶���
		List<String> list = new ArrayList<String>();

		// ���Ԫ��
		list.add("hello");
		list.add("world");
		list.add("java");
		
		//�����ж�������û��"world"���Ԫ�أ�����У��Ҿ����һ��"javaee"Ԫ��
//		Iterator<String> it = list.iterator();
//		while(it.hasNext()){
//			String s = it.next();
//			if(s.equals("world")) {
//				list.add("javaee");
//			}
//		}
		
		//������������ʱ���ҿ���ͨ���������޸ļ����е�Ԫ��
		ListIterator<String> lit = list.listIterator();
		while(lit.hasNext()) {
			String s = lit.next();
			if(s.equals("world")) {
				lit.add("javaee");
			}
		}
		
		//���ϱ�����ʱ���ҿ���ͨ�����϶����޸ļ����е�Ԫ��
//		for(int x=0; x<list.size(); x++) {
//			String s = list.get(x);
//			if(s.equals("world")) {
//				list.add("javaee");
//			}
//		}
		
		System.out.println(list);
	}
}

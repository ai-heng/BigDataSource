package com.itheima_01;

import java.util.ArrayList;
import java.util.List;

/*
 * List���ϵı�����
 * 		A:������
 * 		B:��ͨforѭ��
 */
public class ListDemo3 {
	public static void main(String[] args) {
		// �������϶���
		List<String> list = new ArrayList<String>();

		// ���Ԫ��
		list.add("hello");
		list.add("world");
		list.add("java");

		// E get(int index):��ȡָ��λ�õ�Ԫ��
		// System.out.println(list.get(0));
		// System.out.println(list.get(1));
		// System.out.println(list.get(2));
		// IndexOutOfBoundsException
		// System.out.println(list.get(3));
		// System.out.println("-----------");
		// ctrl+/ ���Զ�ѡ�еĴ�����е���ע�ͣ�����һ�ξ���ȡ������ע��

		// ѭ���Ľ�
		// for (int x = 0; x < 3; x++) {
		// System.out.println(list.get(x));
		// }
		
		//int size():���ϵĳ��ȣ�Ҳ���Ǽ�����Ԫ�صĸ���
		for(int x=0; x<list.size(); x++) {
			//System.out.println(list.get(x));
			String s = list.get(x);
			System.out.println(s);
		}

	}
}

package com.itheima_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * List:����� collection��Ҳ��Ϊ���У���
 * �˽ӿڵ��û����Զ��б���ÿ��Ԫ�صĲ���λ�ý��о�ȷ�ؿ��ơ�
 * �û����Ը���Ԫ�ص��������������б��е�λ�ã�����Ԫ�أ��������б��е�Ԫ�ء�
 * �� set ��ͬ���б�ͨ�������ظ���Ԫ�ء�
 * 
 * List���ϵ��ص㣺
 * 		A:����(�洢��ȡ��Ԫ�ص�˳��һ��)
 * 		B:�洢��Ԫ�ؿ����ظ�
 */
public class ListDemo {
	public static void main(String[] args) {
		//�������϶���
		List<String> list = new ArrayList<String>();
		
		//�洢Ԫ��
		list.add("hello");
		list.add("world");
		list.add("java");
		list.add("world");
		
		//��������
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
	}
}

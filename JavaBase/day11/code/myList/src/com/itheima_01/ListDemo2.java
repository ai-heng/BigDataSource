package com.itheima_01;

import java.util.ArrayList;
import java.util.List;

/*
 * void add(int index,E element):��ָ��λ�����Ԫ��
 * E remove(int index):ɾ��ָ��λ�õ�Ԫ��
 * E get(int index):��ȡָ��λ�õ�Ԫ��
 * E set(int index,E element):�޸�ָ��λ�õ�Ԫ��
 */
public class ListDemo2 {
	public static void main(String[] args) {
		//�������϶���
		List<String> list = new ArrayList<String>();
		
		//ʹ�ü̳�Collection����ӹ���
		list.add("hello");
		list.add("world");
		list.add("java");
		
		//void add(int index,E element):��ָ��λ�����Ԫ��
		//list.add(1, "javaee");
		//IndexOutOfBoundsException
		//list.add(11,"javase");
		
		//E remove(int index):ɾ��ָ��λ�õ�Ԫ��,���ر�ɾ����Ԫ��
		//System.out.println("remove:"+list.remove(1));
		//System.out.println("remove:"+list.remove(11));
		
		//E get(int index):��ȡָ��λ�õ�Ԫ��
		//System.out.println("get:"+list.get(1));
		//System.out.println("get:"+list.get(11));
		
		//E set(int index,E element):�޸�ָ��λ�õ�Ԫ��,���ر��޸ĵ�Ԫ��
		//System.out.println("set:"+list.set(1, "javaee"));
		
		//������϶���
		System.out.println(list);
	}
}

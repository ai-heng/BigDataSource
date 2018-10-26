package com.itheima_01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * V get(Object key):���ݼ���ȡֵ
 * Set<K> keySet():��ȡ���м��ļ���
 * Collection<V> values():��ȡ����ֵ�ļ���
 */
public class MapDemo3 {
	public static void main(String[] args) {
		//�������϶���
		Map<String,String> map = new HashMap<String,String>();
		
		//���Ԫ��
		map.put("����", "����");
		map.put("���", "С��Ů");
		map.put("���޼�", "����");
		
		//V get(Object key):���ݼ���ȡֵ
		System.out.println("get:"+map.get("���޼�"));
		System.out.println("get:"+map.get("������"));
		System.out.println("--------------------");
		
		//Set<K> keySet():��ȡ���м��ļ���
		Set<String> set = map.keySet();
		for(String key : set) {
			System.out.println(key);
		}
		System.out.println("--------------------");
		
		//Collection<V> values():��ȡ����ֵ�ļ���
		Collection<String> values = map.values();
		for(String value : values) {
			System.out.println(value);
		}
	}
}

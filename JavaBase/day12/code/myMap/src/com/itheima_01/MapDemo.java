package com.itheima_01;

import java.util.HashMap;
import java.util.Map;

/*
 * Map:
 * 		����ӳ�䵽ֵ�Ķ���һ��ӳ�䲻�ܰ����ظ��ļ���ÿ�������ֻ��ӳ�䵽һ��ֵ�� 
 * 
 * ������ѧ����ѧ�ź�����
 * 		it001	����ϼ
 * 		it002	������
 * 		it003	������
 * 
 * public interface Map<K,V>
 * 
 */
public class MapDemo {
	public static void main(String[] args) {
		//�������϶���
		Map<String,String> map = new HashMap<String,String>();
		
		//���Ԫ��
		//put(K key,V value):���Ԫ�ء�
		map.put("it001", "����ϼ");
		map.put("it002", "������");
		map.put("it003", "������");
		
		//������϶���
		System.out.println(map);
	}
}

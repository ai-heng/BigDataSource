package com.itheima_02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map���ϱ����ķ�ʽ2
 * 
 * ˼·��
 * 		A:��ȡ���н��֤�ļ���
 * 		B:�������֤�ļ��ϣ��õ�ÿһ�����֤
 * 		C:���ݽ��֤��ȡ�ɷ������
 * 
 * ת����
 * 		A:��ȡ���м�ֵ�Զ���ļ���
 * 		B:������ֵ�Զ���ļ��ϣ��õ�ÿһ����ֵ�Զ���
 * 		C:���ݼ�ֵ�Զ����ȡ����ֵ
 */
public class MapDemo2 {
	public static void main(String[] args) {
		//�������϶���
		Map<String,String> map = new HashMap<String,String>();
		
		//���Ԫ��
		map.put("����","����");
		map.put("���","С��Ů");
		map.put("���޼�","����");
		
		//��ȡ���м�ֵ�Զ���ļ���
//		Set<Map.Entry<K,V>> entrySet()
//		��ȡ��ֵ�Զ���ļ���
		Set<Map.Entry<String,String>> set = map.entrySet();
		//������ֵ�Զ���ļ��ϣ��õ�ÿһ����ֵ�Զ���
		for(Map.Entry<String,String> me : set) {
			//���ݼ�ֵ�Զ����ȡ����ֵ
			String key = me.getKey();
			String value = me.getValue();
			System.out.println(key+"---"+value);
		}
	}
}

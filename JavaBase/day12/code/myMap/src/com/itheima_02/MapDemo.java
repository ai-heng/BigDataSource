package com.itheima_02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map���ϵı���
 * 
 * ˼·��Map������һ�����޶Եļ���
 * 		A:�����е��ɷ����������
 * 		B:�����ɷ�ļ��ϣ���ȡ��ÿһ���ɷ�
 * 		C:�����ɷ�ȥ�Ҷ�Ӧ������
 * 
 * ת����
 * 		A:��ȡ���м��ļ���
 * 		B:�������ļ��ϣ���ȡ��ÿһ����
 * 		C:���ݼ�ȥ��ֵ
 */
public class MapDemo {
	public static void main(String[] args) {
		//�������϶���
		Map<String,String> map = new HashMap<String,String>();
		
		//���Ԫ��
		map.put("����","����");
		map.put("���","С��Ů");
		map.put("���޼�","����");
		
		//��ȡ���м��ļ���
		Set<String> set = map.keySet();
		//�������ļ��ϣ���ȡ��ÿһ����
		for(String key : set) {
			//���ݼ�ȥ��ֵ
			String value = map.get(key);
			System.out.println(key+"---"+value);
		}
	}
}

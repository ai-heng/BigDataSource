package com.itheima;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
 * ����ArrayList����Ƕ��HashMap���ϲ�������
 * ����һ��ArrayList���ϣ�����������Ԫ�أ�ÿһ��Ԫ�ض���HashMap���͵ġ�
 * ÿһ��HashMap���ϵļ���ֵ����String���͵ģ�
 * ����String		�ɷ������
 * ֵ��String		���ӵ�����
 * �������µ��ַ������ݣ����ô���ʵ������
 * ��һ��HashMap���ϵ�Ԫ�أ�
 * 		���		����
 * 		���		С��
 * �ڶ���HashMap���ϵ�Ԫ�أ�
 * 		����		����
 * 		���		С��Ů
 * ������HashMap���ϵ�Ԫ�أ�
 * 		�����	��ӯӯ
 * 		��ƽ֮	����ɺ
 */
public class ArrayListIncludeHashMapTest {
	public static void main(String[] args) {
		//�������϶���
		ArrayList<HashMap<String,String>> array = new ArrayList<HashMap<String,String>>();
		
		//����Ԫ��1
		HashMap<String,String> hm1 = new HashMap<String,String>();
		hm1.put("���","����");
		hm1.put("���","С��");
		//��Ԫ����ӵ�array��
		array.add(hm1);
		
		//����Ԫ��2
		HashMap<String,String> hm2 = new HashMap<String,String>();
		hm2.put("����","����");
		hm2.put("���","С��Ů");
		//��Ԫ����ӵ�array��
		array.add(hm2);
		
		//����Ԫ��3
		HashMap<String,String> hm3 = new HashMap<String,String>();
		hm3.put("�����","��ӯӯ");
		hm3.put("��ƽ֮","����ɺ");
		//��Ԫ����ӵ�array��
		array.add(hm3);
		
		//����ArrayList����
		for(HashMap<String,String> hm : array) {
			Set<String> set = hm.keySet();
			for(String key : set) {
				String value = hm.get(key);
				System.out.println(key+"---"+value);
			}
			System.out.println("-----------------");
		}
		
	}
}

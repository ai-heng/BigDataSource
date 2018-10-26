package com.itheima.tests;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 * ��֪��һ��Map����,����洢����ѧ�������������䣬��������:
{������=21, ���ʦ̫=38, ����=28, ���»�=40, �Ϲ�=36, ��������=38}.
	����:
		a.�������е�Ԫ�������ֱ�����ʽ��ӡ������̨��
		b.���������24��ѧ�����������뵽D:\\student.txt��	
��ʾ:
1.	�ֱ����: ���ݼ���ȡֵ, ���ݼ�ֵ�Ի�ȡ����ֵ�ķ�ʽ��������.
2.	���ø�Ч�ַ������,������(ѧ������)д�뵽Ŀ�ĵ��ļ���..

 */
public class Test2_04 {
	public static void main(String[] args) throws IOException {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("������", 21);
		map.put("���ʦ̫", 38);
		map.put("����", 28);
		map.put("���»�", 40);
		map.put("�Ϲ�", 36);
		map.put("��������", 38);
		
		FileOutputStream fos = new FileOutputStream("student.txt");
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			Integer value = entry.getValue();
			if(value>24){
				fos.write(entry.getKey().getBytes());
			}
		}
		
		fos.close();
		
	}
}

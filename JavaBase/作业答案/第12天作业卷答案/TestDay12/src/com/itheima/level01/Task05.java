package com.itheima.level01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
 * ����HashMap����Ƕ��ArrayList���ϲ�������
 * ����һ��HashMap���ϣ�����������Ԫ�أ�ÿһ��Ԫ�صļ���String���ͣ�ֵ��ArrayList���͡�
 * ����String			���������Ĳ����Ӿ�
 * ֵ��ArrayList		���������
 * ÿһ��ArrayList���ϵ�������String���͵ġ�
 * �������µ��ַ������ݣ����ô���ʵ������
 * ��һ��ArrayList���ϵ�Ԫ�أ�(��������)
 * 		�����
 * 		����
 * �ڶ���ArrayList���ϵ�Ԫ�أ�(���μ�)
 * 		��ɮ
 * 		�����
 * ������ArrayList���ϵ�Ԫ�أ�(ˮ䰴�)
 * 		����
 * 		³����
 */
public class Task05 {
	public static void main(String[] args) {
		// �������϶���
		HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();

		// ����Ԫ��1
		ArrayList<String> sgyy = new ArrayList<String>();
		sgyy.add("�����");
		sgyy.add("����");
		// ��Ԫ����ӵ�hm��
		hm.put("��������", sgyy);

		// ����Ԫ��2
		ArrayList<String> xyj = new ArrayList<String>();
		xyj.add("��ɮ");
		xyj.add("�����");
		// ��Ԫ����ӵ�hm��
		hm.put("���μ�", xyj);

		// ����Ԫ��3
		ArrayList<String> shz = new ArrayList<String>();
		shz.add("����");
		shz.add("³����");
		// ��Ԫ����ӵ�hm��
		hm.put("ˮ䰴�", shz);

		// ��������
		Set<String> set = hm.keySet();
		for (String key : set) {
			System.out.println(key);
			ArrayList<String> value = hm.get(key);
			for (String s : value) {
				System.out.println("\t" + s);
			}
		}
	}
}

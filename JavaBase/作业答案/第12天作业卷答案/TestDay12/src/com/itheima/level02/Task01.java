package com.itheima.level02;

import java.util.ArrayList;

/*
1.����һ������Ϊ10��int����,������10��int���͵�����,������һЩ�������ظ���
2.���ü��ϵ�֪ʶ���������ȥ��,����������,���ܸı�������ԭ�����ֵĴ�С˳��
3.��ӡ�������е�����
*/
public class Task01 {
	public static void main(String[] args) {
		int[] arr = {33, 22, 11, 33, 15, 66, 88, 22, 10, 97};
		
		ArrayList<Integer> list = new ArrayList<>();
		// ��������
		for(int in : arr){
			// �жϼ������Ƿ����ָ��Ԫ��
			if(!list.contains(in))
				list.add(in);
		}
		
		int[] newArr = new int[list.size()];
		// �����¼��ϵ�����
		int index = 0;
		// �������ϣ�Ϊ������Ԫ�ظ�ֵ
		for (int in : list) {
			newArr[index++] = in;
		}
	}
}

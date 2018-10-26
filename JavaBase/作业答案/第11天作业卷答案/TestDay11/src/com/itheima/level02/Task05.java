package com.itheima.level02;

import java.util.ArrayList;

public class Task05 {}

class MyArrays {
	/*
	 * 1.public static void reverse(ArrayList<Integer> list);
	 * ����ArrayList<Integer> list:Ҫ���в����ļ��϶���
	 * Ҫ�󣺶�list���϶����е�Ԫ�ؽ��з�ת(��һ�������һ���������ڶ����͵����ڶ����������������͵�������������...)
	 */
	public static void reverse(ArrayList<Integer> list) {
		for (int start = 0, end = list.size() - 1; start < end; start++, end--) {
			Integer in = list.get(start);
			list.set(start, list.get(end));
			list.set(end, in);
		}
	}

	/*
	 * 2.public static Integer max(ArrayList<Integer> list);
	 * ����ArrayList<Integer> list:Ҫ���в����ļ��϶��� Ҫ�����list���϶����е����ֵ������
	 */
	public static Integer max(ArrayList<Integer> list) {
		Integer max = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (max < list.get(i)) {
				max = list.get(i);
			}
		}
		return max;
	}

	/*
	 * 3.public static Integer min(ArrayList<Integer> list);
	 * ����ArrayList<Integer> list:Ҫ���в����ļ��϶��� Ҫ�����list���϶����е���Сֵ������
	 */
	public static Integer min(ArrayList<Integer> list) {
		int min = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (min > list.get(i)) {
				min = list.get(i);
			}
		}
		return min;
	}

	/*
	 * 4.public static int indexOf(ArrayList<Integer> list,Integer i);
	 * ����ArrayList<Integer> list:Ҫ���в����ļ��϶��� ����Integer i:��Ҫ�ڼ����в��ҵ�Ԫ��
	 * Ҫ�����Ԫ��i��list�����е�һ�γ��ֵ����������û�з���-1
	 */
	public static int indexOf(ArrayList<Integer> list, Integer i) {
		for (int j = 0; j < list.size(); j++) {
			// �����ֵ�͵�ǰ��ֵ���бȽ�
			if (list.get(j) == i) {
				return j;
			}
		}
		// ���û���ҵ�����-1
		return -1;
	}

	/*
	 * 5.public static void replaceAll(ArrayList<Integer> list,Integer
	 * oldValue,Integer newValue); ����ArrayList<Integer> list:Ҫ���в����ļ��϶���
	 * ����Integer oldValue:��Ҫ���滻����ԭֵ ����Integer newValue���滻�����ֵ
	 * Ҫ�󣺽�list�����е�����ֵΪoldValue��Ԫ���滻ΪnewValue
	 */
	public static void replaceAll(ArrayList<Integer> list, Integer oldValue, Integer newValue) {
		// ��������
		for (int i = 0; i < list.size(); i++) {
			// ͨ���������Ԫ�غ͵�ǰԪ�ضԱ�
			if (list.get(i) == oldValue) {
				// �����滻,����Ԫ�����ø���ǰ����λ��
				list.set(i, newValue);
			}
		}
	}
}

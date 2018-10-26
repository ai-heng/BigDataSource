package com.itheima.level02;

import java.util.ArrayList;

public class Task05 {}

class MyArrays {
	/*
	 * 1.public static void reverse(ArrayList<Integer> list);
	 * 参数ArrayList<Integer> list:要进行操作的集合对象
	 * 要求：对list集合对象中的元素进行反转(第一个和最后一个交换，第二个和倒数第二个交换，第三个和倒数第三个交换...)
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
	 * 参数ArrayList<Integer> list:要进行操作的集合对象 要求：求出list集合对象中的最大值并返回
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
	 * 参数ArrayList<Integer> list:要进行操作的集合对象 要求：求出list集合对象中的最小值并返回
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
	 * 参数ArrayList<Integer> list:要进行操作的集合对象 参数Integer i:需要在集合中查找的元素
	 * 要求：求出元素i在list集合中第一次出现的索引，如果没有返回-1
	 */
	public static int indexOf(ArrayList<Integer> list, Integer i) {
		for (int j = 0; j < list.size(); j++) {
			// 传入的值和当前的值进行比较
			if (list.get(j) == i) {
				return j;
			}
		}
		// 如果没有找到返回-1
		return -1;
	}

	/*
	 * 5.public static void replaceAll(ArrayList<Integer> list,Integer
	 * oldValue,Integer newValue); 参数ArrayList<Integer> list:要进行操作的集合对象
	 * 参数Integer oldValue:需要被替换掉的原值 参数Integer newValue：替换后的新值
	 * 要求：将list集合中的所有值为oldValue的元素替换为newValue
	 */
	public static void replaceAll(ArrayList<Integer> list, Integer oldValue, Integer newValue) {
		// 遍历集合
		for (int i = 0; i < list.size(); i++) {
			// 通过传入的老元素和当前元素对比
			if (list.get(i) == oldValue) {
				// 进行替换,将新元素设置给当前索引位置
				list.set(i, newValue);
			}
		}
	}
}

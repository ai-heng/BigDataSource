package com.itheima;

import java.util.Arrays;

/*
 * Arrays:�ṩ�˶���������ĸ��ַ�����
 * public static String toString(int[] a):������ת���ַ���
 * public static void sort(int[] a):�����������������
 */
public class ArraysDemo {
	public static void main(String[] args) {
		//����һ������
		int[] arr = {24,69,80,57,13};
		
		//public static String toString(int[] a):������ת���ַ���
		System.out.println("����ǰ��"+Arrays.toString(arr));
		
		//public static void sort(int[] a):�����������������
		Arrays.sort(arr);
		
		System.out.println("�����"+Arrays.toString(arr));
	}
}

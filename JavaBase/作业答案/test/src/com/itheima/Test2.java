package com.itheima;

import java.util.Arrays;

// ��������ĶԳ�λ��     
public class Test2 {

	public static void main(String[] args) {
		int[] arr = {22, 33, 88, 66, 77, 99};
		
		System.out.println("ԭ���飺" + Arrays.toString(arr));
		
		// ���÷���
		changeArr(arr);
		
		System.out.println("ת����" + Arrays.toString(arr));
		
	}
	
	/*
	 * ����ֵ��void
	 * �����б���Ҫ���������� int[] arr
	 */
	public static void changeArr(int[] arr) {
		// ѭ��������һ�뼴��
		for (int i = 0; i < arr.length / 2; i++) {
			// �����Գ�λ��
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
	}

}

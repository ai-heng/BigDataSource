package com.itheima;

import java.util.Arrays;
import java.util.Random;

/*
3��	�������20��1-100֮������������������С�
	a)	������ǵ�ƽ��ֵ
	b)	�����ƽ��ֵ�����С������Ԫ��

 */
public class Test3 {

	public static void main(String[] args) {
		// ���������
		Random r = new Random();
		// ����
		int[] arr = new int[20];
		// ����20������������
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100) + 1;
		}
		// ��һ��
		System.out.println(Arrays.toString(arr));
		
		// ���巽���������ƽ��ֵ
		double avg = getAvg(arr);
		System.out.println("ƽ��ֵ��" + avg);
		
		// ���巽����ȡ��ƽ��ֵ�����С��Ԫ��
		int value = getElementNearAvg(arr, avg);
		System.out.println("��ƽ��ֵ�����С��Ԫ���ǣ�" + value);
	}
	
	/*
	 * ����ֵ���ͣ� int
	 * �����б�int[] arr, double avg
	 */
	public static int getElementNearAvg(int[] arr, double avg) {
		// ������
		int e = arr[0];
		// ѭ������
		for (int i = 1; i < arr.length; i++) {
			// ����ÿ��Ԫ����ƽ��ֵ�Ĳ�ֵ
			double cha = avg > arr[i] ? avg - arr[i] : arr[i] - avg;
			// ����ȡ����ֵ
			//double cha = Math.abs(avg - arr[i]);
			
			// ע�⣺�Ƚϵ��ǲ�ֵ
			if (cha < Math.abs(avg - e)) {
				e = arr[i];
			}
		}
		return e;
	}
	
	/*
	 * ����ֵ���� double
	 * �����б� int[] arr
	 */
	public static double getAvg(int[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum / arr.length;
	}

}

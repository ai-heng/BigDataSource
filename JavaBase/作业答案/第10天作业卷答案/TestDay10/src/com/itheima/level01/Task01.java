package com.itheima.level01;

/*
����һ�����飬������Ԫ��Ϊ��{24,69,80,57,13}��
�������е�Ԫ�ذ��մ�С�����˳���������
 */
public class Task01 {
	public static void main(String[] args) {
		// ����һ��int���͵�����
		int[] arr = { 24, 69, 80, 57, 13 };

		sort(arr);
		System.out.println("�����");
		printArray(arr);
	}

	/*
	 * �������
	 */
	public static void printArray(int[] arr) {
		System.out.print("[");
		for (int x = 0; x < arr.length; x++) {
			if (x == arr.length - 1) {
				System.out.print(arr[x]);
			} else {
				System.out.print(arr[x] + ", ");
			}
		}
		System.out.println("]");
	}

	/*
	 * ������ȷ�� ����ֵ���ͣ�void �����б�int[] arr
	 */
	public static void sort(int[] arr) {
		for (int x = 0; x < arr.length - 1; x++) {
			for (int y = 0; y < arr.length - 1 - x; y++) {
				if (arr[y] > arr[y + 1]) {
					int temp = arr[y];
					arr[y] = arr[y + 1];
					arr[y + 1] = temp;
				}
			}
		}
	}
}

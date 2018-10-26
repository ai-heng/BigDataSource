package com.itheima.level01;

/*
定义一个数组，数组中元素为：{24,69,80,57,13}，
将数组中的元素按照从小到大的顺序进行排序
 */
public class Task01 {
	public static void main(String[] args) {
		// 定义一个int类型的数组
		int[] arr = { 24, 69, 80, 57, 13 };

		sort(arr);
		System.out.println("排序后：");
		printArray(arr);
	}

	/*
	 * 数组遍历
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
	 * 两个明确： 返回值类型：void 参数列表：int[] arr
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

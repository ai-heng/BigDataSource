package com.itheima.level02;

/*
 * 分析以下需求，并用代码实现
	1.定义一个方法equals(int[] arr1,int[] arr2),功能:比较两个数组是否相等(长度和内容均相等则认为两个数组是相同的)
	2.定义一个方法fill(int[] arr,int value),功能:将数组arr中的所有元素的值改为value
	3.定义一个方法fill(int[] arr,int fromIndex,int toIndex,int value),功能:将数组arr中的元素从索引fromIndex开始到toIndex(不包含toIndex)对应的值改为value
	4.定义一个方法copyOf(int[] arr, int newLength),功能:将数组arr中的newLength个元素拷贝到新数组中,并将新数组返回,从索引为0开始
	5.定义一个方法copyOfRange(int[] arr,int from, int to),功能:将数组arr中从索引from(包含from)开始到索引to结束(不包含to)的元素复制到新数组中,并将新数组返回
 */
public class Task03 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 1, 2, 3, 5 };
		// boolean b = equals(arr1, arr2);
		// System.out.println(b);
		// fill(arr2, 5);
		// for(int i = 0; i < arr2.length; i++) {
		// System.out.println(arr2[i]);
		// }
		// fill(arr2, 1, 3, 6);
		// for(int i = 0; i < arr2.length; i++) {
		// System.out.println(arr2[i]);
		// }
		// int[] arr3 = copyOf(arr2, 3);
		// for(int i = 0; i < arr3.length; i++) {
		// System.out.println(arr3[i]);
		// }
		int[] arr3 = copyOfRange(arr2, 1, 3);
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
	}

	/*
	 * 定义一个方法equals(int[] arr1,int[] arr2),功能:比较两个数组是否相等(长度和内容均相等则认为两个数组是相同的)
	 * 1.先比较长度，如果长度不相等，直接返回false 2. 遍历其中一个数组，依次拿这个数组中的每一个元素和另外一个数组对应的元素比较
	 * arr1[1] arr2[1]
	 */
	public static boolean equals(int[] arr1, int[] arr2) {
		if (arr1.length != arr2.length) {
			return false;
		}
		for (int i = 0; i < arr1.length; i++) {
			// arr1[i] 和 arr2[i]比较
			/*
			 * 所有元素都相同才相同，也就是只要有一个不同，这两个数组就是不相同的数组
			 */
			if (arr1[i] != arr2[i]) {// 如果两个数组相应的元素只要有一个不相等，就返回false
				return false;
			}
		}
		return true;
	}

	/*
	 * 定义一个方法fill(int[] arr,int value),功能:将数组arr中的所有元素的值改为value
	 * 
	 * 思路 遍历arr数组，依次拿到每一个元素给他赋值成value
	 */
	public static void fill(int[] arr, int value) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = value;
		}
	}
	/*
	 * 定义一个方法fill(int[] arr,int fromIndex,int toIndex,int
	 * value),功能:将数组arr中的元素从索引fromIndex开始到toIndex(不包含toIndex) 对应的值改为value 思路：
	 * 指定范围遍历数组，起始是fromIndex，结束toIndex，遍历arr数组，依次拿到每一个元素给他赋值成value
	 */

	public static void fill(int[] arr, int fromIndex, int toIndex, int value) {
		for (int i = fromIndex; i < toIndex; i++) {
			arr[i] = value;
		}
	}

	/*
	 * 定义一个方法copyOf(int[] arr, int
	 * newLength),功能:将数组arr中的newLength个元素拷贝到新数组中,并将新数组返回,从索引为0开始 返回值：数组 1.创建新数组
	 * 3 6 2.使用for循环，循环范围是0到新数组的长度，依次把旧数组当前索引的元素赋值给对应的新数组
	 */
	public static int[] copyOf(int[] arr, int newLength) {
		int[] newArr = new int[newLength];
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = arr[i];
		}
		return newArr;
	}

	/*
	 * 2 4 5.定义一个方法copyOfRange(int[] arr,int from, int
	 * to),功能:将数组arr中从索引from(包含from)开始到索引to结束(不包含to)的元素复制到新数组中 ,并将新数组返回 思路
	 * 1.创建新数组，新数组的长度to - from 2.遍历新数组，把旧数组对应位置的元素赋值给新数组对应位置元素
	 * 
	 */
	// {1,2,3,4}; 1 3
	// [2,3]

	public static int[] copyOfRange(int[] arr, int from, int to) {
		int[] newArr = new int[to - from];
		for (int i = 0; i < newArr.length; i++) {
			// 把旧数组哪一个位置赋值给新数组的位置
			newArr[i] = arr[i + from];
		}
		return newArr;
	}
}

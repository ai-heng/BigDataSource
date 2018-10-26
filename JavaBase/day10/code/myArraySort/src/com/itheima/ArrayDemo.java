package com.itheima;
/*
 * 数组排序：(冒泡排序)
 */
public class ArrayDemo {
	public static void main(String[] args) {
		//定义一个int类型的数组
		int[] arr = {24,69,80,57,13};
		
		/*
		//第一次比较
		//arr.length-1是为了防止索引越界
		//arr.length-1-0是为了减少比较的次数
		for(int x=0; x<arr.length-1-0; x++) {
			//ArrayIndexOutOfBoundsException
			if(arr[x] > arr[x+1]) {
				//交换数据
				int temp = arr[x];
				arr[x] = arr[x+1];
				arr[x+1] = temp;
			}
		}
		//调用遍历方法
		System.out.println("第一次比较完毕：");
		printArray(arr);
		
		//第二次比较
		//arr.length-1是为了防止索引越界
		//arr.length-1-1是为了减少比较的次数
		for(int x=0; x<arr.length-1-1; x++) {
			//ArrayIndexOutOfBoundsException
			if(arr[x] > arr[x+1]) {
				//交换数据
				int temp = arr[x];
				arr[x] = arr[x+1];
				arr[x+1] = temp;
			}
		}
		//调用遍历方法
		System.out.println("第二次比较完毕：");
		printArray(arr);
		
		//第三次比较
		//arr.length-1是为了防止索引越界
		//arr.length-1-2是为了减少比较的次数
		for(int x=0; x<arr.length-1-2; x++) {
			//ArrayIndexOutOfBoundsException
			if(arr[x] > arr[x+1]) {
				//交换数据
				int temp = arr[x];
				arr[x] = arr[x+1];
				arr[x+1] = temp;
			}
		}
		//调用遍历方法
		System.out.println("第三次比较完毕：");
		printArray(arr);
		
		//第四次比较
		//arr.length-1是为了防止索引越界
		//arr.length-1-3是为了减少比较的次数
		for(int x=0; x<arr.length-1-3; x++) {
			//ArrayIndexOutOfBoundsException
			if(arr[x] > arr[x+1]) {
				//交换数据
				int temp = arr[x];
				arr[x] = arr[x+1];
				arr[x+1] = temp;
			}
		}
		//调用遍历方法
		System.out.println("第四次比较完毕：");
		printArray(arr);
		*/
		
		//用循环改进
		/*
		for(int y=0; y<4; y++) {
			for(int x=0; x<arr.length-1-y; x++) {
				if(arr[x] > arr[x+1]) {
					//交换数据
					int temp = arr[x];
					arr[x] = arr[x+1];
					arr[x+1] = temp;
				}
			}
		}
		*/
		
		/*
		//循环做的次数不能写固定的值，用arr.length-1改进即可
		for(int y=0; y<arr.length-1; y++) {
			for(int x=0; x<arr.length-1-y; x++) {
				if(arr[x] > arr[x+1]) {
					//交换数据
					int temp = arr[x];
					arr[x] = arr[x+1];
					arr[x+1] = temp;
				}
			}
		}
		printArray(arr);
		*/
		
		//如果我有多个数组要排序，每个数组写这样的一段代码，太麻烦，怎么办呢
		//用方法改进
		sort(arr);
		System.out.println("排序后：");
		printArray(arr);
	}
	
	/*
	 * 两个明确：
	 * 		返回值类型：void
	 * 		参数列表：int[] arr
	 */
	public static void sort(int[] arr) {
		for(int x=0; x<arr.length-1; x++) {
			for(int y=0; y<arr.length-1-x; y++) {
				if(arr[y] > arr[y+1]) {
					int temp = arr[y];
					arr[y] = arr[y+1];
					arr[y+1] = temp;
				}
			}
		}
	}
	
	/*
	 * 数组遍历
	 */
	public static void printArray(int[] arr) {
		System.out.print("[");
		for(int x=0; x<arr.length; x++) {
			if(x==arr.length-1) {
				System.out.print(arr[x]);
			}else {
				System.out.print(arr[x]+", ");
			}
		}
		System.out.println("]");
	}
}

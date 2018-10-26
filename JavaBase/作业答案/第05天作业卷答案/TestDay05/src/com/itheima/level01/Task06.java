package com.itheima.level01;
/*
 * 	定义一个方法，查找指定数字在数组中出现的位置(若出现多次，多次打印)
	如: 	数组[1232]要查找的数是2 则方法内部会打印索引值 1 ,3 
		数组[1232]要查找的数是5 则方法每部会打印 “数组中没有这个数字”
 */
public class Task06 {
	public static void main(String[] args) {
		//1.指定数组
		int[] arr = {1,2,3,2};
		//2.指定要查找的数字
		//int key = 2;
		int key = 5;
		//3.查找指定数字在数组中出现的位置
		getIndex(arr, key);
	}
	
	/*
	 * 查找指定数字在数组中出现的位置
	 * 指定方法的名称：getIndex
	 * 指定方法的参数：int[] arr, int key
	 * 指定方法的返回值：void
	 */
	public static void getIndex(int[] arr, int key){
		boolean isFind = false; //记录在数组中是否找到了key
		
		//数组[1232]要查找的数是2 则方法内部会打印索引值 1 ,3 
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				System.out.print(i + "  ");
				//更新isFind的值为true
				isFind = true;
			}
		}
		//数组[1232]要查找的数是5 则方法每部会打印 “数组中没有这个数字”
		//1.定义一个boolean变量，记录是否找到了key , 找到了为true， 没找到为false
		//2.通过循环判断是否找到了key，若找到了把变量设置为true
		//3.循环结束后，根据boolean变量的值，若为false，说明“数组中没有这个数字”
		if (!isFind) {
			System.out.println("数组中没有这个数字");
		}
	}

}

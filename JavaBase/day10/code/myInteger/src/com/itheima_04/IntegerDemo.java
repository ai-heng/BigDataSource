package com.itheima_04;

import java.util.Arrays;

/*
 * 我有如下一个字符串:”91 27 46 38 50”
 * 请写代码实现最终输出结果是：”27 38 46 50 91”
 * 提示：这里需要参考String类中的方法
 * public String[] split(String regex)
 * 
 * 分析：
 * 		A:定义一个字符串对象
 * 		B:把字符串中的数字数据存储到一个int类型的数组中
 * 		C:对int数组进行排序
 * 		D:把排序后的数组中的元素进行拼接得到一个字符串
 * 		E:输出字符串
 */
public class IntegerDemo {
	public static void main(String[] args) {
		//定义一个字符串对象
		String s = "91 27 46 38 50";
		
		//把字符串中的数字数据存储到一个int类型的数组中
		//public String[] split(String regex)
		String[] strArray = s.split(" ");
		/*
		for(int x=0; x<strArray.length; x++) {
			System.out.println(strArray[x]);
		}
		*/
		
		//定义一个int类型的数组
		int[] arr = new int[strArray.length];
		for(int x=0; x<arr.length; x++) {
			arr[x] = Integer.parseInt(strArray[x]);
		}
		
		//对int数组进行排序
		Arrays.sort(arr);
		
		//把排序后的数组中的元素进行拼接得到一个字符串
		StringBuilder sb = new StringBuilder();
		for(int x=0; x<arr.length; x++) {
			if(x==arr.length-1) {
				sb.append(arr[x]);
			}else {
				sb.append(arr[x]).append(" ");
			}
		}
		String result = sb.toString();
		
		//输出字符串
		System.out.println("result:"+result);
	}
}

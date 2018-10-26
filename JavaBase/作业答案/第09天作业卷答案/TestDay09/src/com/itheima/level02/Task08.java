package com.itheima.level02;

/*
 * 	需求说明：定义如下字符串：
		String str = “javajfiewjavajfiowfjavagkljjava”;
	请分别定义方法统计出：
		1.	字符串中：字符j的数量
		2.	字符串中：字符串java的数量
 */
public class Task08 {
	public static void main(String[] args) {
		//1.定义字符串
		String str = "javajfiewjavajfiowfjavagkljjava";
		//2.调用方法，得到字符j的数量
		int count = getCount(str, 'j');
		int count2 = getCount(str, "java");//得到字符j的数量
		//3.打印数量
		System.out.println("字符j的数量:" + count);
		System.out.println("字符串java的数量:" + count2);
	}
	
	/*
	 * 需求：计算大字符串中包含指定字符、字符串的数量
	 * 指定方法的名称： getCount
	 * 指定方法的参数: String str, char ch
	 * 指定方法的返回值： int
	 */
	public static int getCount(String str, char ch){
		//1.定义一个变量，用来记录查找到ch的次数
		int count = 0;
		//2.查找str字符串中出现ch字符的次数
		int index = 0;
		while ((index = str.indexOf(ch)) != -1) {//说明查找到了字符ch出现的位置
			count++; //出现的次数累加1
			str = str.substring(index + 1);//更新str字符串中的内容
		}
		return count;
	}
	
	/*
	 * 需求：计算大字符串中包含指定字符、字符串的数量
	 * 指定方法的名称： getCount
	 * 指定方法的参数: String str, String ch
	 * 指定方法的返回值： int
	 */
	public static int getCount(String str, String ch){
		//1.定义一个变量，用来记录查找到ch的次数
		int count = 0;
		//2.查找str字符串中出现ch字符的次数
		int index = 0;
		while ((index = str.indexOf(ch)) != -1) {//说明查找到了字符ch出现的位置
			count++; //出现的次数累加1
			str = str.substring(index + 1);//更新str字符串中的内容
		}
		return count;
	}
}	

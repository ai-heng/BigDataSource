package com.itheima.level02;

import java.util.Random;

/*
1.定义String getStr(char[] chs)方法
	功能描述：获取长度为5的随机字符串，字符串由随机的4个大写英文字母和1个0-9之间（包含0和9）的整数组成
2.定义main方法，方法内完成：
	(1)定义长度为26，元素值为26个大写英文字母的数组chs
	(2)传递数组chs调用getStr(char[] chs)方法，获取返回值,并在控制台打印返回值	

思路：
1、定义字符数组
2、为数组中添加元素
3、 定义getStr(char[] chs)方法，根据传入的字符数组随机获取4个大写的英文字母，然后再利用随机数生成0-9之间的一个随机数。
4、 将4个英文字母与随机数组合成新的字符串并返回。
 */
public class Task05 {
	public static void main(String[] args) {
//		char[] chs = {'A', 'B', 'C', 'D', 'E'.......};
		char[] chs = new char[26];
		int index = 0;
		for(int i='A'; i<='Z'; i++){
//			chs[index] = (char)i;
//			index++;
			chs[index++] = (char)i;
		}
		
		String str = getStr(chs);
		
		System.out.println(str);
	}

	public static String getStr(char[] chs) {
		// 定义空字符串
		String s = "";
		Random r = new Random();
		// 循环四次，为了获取数组中四个随机字符
		for(int i=0; i<4; i++){
//			r.nextInt(26); 代表数组的随机索引，只要索引随机了，那么就可以拿到随机的字符
			s = s + chs[r.nextInt(26)];
		}
		// 获取0-9之间的随机数
		s += r.nextInt(10);
		return s;
	}
}
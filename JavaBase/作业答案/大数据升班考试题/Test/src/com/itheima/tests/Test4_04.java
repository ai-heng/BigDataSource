package com.itheima.tests;

import java.util.Arrays;

/*
 * 需求: 已知字符串String str = “6ab11c333def521gh9i5jk61nm3n2”;,求字符串中出现的各数字之和.
	格式如下;
		 	
	
	提示:
	1.	切割字符串,获取到所有的字符串形式的数字.
	2.	将其转换成整数类型的数字,然后计算结果即可

 */
public class Test4_04 {
	public static void main(String[] args) {
		String str = "6ab11c333def521gh9i5jk61nm3n2";
		
		//第一步：我先把str里的字母变成空格
		
		String news = "";
		
		for (int i = 0; i < str.length(); i++) {
			//遍历字符串，取出一个元素
			char ch = str.charAt(i);
			//如果它是一个字母news里就添加 一个空格，如果不是就直接放到news里
			if(ch>='a'&&ch<='z'){
				news+=" ";
			}else{
				news+=ch;
			}
		}
		System.out.println(news);
		//用空格去切割字符串，拿到如下数组
		String[] split = news.split(" ");
		//["6", "", "11", "333", "", "", "521", "", "9", "5", "", "61", "", "3", "2"]
		System.out.println(Arrays.toString(split));
		
		int sum = 0;
		//判断一下元素是否为空字符串，如果不是就把它变成数字累加到sum里
		for (String s : split) {
			if(!s.equals("")){
				sum+=Integer.parseInt(s);
			}
		}
		System.out.println(sum);
	}
}

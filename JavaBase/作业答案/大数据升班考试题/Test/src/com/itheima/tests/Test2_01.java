package com.itheima.tests;
/*
 * 已知字符串 String str = "goOd gooD stUdy dAy dAy up"; 
需求: 将每个单词的首字母转换成大写其余字母转成小写,然后将结果打印到控制台上. 
	(不许直接输出Good Good Study Day Day Up 要用代码实现)
 

提示:
1.	将字符串按照空格进行切割.
2.	遍历,获取到每一个字符串,首字母大写其他小写.
3.	拼接成新的字符出, 然后打印到控制台上.

 */
public class Test2_01 {
	public static void main(String[] args) {
		String str = "goOd gooD stUdy dAy dAy up"; 
		
		String[] split = str.split(" ");
		
		String news = "";
		
		for (int i = 0; i < split.length; i++) {
			String s = split[i];
			//把全部字母变成小写
			s = s.toLowerCase();
//			news+=(char)(s.charAt(0)-32);
//			news+=s.substring(1);//从第一个位置开始截取字符串，截取到最后一个字符，添加到news里
			//从某个索引位置开始截取字符串，截取到最后一个字符
			//遍历字符串
			for (int j = 0; j < s.length(); j++) {
				//如果是第一个字符的话，转成大写在放到news里
				if(j==0){
					news+=(char)(s.charAt(j)-32);
				}else{
					//如果不是第一个字符，就直接扔到news里 就ok
					news+=s.charAt(j);
				}
			}
			news+=" ";
		}
		System.out.println(news);
	}
}

package com.itheima.level02;

import java.util.ArrayList;
import java.util.Random;

/*
1.产生10个1-20之间的随机数要求随机数不能重复
2.产生10个长度为10的不能重复的字符串(里面只能出现大写字母、小写字母、0-9的数字)，并遍历打印输出
 */
public class Task03 {
	public static void main(String[] args) {
		// 获取字符串，内容为大写字母+小写字母+数字
		String s = "";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= 9; i++) {
			sb.append(i);
		}
		for (int i = 97; i <= 122; i++) {
			sb.append((char) i);
		}
		for (int i = 65; i <= 90; i++) {
			sb.append((char) i);
		}
		s = sb.toString();
		System.out.println(s);

		// 创建随机数对象
		Random r = new Random();
		// 创建缓冲区对象
		StringBuilder sb2 = new StringBuilder();

		// 创建集合对象用于存储不重复的字符串
		ArrayList<String> list = new ArrayList<>();
		// 如果集合长度不足10，那么就继续给集合添加字符串
		while (list.size() < 10) {
			// 循环产生长度为10的字符串
			for (int i = 0; i < 10; i++) {
				int random = r.nextInt(62);
				sb2.append(s.charAt(random));
			}
			// 判断集合中是否包含指定的字符串
			if (!list.contains(sb2.toString())) {
				// 如果不包含，集合添加这个字符串
				list.add(sb2.toString());
			}
			// 清空缓冲区，为了下次继续产生新的字符串
			sb2.delete(0, sb2.length());
		}

		System.out.println(list);
	}

}

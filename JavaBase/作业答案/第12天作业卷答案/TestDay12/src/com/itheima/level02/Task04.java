package com.itheima.level02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
1.利用键盘录入，输入一个字符串
2.统计该字符串中各个字符的数量(提示:字符不用排序)
3.如：
	用户输入字符串"If~you-want~to~change-your_fate_I_think~you~must~come-to-the-dark-horse-to-learn-java"
	程序输出结果：-(9)I(2)_(3)a(7)c(2)d(1)e(6)f(2)g(1)h(4)i(1)j(1)k(2)l(1)m(2)n(4)o(8)r(4)s(2)t(8)u(4)v(1)w(1)y(3)~(6)
	
字符 --- 次数

思路：
1、创建map集合，键为Character，值为Integer
2、键盘录入字符串 str
3、 将字符串转换为字符数组，并遍历这个字符数组，获取每个字符
4、 在循环中判断集合中map集合中的键是否包含这个字符，如果map集合中的键不包含这
	个字符，那么就让map执行put方法，键就是遍历到的字符，值为1
	如果map集合中包含这个键，就让map集合的值 + 1存储
5、 循环完毕后，遍历map集合进行打印，打印过程中按照指定格式来进行。
 */
public class Task04 {
	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String str = sc.nextLine();
		
		char[] chs = str.toCharArray();
		for (char ch : chs) {
			/*if(map.containsKey(ch))
				map.put(ch, map.get(ch) + 1);
			else 
				map.put(ch, 1);*/
			map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
		}
		
		// 遍历map集合
		for(Map.Entry<Character, Integer> entry : map.entrySet()){
			System.out.println(entry.getKey() + "(" + entry.getValue() + ")");
		}
	}
}


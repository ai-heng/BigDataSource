package com.itheima.tests;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 已知字符串: String str = “aaabcdeeefgdhigklmmmnnn”; 
 * 请统计字符串中每个字符出现的个数, 并将结果打印到控制台上.  格式如下(注:字母可不排序):
	     	提示:
	1.	采用HashMap集合实现, 字符做键, 该字符出现的次数做值.
	2.	将字符串转成字符数组然后遍历获取到每一个字符.
	3.	判断该字符在双列集合中是否存在, 存在次数+1,不存在次数记1.
	4.	最终遍历双列集合, 按照题目要求拼接并打印即可.

 */
public class Test1_04 {
	public static void main(String[] args) {
		String str = "aaabcdeeefgdhigklmmmnnn";
		//键是出现的字符a,b,c
		//值是字符出现的次数
		HashMap<Character,Integer> map = new HashMap<>();
		//遍历字符串获取每一个字符
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(map.containsKey(ch)){//判断一下是否统计过ch这个字符
				int count = map.get(ch);//如果不是第一次出现，表示这个字符以前我们统计过，我把它出现的次数拿出来，然后加1再放回去
				map.put(ch, count+1);
			}else{
				map.put(ch, 1);//如果是第一次出现，我就直接把字符放到map里，并且次数是1
			}
		}
		
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			System.out.print(entry.getKey()+"("+entry.getValue()+")");
		}
	}
	
}

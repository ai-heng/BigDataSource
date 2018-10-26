package com.itheima.level02;

import java.util.ArrayList;

/*
1.定义ArrayList集合，存入多个字符串"abc" "def"  "efg" "def" "def" "qwe" "def" "def" "swd" "wwe" "def" "def"
2.使用普通for循环获取集合中索引为3的元素并打印
3.定义方法public static boolean myContains(ArrayList list,String str)
	(1)参数
		a.ArrayList list: 表示存储多个String数据的集合
		b.String str: 表示一个字符串
	(2)返回值
		true: 表示list集合中包含字符串str
		false: 表示list集合中不包含字符串str
4.利用上面定义的mycontains方法统计集合中包含字符串"def"的数量
5.删除集合中的所有字符串"def"(思路:循环判断集合中是否包含"def"字符串,包含就删除)
6.将集合中每个元素中的小写字母变成大写字母
*/
public class Task02 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("abc");
		list.add("def");
		list.add("def");
		list.add("efg");
		list.add("qwe");
		list.add("swd");
		list.add("def");
		list.add("wwe");
		
		String s = list.get(3);
		System.out.println(s);
		
		int count = getDataCount(list, "def");
		System.out.println("count = " + count);
		
		toUpperCaseForList(list);
		System.out.println(list);
	}
	
	public static void toUpperCaseForList(ArrayList<String> list) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
//			list.set(i, s.toLowerCase());
			for(int j=0; j<s.length(); j++){
				char ch = s.charAt(j);
				if(ch>='a' && ch <= 'z'){
					ch = (char)(ch - 32);
				}
				sb.append(ch);
			}
			list.set(i, sb.toString());
			sb.delete(0, sb.length());
		}
	}

	public static int getDataCount(ArrayList<String> list, String str) {
		int count = 0;
		while(myContains(list, str)){
			list.remove(str);
			count++;
		}
		return count;
	}

	public static boolean myContains(ArrayList<String> list,String str){
		return list.contains(str);
	}
}

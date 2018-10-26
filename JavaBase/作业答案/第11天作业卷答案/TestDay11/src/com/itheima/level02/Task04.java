package com.itheima.level02;

import java.util.ArrayList;

/*
1.定义ArrayList集合，存入多个字符串
   如:"ab1" "123ad"  "bca" "dadfadf"  "dddaaa"  "你好啊"  "我来啦"  "别跑啊"
2.遍历集合,删除长度大于5的字符串,打印删除后的集合对象
	提示:可以将原集合中所有长度大于5的字符串放入到新集合中,遍历新集合,新集合中的元素就是要删除的元素
	
3.基于上一步,删除集合中元素包含0-9数字的字符串(只要字符串中包含0-9中的任意一个数字就需要删除此整个字符串)
	提示:
		(1)定义public static boolean myContains(String str)方法
			功能:
				判断str中是否包含0到9的数字
				包含:返回true
				不包含:返回false
		(2)遍历原集合利用myContains方法将所有包含0-9的字符串放入新集合中
		(3)新集合中的元素就是要删除的元素

注意：对集合进行普通遍历时，如果要删除集合中的元素时，索引要减减
 */
public class Task04 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("ab1");
		list.add("123ad");
		list.add("bca");
		list.add("dadfadf");
		list.add("dddaaa");
		list.add("你好啊");
		list.add("我来啦");
		list.add("ab1");
		list.add("别跑啊");
		
		// 删除集合中长度大于5的字符串
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			if(s.length() > 5){
				list.remove(i);
				i--;
			}
		}
		System.out.println(list);
		
		// 遍历集合
		for(int i=0; i<list.size(); i++){
			String s = list.get(i);
			if(myContains(s)){
				list.remove(s);
				i--;
			}
		}
		System.out.println("删除后：" + list);
	}
	
//	定义public static boolean myContains(String str)方法
//	功能:
//		判断str中是否包含0到9的数字
//		包含:返回true
//		不包含:返回false
	public static boolean myContains(String str){
		char[] chs = str.toCharArray();
		for (int i = 0; i < chs.length; i++) {
			if(chs[i] >= '0' && chs[i] <= '9'){
				return true;
			}
		}
		return false;
	}
}


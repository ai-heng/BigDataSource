package com.itheima;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
 * 需求：ArrayList集合嵌套HashMap集合并遍历。
 * 定义一个ArrayList集合，它包含三个元素，每一个元素都是HashMap类型的。
 * 每一个HashMap集合的键和值都是String类型的，
 * 键：String		丈夫的姓名
 * 值：String		妻子的姓名
 * 给出如下的字符串数据，请用代码实现需求。
 * 第一个HashMap集合的元素：
 * 		孙策		大乔
 * 		周瑜		小乔
 * 第二个HashMap集合的元素：
 * 		郭靖		黄蓉
 * 		杨过		小龙女
 * 第三个HashMap集合的元素：
 * 		令狐冲	任盈盈
 * 		林平之	岳灵珊
 */
public class ArrayListIncludeHashMapTest {
	public static void main(String[] args) {
		//创建集合对象
		ArrayList<HashMap<String,String>> array = new ArrayList<HashMap<String,String>>();
		
		//创建元素1
		HashMap<String,String> hm1 = new HashMap<String,String>();
		hm1.put("孙策","大乔");
		hm1.put("周瑜","小乔");
		//把元素添加到array中
		array.add(hm1);
		
		//创建元素2
		HashMap<String,String> hm2 = new HashMap<String,String>();
		hm2.put("郭靖","黄蓉");
		hm2.put("杨过","小龙女");
		//把元素添加到array中
		array.add(hm2);
		
		//创建元素3
		HashMap<String,String> hm3 = new HashMap<String,String>();
		hm3.put("令狐冲","任盈盈");
		hm3.put("林平之","岳灵珊");
		//把元素添加到array中
		array.add(hm3);
		
		//遍历ArrayList集合
		for(HashMap<String,String> hm : array) {
			Set<String> set = hm.keySet();
			for(String key : set) {
				String value = hm.get(key);
				System.out.println(key+"---"+value);
			}
			System.out.println("-----------------");
		}
		
	}
}

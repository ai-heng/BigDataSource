package com.itheima_02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map集合的遍历
 * 
 * 思路：Map看成是一个夫妻对的集合
 * 		A:把所有的丈夫给集中起来
 * 		B:遍历丈夫的集合，获取到每一个丈夫
 * 		C:根据丈夫去找对应的妻子
 * 
 * 转换：
 * 		A:获取所有键的集合
 * 		B:遍历键的集合，获取到每一个键
 * 		C:根据键去找值
 */
public class MapDemo {
	public static void main(String[] args) {
		//创建集合对象
		Map<String,String> map = new HashMap<String,String>();
		
		//添加元素
		map.put("郭靖","黄蓉");
		map.put("杨过","小龙女");
		map.put("张无忌","赵敏");
		
		//获取所有键的集合
		Set<String> set = map.keySet();
		//遍历键的集合，获取到每一个键
		for(String key : set) {
			//根据键去找值
			String value = map.get(key);
			System.out.println(key+"---"+value);
		}
	}
}

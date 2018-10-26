package com.itheima_02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map集合遍历的方式2
 * 
 * 思路：
 * 		A:获取所有结婚证的集合
 * 		B:遍历结婚证的集合，得到每一个结婚证
 * 		C:根据结婚证获取丈夫和妻子
 * 
 * 转换：
 * 		A:获取所有键值对对象的集合
 * 		B:遍历键值对对象的集合，得到每一个键值对对象
 * 		C:根据键值对对象获取键和值
 */
public class MapDemo2 {
	public static void main(String[] args) {
		//创建集合对象
		Map<String,String> map = new HashMap<String,String>();
		
		//添加元素
		map.put("郭靖","黄蓉");
		map.put("杨过","小龙女");
		map.put("张无忌","赵敏");
		
		//获取所有键值对对象的集合
//		Set<Map.Entry<K,V>> entrySet()
//		获取键值对对象的集合
		Set<Map.Entry<String,String>> set = map.entrySet();
		//遍历键值对对象的集合，得到每一个键值对对象
		for(Map.Entry<String,String> me : set) {
			//根据键值对对象获取键和值
			String key = me.getKey();
			String value = me.getValue();
			System.out.println(key+"---"+value);
		}
	}
}

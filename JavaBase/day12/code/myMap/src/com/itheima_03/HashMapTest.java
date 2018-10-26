package com.itheima_03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 练习1：两种方式遍历
 * HashMap<String,Student>
 * 键：String 学号
 * 值：Student 学生对象
 */
public class HashMapTest {
	public static void main(String[] args) {
		// 创建集合对象
		HashMap<String, Student> hm = new HashMap<String, Student>();

		// 创建元素对象
		Student s1 = new Student("林青霞", 30);
		Student s2 = new Student("张曼玉", 35);
		Student s3 = new Student("王祖贤", 33);

		// 添加元素到集合中
		hm.put("it001", s1);
		hm.put("it002", s2);
		hm.put("it003", s3);

		// 遍历
		// 根据键找值
		Set<String> set = hm.keySet();
		for (String key : set) {
			Student value = hm.get(key);
			System.out.println(key + "---" + value.getName() + "---" + value.getAge());
		}
		System.out.println("---------------------");

		// 根据键值对对象找键和值
		Set<Map.Entry<String, Student>> set2 = hm.entrySet();
		for (Map.Entry<String, Student> me : set2) {
			String key = me.getKey();
			Student value = me.getValue();
			System.out.println(key + "---" + value.getName() + "---" + value.getAge());
		}
	}
}

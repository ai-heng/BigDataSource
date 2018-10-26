package com.itheima.level01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
 * 需求：HashMap集合嵌套ArrayList集合并遍历。
 * 定义一个HashMap集合，它包含三个元素，每一个元素的键是String类型，值是ArrayList类型。
 * 键：String			人物来自哪部电视剧
 * 值：ArrayList		人物的名称
 * 每一个ArrayList集合的数据是String类型的。
 * 给出如下的字符串数据，请用代码实现需求。
 * 第一个ArrayList集合的元素：(三国演义)
 * 		诸葛亮
 * 		赵云
 * 第二个ArrayList集合的元素：(西游记)
 * 		唐僧
 * 		孙悟空
 * 第三个ArrayList集合的元素：(水浒传)
 * 		武松
 * 		鲁智深
 */
public class Task05 {
	public static void main(String[] args) {
		// 创建集合对象
		HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();

		// 创建元素1
		ArrayList<String> sgyy = new ArrayList<String>();
		sgyy.add("诸葛亮");
		sgyy.add("赵云");
		// 把元素添加到hm中
		hm.put("三国演义", sgyy);

		// 创建元素2
		ArrayList<String> xyj = new ArrayList<String>();
		xyj.add("唐僧");
		xyj.add("孙悟空");
		// 把元素添加到hm中
		hm.put("西游记", xyj);

		// 创建元素3
		ArrayList<String> shz = new ArrayList<String>();
		shz.add("武松");
		shz.add("鲁智深");
		// 把元素添加到hm中
		hm.put("水浒传", shz);

		// 遍历集合
		Set<String> set = hm.keySet();
		for (String key : set) {
			System.out.println(key);
			ArrayList<String> value = hm.get(key);
			for (String s : value) {
				System.out.println("\t" + s);
			}
		}
	}
}

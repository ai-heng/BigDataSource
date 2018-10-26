package com.itheima.tests;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 已知有一个Map集合,里面存储的是学生的姓名和年龄，内容如下:
{张三丰=21, 灭绝师太=38, 柳岩=28, 刘德华=40, 老鬼=36, 王二麻子=38}.
	需求:
		a.将集合中的元素用两种遍历方式打印到控制台上
		b.将年龄大于24的学生姓名，存入到D:\\student.txt中	
提示:
1.	分别采用: 根据键获取值, 根据键值对获取键和值的方式遍历集合.
2.	采用高效字符输出流,将数据(学生姓名)写入到目的地文件中..

 */
public class Test2_04 {
	public static void main(String[] args) throws IOException {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("张三丰", 21);
		map.put("灭绝师太", 38);
		map.put("柳岩", 28);
		map.put("刘德华", 40);
		map.put("老鬼", 36);
		map.put("王二麻子", 38);
		
		FileOutputStream fos = new FileOutputStream("student.txt");
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			Integer value = entry.getValue();
			if(value>24){
				fos.write(entry.getKey().getBytes());
			}
		}
		
		fos.close();
		
	}
}

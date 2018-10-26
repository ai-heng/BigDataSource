package com.itheima.tests;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 已知ArrayList集合中的元素为:{张三,李四,王五,二丫,钱六,孙七}
	需求: 将二丫替换为王小丫, 然后将集合中的内容到"D:\\stuinfo.txt"中.
	提示:
	1.	字符串的比较用equals()
	2.	采用字符高效输出流将数据写入到指定的文件中.

 */
public class Test2_03 {
	public static void main(String[] args) throws IOException {
		ArrayList<String> list  = new ArrayList<>();
		
		list.add("苍老师");
		list.add("武老师");
		list.add("王老师");
		list.add("马云");
		list.add("马化腾");
		list.add("李彦宏");
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).equals("王老师")){
				list.set(i, "王小丫");
			}
			
		}
		System.out.println(list);
		
		FileOutputStream fos = new FileOutputStream("stuinfo.txt");
		
		for (String s : list) {
			fos.write((s+" ").getBytes());
		}
		
		fos.close();
	}
}

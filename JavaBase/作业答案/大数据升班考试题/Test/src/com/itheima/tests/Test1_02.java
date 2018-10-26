package com.itheima.tests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
/*
 * 在项目根目录中的文件number.txt中，有如下数字：
		 	  
	需求:
	1.将文件中的数据读取到List集合中,然后打印集合.
	2.对集合进行去重操作,并将数字按照从大到小排序,将结果写入到项目根目录中的number2.txt中.

 */
public class Test1_02 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("number.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("number2.txt"));
		
		ArrayList<Integer> list = new ArrayList<>();
		//先把数据读到list,由于读到的都是数字而且我们还要对其进行排序，所以泛型用Integer
		String line;
		while((line=br.readLine())!=null){
			list.add(Integer.parseInt(line));
		}
		//利用set的构造方法对list时行去重
		HashSet<Integer> set = new HashSet<>(list);
		
		System.out.println(set);
		//由于我们要对其进行排序，所以再把它转回list
		list = new ArrayList<>(set);
		//倒序排序
		Collections.sort(list,Collections.reverseOrder());
		
		System.out.println(list);
		
		
		br.close();
		bw.close();
	}
}

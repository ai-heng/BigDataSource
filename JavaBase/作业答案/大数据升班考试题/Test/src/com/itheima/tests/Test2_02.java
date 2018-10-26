package com.itheima.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * 需求:循环接收用户键盘输入的多个字符串，直到用户录入“end”时循环结束，并将所有已输入的字符串按字典顺序倒序打印。.
	提示:
	1.	创建ArrayList集合, 用来存数元素.
	2.	采用Collections工具类中的方法对集合进行排序即可.

 */
public class Test2_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<>();
		while(true){//录入多少个字符串，我们不知道 ，所以这里我们用死循环
			System.out.println("请输入一个字符串");
			String s = sc.nextLine();
			if(s.equals("end")){
				break;
			}
			list.add(s);
		}
		
		//倒序排序集合
//		Collections.sort(list,Collections.reverseOrder());
//		Collections.sort(list);//排序
//		Collections.reverse(list);//反转
		Collections.sort(list);
		for (int i = 0,j=list.size()-1; i < j; i++,j--) {
			String i1 = list.get(i);
			String j1 = list.get(j);
			list.set(i, j1);
			list.set(j, i1);
		}
		
		System.out.println(list);
		
		
		
	}
}

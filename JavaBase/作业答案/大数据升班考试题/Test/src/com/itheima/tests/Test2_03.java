package com.itheima.tests;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/*
 * ��֪ArrayList�����е�Ԫ��Ϊ:{����,����,����,��Ѿ,Ǯ��,����}
	����: ����Ѿ�滻Ϊ��СѾ, Ȼ�󽫼����е����ݵ�"D:\\stuinfo.txt"��.
	��ʾ:
	1.	�ַ����ıȽ���equals()
	2.	�����ַ���Ч�����������д�뵽ָ�����ļ���.

 */
public class Test2_03 {
	public static void main(String[] args) throws IOException {
		ArrayList<String> list  = new ArrayList<>();
		
		list.add("����ʦ");
		list.add("����ʦ");
		list.add("����ʦ");
		list.add("����");
		list.add("����");
		list.add("�����");
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).equals("����ʦ")){
				list.set(i, "��СѾ");
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

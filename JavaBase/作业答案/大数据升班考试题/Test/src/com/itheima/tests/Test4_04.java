package com.itheima.tests;

import java.util.Arrays;

/*
 * ����: ��֪�ַ���String str = ��6ab11c333def521gh9i5jk61nm3n2��;,���ַ����г��ֵĸ�����֮��.
	��ʽ����;
		 	
	
	��ʾ:
	1.	�и��ַ���,��ȡ�����е��ַ�����ʽ������.
	2.	����ת�����������͵�����,Ȼ�����������

 */
public class Test4_04 {
	public static void main(String[] args) {
		String str = "6ab11c333def521gh9i5jk61nm3n2";
		
		//��һ�������Ȱ�str�����ĸ��ɿո�
		
		String news = "";
		
		for (int i = 0; i < str.length(); i++) {
			//�����ַ�����ȡ��һ��Ԫ��
			char ch = str.charAt(i);
			//�������һ����ĸnews������ һ���ո�������Ǿ�ֱ�ӷŵ�news��
			if(ch>='a'&&ch<='z'){
				news+=" ";
			}else{
				news+=ch;
			}
		}
		System.out.println(news);
		//�ÿո�ȥ�и��ַ������õ���������
		String[] split = news.split(" ");
		//["6", "", "11", "333", "", "", "521", "", "9", "5", "", "61", "", "3", "2"]
		System.out.println(Arrays.toString(split));
		
		int sum = 0;
		//�ж�һ��Ԫ���Ƿ�Ϊ���ַ�����������ǾͰ�����������ۼӵ�sum��
		for (String s : split) {
			if(!s.equals("")){
				sum+=Integer.parseInt(s);
			}
		}
		System.out.println(sum);
	}
}

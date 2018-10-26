package com.itheima.level02;

import java.util.ArrayList;

/*
1.����ArrayList���ϣ��������ַ���"abc" "def"  "efg" "def" "def" "qwe" "def" "def" "swd" "wwe" "def" "def"
2.ʹ����ͨforѭ����ȡ����������Ϊ3��Ԫ�ز���ӡ
3.���巽��public static boolean myContains(ArrayList list,String str)
	(1)����
		a.ArrayList list: ��ʾ�洢���String���ݵļ���
		b.String str: ��ʾһ���ַ���
	(2)����ֵ
		true: ��ʾlist�����а����ַ���str
		false: ��ʾlist�����в������ַ���str
4.�������涨���mycontains����ͳ�Ƽ����а����ַ���"def"������
5.ɾ�������е������ַ���"def"(˼·:ѭ���жϼ������Ƿ����"def"�ַ���,������ɾ��)
6.��������ÿ��Ԫ���е�Сд��ĸ��ɴ�д��ĸ
*/
public class Task02 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("abc");
		list.add("def");
		list.add("def");
		list.add("efg");
		list.add("qwe");
		list.add("swd");
		list.add("def");
		list.add("wwe");
		
		String s = list.get(3);
		System.out.println(s);
		
		int count = getDataCount(list, "def");
		System.out.println("count = " + count);
		
		toUpperCaseForList(list);
		System.out.println(list);
	}
	
	public static void toUpperCaseForList(ArrayList<String> list) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
//			list.set(i, s.toLowerCase());
			for(int j=0; j<s.length(); j++){
				char ch = s.charAt(j);
				if(ch>='a' && ch <= 'z'){
					ch = (char)(ch - 32);
				}
				sb.append(ch);
			}
			list.set(i, sb.toString());
			sb.delete(0, sb.length());
		}
	}

	public static int getDataCount(ArrayList<String> list, String str) {
		int count = 0;
		while(myContains(list, str)){
			list.remove(str);
			count++;
		}
		return count;
	}

	public static boolean myContains(ArrayList<String> list,String str){
		return list.contains(str);
	}
}

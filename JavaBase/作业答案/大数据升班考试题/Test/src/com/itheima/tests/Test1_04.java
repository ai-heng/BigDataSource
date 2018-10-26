package com.itheima.tests;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 * ��֪�ַ���: String str = ��aaabcdeeefgdhigklmmmnnn��; 
 * ��ͳ���ַ�����ÿ���ַ����ֵĸ���, ���������ӡ������̨��.  ��ʽ����(ע:��ĸ�ɲ�����):
	     	��ʾ:
	1.	����HashMap����ʵ��, �ַ�����, ���ַ����ֵĴ�����ֵ.
	2.	���ַ���ת���ַ�����Ȼ�������ȡ��ÿһ���ַ�.
	3.	�жϸ��ַ���˫�м������Ƿ����, ���ڴ���+1,�����ڴ�����1.
	4.	���ձ���˫�м���, ������ĿҪ��ƴ�Ӳ���ӡ����.

 */
public class Test1_04 {
	public static void main(String[] args) {
		String str = "aaabcdeeefgdhigklmmmnnn";
		//���ǳ��ֵ��ַ�a,b,c
		//ֵ���ַ����ֵĴ���
		HashMap<Character,Integer> map = new HashMap<>();
		//�����ַ�����ȡÿһ���ַ�
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(map.containsKey(ch)){//�ж�һ���Ƿ�ͳ�ƹ�ch����ַ�
				int count = map.get(ch);//������ǵ�һ�γ��֣���ʾ����ַ���ǰ����ͳ�ƹ����Ұ������ֵĴ����ó�����Ȼ���1�ٷŻ�ȥ
				map.put(ch, count+1);
			}else{
				map.put(ch, 1);//����ǵ�һ�γ��֣��Ҿ�ֱ�Ӱ��ַ��ŵ�map����Ҵ�����1
			}
		}
		
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			System.out.print(entry.getKey()+"("+entry.getValue()+")");
		}
	}
	
}

package com.itheima.level02;

import java.util.Random;

/*
1.����String getStr(char[] chs)����
	������������ȡ����Ϊ5������ַ������ַ����������4����дӢ����ĸ��1��0-9֮�䣨����0��9�����������
2.����main��������������ɣ�
	(1)���峤��Ϊ26��Ԫ��ֵΪ26����дӢ����ĸ������chs
	(2)��������chs����getStr(char[] chs)��������ȡ����ֵ,���ڿ���̨��ӡ����ֵ	

˼·��
1�������ַ�����
2��Ϊ���������Ԫ��
3�� ����getStr(char[] chs)���������ݴ�����ַ����������ȡ4����д��Ӣ����ĸ��Ȼ�����������������0-9֮���һ���������
4�� ��4��Ӣ����ĸ���������ϳ��µ��ַ��������ء�
 */
public class Task05 {
	public static void main(String[] args) {
//		char[] chs = {'A', 'B', 'C', 'D', 'E'.......};
		char[] chs = new char[26];
		int index = 0;
		for(int i='A'; i<='Z'; i++){
//			chs[index] = (char)i;
//			index++;
			chs[index++] = (char)i;
		}
		
		String str = getStr(chs);
		
		System.out.println(str);
	}

	public static String getStr(char[] chs) {
		// ������ַ���
		String s = "";
		Random r = new Random();
		// ѭ���ĴΣ�Ϊ�˻�ȡ�������ĸ�����ַ�
		for(int i=0; i<4; i++){
//			r.nextInt(26); ������������������ֻҪ��������ˣ���ô�Ϳ����õ�������ַ�
			s = s + chs[r.nextInt(26)];
		}
		// ��ȡ0-9֮��������
		s += r.nextInt(10);
		return s;
	}
}
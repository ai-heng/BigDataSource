package com.itheima.level02;

import java.util.ArrayList;

/*
1.����ArrayList���ϣ��������ַ���
   ��:"ab1" "123ad"  "bca" "dadfadf"  "dddaaa"  "��ð�"  "������"  "���ܰ�"
2.��������,ɾ�����ȴ���5���ַ���,��ӡɾ����ļ��϶���
	��ʾ:���Խ�ԭ���������г��ȴ���5���ַ������뵽�¼�����,�����¼���,�¼����е�Ԫ�ؾ���Ҫɾ����Ԫ��
	
3.������һ��,ɾ��������Ԫ�ذ���0-9���ֵ��ַ���(ֻҪ�ַ����а���0-9�е�����һ�����־���Ҫɾ���������ַ���)
	��ʾ:
		(1)����public static boolean myContains(String str)����
			����:
				�ж�str���Ƿ����0��9������
				����:����true
				������:����false
		(2)����ԭ��������myContains���������а���0-9���ַ��������¼�����
		(3)�¼����е�Ԫ�ؾ���Ҫɾ����Ԫ��

ע�⣺�Լ��Ͻ�����ͨ����ʱ�����Ҫɾ�������е�Ԫ��ʱ������Ҫ����
 */
public class Task04 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("ab1");
		list.add("123ad");
		list.add("bca");
		list.add("dadfadf");
		list.add("dddaaa");
		list.add("��ð�");
		list.add("������");
		list.add("ab1");
		list.add("���ܰ�");
		
		// ɾ�������г��ȴ���5���ַ���
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			if(s.length() > 5){
				list.remove(i);
				i--;
			}
		}
		System.out.println(list);
		
		// ��������
		for(int i=0; i<list.size(); i++){
			String s = list.get(i);
			if(myContains(s)){
				list.remove(s);
				i--;
			}
		}
		System.out.println("ɾ����" + list);
	}
	
//	����public static boolean myContains(String str)����
//	����:
//		�ж�str���Ƿ����0��9������
//		����:����true
//		������:����false
	public static boolean myContains(String str){
		char[] chs = str.toCharArray();
		for (int i = 0; i < chs.length; i++) {
			if(chs[i] >= '0' && chs[i] <= '9'){
				return true;
			}
		}
		return false;
	}
}


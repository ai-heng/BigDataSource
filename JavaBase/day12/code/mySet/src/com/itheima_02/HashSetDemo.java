package com.itheima_02;

import java.util.HashSet;

/*
 * HashSet��֤Ԫ��Ψһ�Ե�ԭ��?
 * 
 * ͨ���鿴add������Դ�룬����֪������ӹ��ܵ�ִ�й����У��ǽ��������ݵ��жϵġ�
 * ����жϵ������ǣ�
 * 		���ȱȽ϶���Ĺ�ϣֵ�Ƿ���ͬ�������ϣֵ�Ǹ��ݶ����hashCode()��������ġ�
 * 			�����ϣֵ��ͬ����ֱ����ӵ�������
 * 			�����ϣֵ��ͬ������ִ��equals()���бȽϣ�
 * 				���ص���true��˵��Ԫ���ظ�������ӡ�
 * 				���ص���false��˵��Ԫ�ز��ظ�������ӡ�
 * 
 * �������ʹ��HashSet���ϴ洢������Ҫ�뱣֤Ԫ�ص�Ψһ�ԣ��ͱ�����дhashCode()��equals()������
 */
public class HashSetDemo {
	public static void main(String[] args) {
		//�������϶���
		HashSet<String> hs = new HashSet<String>();
		
		//���Ԫ��
		hs.add("hello");
		hs.add("world");
		hs.add("java");
		hs.add("world");
		
		//��������
		for(String s : hs) {
			System.out.println(s);
		}
	}
}

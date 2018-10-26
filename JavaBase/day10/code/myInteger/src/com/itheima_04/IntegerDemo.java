package com.itheima_04;

import java.util.Arrays;

/*
 * ��������һ���ַ���:��91 27 46 38 50��
 * ��д����ʵ�������������ǣ���27 38 46 50 91��
 * ��ʾ��������Ҫ�ο�String���еķ���
 * public String[] split(String regex)
 * 
 * ������
 * 		A:����һ���ַ�������
 * 		B:���ַ����е��������ݴ洢��һ��int���͵�������
 * 		C:��int�����������
 * 		D:�������������е�Ԫ�ؽ���ƴ�ӵõ�һ���ַ���
 * 		E:����ַ���
 */
public class IntegerDemo {
	public static void main(String[] args) {
		//����һ���ַ�������
		String s = "91 27 46 38 50";
		
		//���ַ����е��������ݴ洢��һ��int���͵�������
		//public String[] split(String regex)
		String[] strArray = s.split(" ");
		/*
		for(int x=0; x<strArray.length; x++) {
			System.out.println(strArray[x]);
		}
		*/
		
		//����һ��int���͵�����
		int[] arr = new int[strArray.length];
		for(int x=0; x<arr.length; x++) {
			arr[x] = Integer.parseInt(strArray[x]);
		}
		
		//��int�����������
		Arrays.sort(arr);
		
		//�������������е�Ԫ�ؽ���ƴ�ӵõ�һ���ַ���
		StringBuilder sb = new StringBuilder();
		for(int x=0; x<arr.length; x++) {
			if(x==arr.length-1) {
				sb.append(arr[x]);
			}else {
				sb.append(arr[x]).append(" ");
			}
		}
		String result = sb.toString();
		
		//����ַ���
		System.out.println("result:"+result);
	}
}

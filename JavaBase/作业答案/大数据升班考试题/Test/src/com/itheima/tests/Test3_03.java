package com.itheima.tests;

import java.util.Arrays;

/*
 * ��֪�ַ�������String[] arr={��am��,��ieh��,��ia��,��ow�� };,
 * ���������е�ÿһ���ַ������з�ת,Ȼ������ƴ�ӳ��µ��ַ���,���������ӡ������̨��.
 */
public class Test3_03 {
	public static void main(String[] args) {
		String[] arr={"am","ieh","ia","ow" };
		
		String[] arrnew = new String[arr.length];
		
		for (int j = 0; j < arr.length; j++) {
			//ȡ����һ��Ԫ�طŵ�StringBuiler��
			StringBuilder sb = new StringBuilder(arr[j]);
			//����sb�ķ�ת���������ַ������з���
			sb.reverse();
			//�ѽ���ٷŵ�arrnew��
			arrnew[j] = sb.toString();
			
		}
			
		System.out.println(Arrays.toString(arrnew));
		
	}
}

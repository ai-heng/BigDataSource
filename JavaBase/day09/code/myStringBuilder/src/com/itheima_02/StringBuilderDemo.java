package com.itheima_02;
/*
 * ��ӹ���
 * 		public StringBuilder append(��������):������ݣ������ض�����
 * ��ת����
 * 		public StringBuilder reverse()
 */
public class StringBuilderDemo {
	public static void main(String[] args) {
		//��������
		StringBuilder sb = new StringBuilder();
		
		//public StringBuilder append(��������)
		/*
		StringBuilder sb2 = sb.append("hello");
		
		System.out.println("sb:"+sb);
		System.out.println("sb2:"+sb2);
		System.out.println(sb == sb2);//true
		*/
		
		/*
		sb.append("hello");
		sb.append("world");
		sb.append(true);
		sb.append(100);
		*/
		
		//��ʽ���
		sb.append("hello").append("world").append(true).append(100);
		
		System.out.println("sb:"+sb);
		
		//public StringBuilder reverse()
		sb.reverse();
		System.out.println("sb:"+sb);
	}
}

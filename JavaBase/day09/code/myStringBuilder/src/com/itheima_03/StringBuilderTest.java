package com.itheima_03;
/*
 * StringBuilder��String���໥ת��
 * 
 * StringBuilder -- String
 * 		public String toString():ͨ��toString()�Ϳ���ʵ�ְ�StringBuilderת��ΪString
 * 
 * String -- StringBuilder
 * 		public StringBuilder(String s):ͨ�����췽���Ϳ���ʵ�ְ�Stringת��ΪStringBuilder
 */
public class StringBuilderTest {
	public static void main(String[] args) {
		/*
		//StringBuilder -- String
		StringBuilder sb = new StringBuilder();
		sb.append("hello");
		
		//�����
		//String s = sb;
		//public String toString()
		String s = sb.toString();
		System.out.println(s);
		*/
		
		//String -- StringBuilder
		String s = "hello";
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb);
	}
}

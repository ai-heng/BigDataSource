package com.itheima_01;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
 * ����
 * �ѿ��ö��ı�ɿ�������
 * public byte[] getBytes(String charsetName) throws UnsupportedEncodingException
 * ʹ��ָ�����ַ������� String ����Ϊ byte ���У���������洢��һ���µ� byte �����С� 
 * 
 * ����
 * �ѿ������ı�ɿ��ö���
 * public String(byte[] bytes, String charsetName)
 * ͨ��ʹ��ָ���� charset����ָ���� byte ���飬����һ���µ� String��
 */
public class StringDemo {
	public static void main(String[] args) throws UnsupportedEncodingException {
		//����һ���ַ���
		String s = "���";
		
		//����
		//byte[] bys = s.getBytes();//ʹ��ƽ̨��Ĭ���ַ������� String ����Ϊ byte ����
		//Ĭ�ϱ�����GBK
		//[-60, -29, -70, -61]
		//byte[] bys = s.getBytes("GBK"); //ָ������GBK
		//[-60, -29, -70, -61]
		byte[] bys = s.getBytes("UTF-8"); //ָ������UTF-8
		//[-28, -67, -96, -27, -91, -67]
		System.out.println(Arrays.toString(bys));
		
		//����
		//String ss = new String(bys); //ͨ��ʹ��ƽ̨��Ĭ���ַ�������ָ���� byte ����
//		String ss = new String(bys,"GBK");//ָ������GBK
		String ss = new String(bys,"UTF-8");//ָ������UTF-8
		System.out.println(ss);
	}
}

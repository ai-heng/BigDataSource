package com.itheima_01;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/*
 * �ֽ��������ݿ��ܳ������⣺
 * 		�ֽ���һ�ζ�ȡһ���ֽڵķ�ʽ��ȡ���к��ֵ��ļ���������ģ���Ϊ���ȡ��һ���ֽں��תΪ�ַ��ڿ���̨����ˣ�
 * 		����������2���ֽ���ɵģ��������������⡣
 * 
 * 		�ļ����Ƶ�ʱ���ֽ�����ȡһ���ֽڣ�д��һ���ֽڣ����û�г������⣬����Ϊ���յײ������ֽ���ƴ�ӣ�
 * 		�õ����֡�
 * 
 * 		���ִ洢�Ĺ���
 * 			��ߵ��ֽ����ݿ϶��Ǹ������ұߵ��ֽ����ݿ����Ǹ�����Ҳ�������������󲿷�������Ǹ�����		
 */
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		//�����ֽ���һ�ζ�ȡһ���ֽ�
//		FileInputStream fis = new FileInputStream("a.txt");
//		
//		int by;
//		while((by=fis.read())!=-1) {
//			System.out.print((char)by);
//		}
//		
//		fis.close();
		
		//String s = "hello";
		//[104, 101, 108, 108, 111]
		String s = "���";
		//[-60, -29, -70, -61]
		byte[] bys = s.getBytes();
		System.out.println(Arrays.toString(bys));
	}
}

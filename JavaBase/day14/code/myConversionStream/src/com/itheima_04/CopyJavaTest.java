package com.itheima_04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * �ѵ�ǰ��ĿĿ¼�µ�StringDemo.java���ݸ��Ƶ���ǰ��ĿĿ¼�µ�Copy.java��
 * 
 * ����Դ��
 * 		StringDemo.java---������---�ַ���---InputStreamReader
 * Ŀ�ĵأ�
 * 		Copy.java---д����---�ַ���---OutputStreamWriter
 */
public class CopyJavaTest {
	public static void main(String[] args) throws IOException {
		//��װ����Դ
		InputStreamReader isr = new InputStreamReader(new FileInputStream("StringDemo.java"));
		//��װĿ�ĵ�
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("Copy.java"));
	
		//��д����
		//��ʽ1��һ�ζ�дһ���ַ�
//		int ch;
//		while((ch=isr.read())!=-1) {
//			osw.write(ch);
//		}
		
		//��ʽ2��һ�ζ�дһ���ַ�����
		char[] chs = new char[1024];
		int len;
		while((len=isr.read(chs))!=-1) {
			osw.write(chs, 0, len);
		}
		
		//�ͷ���Դ
		osw.close();
		isr.close();
	}
}

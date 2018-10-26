package com.itheima_04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * �ѵ�ǰ��ĿĿ¼�µ�StringDemo.java���ݸ��Ƶ���ǰ��ĿĿ¼�µ�Copy.java��(�Ľ���)
 * 
 * ת���������ֱȽϳ��������ǳ����Ĳ������ǰ��ձ���Ĭ�ϱ���ʵ�ֵģ����ԣ�Ϊ�˼����ǵ���д��ת�����ṩ�˶�Ӧ�����ࡣ
 * FileWriter:����д���ַ��ļ��ı����
 * 		OutputStreamWriter
 * FileReader:������ȡ�ַ��ļ��ı����
 * 		InputStreamReader
 * 
 * OutputStreamWriter = FileOutputStream + �����(GBK)
 * FileWriter = FileOutputStream + �����(GBK)
 * ���췽����
 * FileWriter(String fileName) 
 * 
 * InputStreamReader = FileInputStream + �����(GBK)
 * FileReader = FileInputStream + �����(GBK)
 * ���췽����
 * FileReader(String fileName) 
 * 
 * ����Դ��
 * 		StringDemo.java---������---�ַ���---InputStreamReader---FileReader
 * Ŀ�ĵأ�
 * 		Copy.java---д����---�ַ���---OutputStreamWriter---FileWriter
 */
public class CopyJavaTest2 {
	public static void main(String[] args) throws IOException {
		//��װ����Դ
		FileReader fr = new FileReader("StringDemo.java");
		//��װĿ�ĵ�
		FileWriter fw = new FileWriter("Copy.java");
		
		//��д����
		//һ�ζ�дһ���ַ�
//		int ch;
//		while((ch=fr.read())!=-1) {
//			fw.write(ch);
//		}
		
		//һ�ζ�дһ���ַ�����
		char[] chs = new char[1024];
		int len;
		while((len=fr.read(chs))!=-1) {
			fw.write(chs, 0, len);
		}
		
		//�ͷ���Դ
		fw.close();
		fr.close();
	}
}

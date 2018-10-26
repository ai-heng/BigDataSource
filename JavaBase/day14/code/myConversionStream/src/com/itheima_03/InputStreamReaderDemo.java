package com.itheima_03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * InputStreamReader�����ݷ���
 * public int read():һ�ζ�ȡһ���ַ�
 * public int read(char[] cbuf):һ�ζ�ȡһ���ַ�����
 */
public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		//�����ַ�����������
//		InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"));
		InputStreamReader isr = new InputStreamReader(new FileInputStream("OutputStreamWriterDemo.java"));
		
		//public int read():һ�ζ�ȡһ���ַ�
//		int ch;
//		while((ch=isr.read())!=-1) {
//			System.out.print((char)ch);
//		}
		
		//public int read(char[] cbuf):һ�ζ�ȡһ���ַ�����
		char[] chs = new char[1024];
		int len;
		while((len=isr.read(chs))!=-1) {
			System.out.print(new String(chs,0,len));
		}
		
		//�ͷ���Դ
		isr.close();
	}
}

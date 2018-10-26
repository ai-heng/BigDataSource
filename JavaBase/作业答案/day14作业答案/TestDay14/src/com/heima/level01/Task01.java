package com.heima.level01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class Task01 {
	/**
	 * һ�� ����˵������UTF-8����ĸ�ʽд�� ����á����ļ���, ����������ȷ�Ķ�ȡ������ӡ�ڿ���̨
	 * 
	 * 1�� ����OutputStreamWriter�����ļ�, ���ڹ��췽����ָ������� 
	 * 2�� ����writer����д���ַ��� 
	 * 3�� ����InputStreamReader�����ļ�, ���ڹ��췽����ָ�������ж�ȡ 
	 * 4. ����read������ȡ����, ��ӡ�ڿ���̨
	 * 
	 */
	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		// 1. ����OutputStreamWriter�����ļ�, ���ڹ��췽����ָ������� 
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("level01_Task01.txt"), "UTF-8");
		// 2. ����writer����д���ַ��� 
		osw.write("���");
		osw.close();
		
		// 3. ����InputStreamReader�����ļ�, ���ڹ��췽����ָ�������ж�ȡ 
		InputStreamReader isr = new InputStreamReader(new FileInputStream("level01_Task01.txt"),"UTF-8");
		int b;
		while((b = isr.read()) != -1){
			//4. ����read������ȡ����, ��ӡ�ڿ���̨
			System.out.print((char)b);
		}
		
		isr.close();
		
	}
}

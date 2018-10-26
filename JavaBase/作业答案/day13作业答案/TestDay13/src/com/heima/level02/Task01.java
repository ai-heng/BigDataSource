package com.heima.level02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

public class Task01 {
	/**
		����: ��ȡ��ǰ��Ŀ�µ�info1.txt
				�ļ��������� : aaaaaaaaaaabbbbbbbbbbbbccdefg
		  	Ҫ������ȥ�غ�д��
	 			����Ч�� : fgdebca
	 			
	 	1.	����HashSet���϶������ڴ洢��ȡ����ÿһ���ַ�(����ȥ��)
		2.	�����ֽ�����������
		3.	����ȡ�����ַ��洢��������
		4.	�����������������Ŀ���ļ�
		5.	����Set���ϻ�ȡ��ÿһ������, ������write����д��
		6.	�ر����ͷ���Դ

	 */
	public static void main(String[] args) throws IOException {
		//1.����HashSet���϶������ڴ洢��ȡ����ÿһ���ַ�(����ȥ��)
		HashSet<Character> hs = new HashSet<>();
		//2.�����ֽ�����������
		FileInputStream fis = new FileInputStream("info1.txt");
		//3.����ȡ�����ַ��洢��������
		int len;
		while ((len = fis.read()) != -1) {
			hs.add((char) len);
		}
		//4.�����������������Ŀ���ļ�
		FileOutputStream fos = new FileOutputStream("info1.txt");
		
		//5.����Set���ϻ�ȡ��ÿһ������, ������write����д��
		Iterator<Character> it = hs.iterator();
		while (it.hasNext()) {
			char c = it.next();
			fos.write(c);
		}
		//6.�ر����ͷ���Դ
		fis.close();
		fos.close();
	}
}

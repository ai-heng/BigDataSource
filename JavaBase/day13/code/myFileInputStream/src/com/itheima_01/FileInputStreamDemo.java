package com.itheima_01;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * �ֽ��������ݣ�InputStream
 * 
 * FileInputStream ���ļ�ϵͳ�е�ĳ���ļ��л�������ֽ�
 * 
 * ���췽����
 * 		FileInputStream(String name) 
 * 
 * �ֽ��������ݵĲ��裺
 * 		A:�����ֽ�����������
 * 		B:���ö����ݵķ���
 * 		C:�ͷ���Դ
 */
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		//�����ֽ�����������
		FileInputStream fis = new FileInputStream("a.txt");
		
		/*
		//���ö����ݵķ���
		//public int read():��ȡһ���ֽڵ�����,����ѵ����ļ�ĩβ���򷵻� -1�� 
		int by = fis.read();
		System.out.println(by);
		System.out.println((char)by);
		
		//������ȡһ��
		by = fis.read();
		System.out.println(by);
		System.out.println((char)by);
		
		//���ֶ����ݵĴ�����ظ��Ⱥܸߣ�����ѭ���Ľ�
		//�������ǲ�֪��ѭ���Ľ�������
		//������ȡ����
		by = fis.read();
		System.out.println(by);
		by = fis.read();
		System.out.println(by);
		*/
		
//		int by = fis.read();
//		while(by != -1) {
//			System.out.print((char)by);
//			by = fis.read();
//		}
		
		//�Ľ��汾
		int by;
		//fis.read()
		//by=fis.read()
		//by != -1
		while((by=fis.read())!=-1) {
			System.out.print((char)by);
		}
		
		//�ͷ���Դ
		fis.close();
	}
}

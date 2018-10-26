package com.itheima;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �ֽ�����
 * 		InputStream		�ֽ�������
 * 		OutputStream	�ֽ������
 * �ַ�����
 * 		Reader	�ַ�������
 * 		Writer	�ַ������
 * 
 * �ֽ���д����
 * OutputStream:�˳������Ǳ�ʾ����ֽ�����������ĳ���
 * FileOutputStream:�ļ�����������ڽ�����д�� File
 * 
 * ���췽����
 * 		FileOutputStream(String name):����һ�������ָ�����Ƶ��ļ���д�����ݵ�����ļ�����
 * 
 * �ֽ���д���ݵĲ��裺
 * 		A:�����ֽ����������
 * 		B:����д���ݵķ���
 * 		C:�ͷ���Դ
 */
public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		//�����ֽ����������
		FileOutputStream fos = new FileOutputStream("a.txt");
		/*
		 * �����ֽ���������������������������飺
		 * A:����ϵͳ���ܴ������ļ�
		 * B:�����ֽ����������
		 * C:��fos�������ָ��a.txt����ļ�
		 */
		
		//write(int b) 
		fos.write(65);
		fos.write(66);
		
		//������ǻ�Ҫ��һ������
		//close() �رմ��ļ���������ͷ�������йص�����ϵͳ��Դ��
		fos.close();
	}
}

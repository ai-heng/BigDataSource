package com.itheima_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ��d:\\mn.jpg���ݸ��Ƶ���ǰ��ĿĿ¼�µ�mn.jpg��
 * 
 * ����Դ��
 * 		d:\\mn.jpg---������---FileInputStream
 * Ŀ�ĵأ�
 * 		mn.jpg---д����---FileOutputStream
 */
public class CopyJpgTest {
	public static void main(String[] args) throws IOException {
		//��װ����Դ
		FileInputStream fis = new FileInputStream("d:\\mn.jpg");
		//��װĿ�ĵ�
		FileOutputStream fos = new FileOutputStream("mn.jpg");
		
		//��д����
		//��ʽ1��һ�ζ�ȡһ���ֽڣ�һ��дһ���ֽ�(�Լ���ϰ)
		//��ʽ2��һ�ζ�ȡһ���ֽ����飬һ��дһ���ֽ������һ����
		byte[] bys = new byte[1024];
		int len;
		while((len=fis.read(bys))!=-1) {
			fos.write(bys,0,len);
		}
		
		//�ͷ���Դ
		fos.close();
		fis.close();
	}
}

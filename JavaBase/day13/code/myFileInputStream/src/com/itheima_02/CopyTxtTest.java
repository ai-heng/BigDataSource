package com.itheima_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ��d:\\���ﴰ��.txt���ݸ��Ƶ���ĿĿ¼�µ�����ϼ.txt��
 * 
 * �ļ����ƣ���ʵ���Ǵ�һ���ļ��ж����ݣ�Ȼ�������д����һ���ļ��С�
 * 
 * ����Դ��
 * 		d:\\���ﴰ��.txt---������---InputStream---FileInputStream
 * 
 * Ŀ�ĵأ�
 * 		����ϼ.txt---д����---OutputStream---FileOutputStream
 */
public class CopyTxtTest {
	public static void main(String[] args) throws IOException {
		//��װ����Դ
		FileInputStream fis = new FileInputStream("d:\\���ﴰ��.txt");
		//��װĿ�ĵ�
		FileOutputStream fos = new FileOutputStream("����ϼ.txt");
		
		//��д����
		//��ʽ1:һ�ζ�ȡһ���ֽ�
//		int by;
//		while((by=fis.read())!=-1) {
//			fos.write(by);
//		}
		
		//��ʽ2:һ�ζ�ȡһ���ֽ�����
		byte[] bys = new byte[1024];
		int len;
		while((len=fis.read(bys))!=-1) {
			fos.write(bys, 0, len);
		}
		
		//�ͷ���Դ
		fos.close();
		fis.close();
	}
}

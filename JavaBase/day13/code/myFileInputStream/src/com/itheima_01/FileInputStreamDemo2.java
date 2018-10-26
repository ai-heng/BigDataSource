package com.itheima_01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * �ֽ��������ݣ�
 * ��ʽ1��һ�ζ�ȡһ���ֽ�
 * ��ʽ2��һ�ζ�ȡһ���ֽ�����
 * 
 * public int read(byte[] b):
 * 		�Ӵ��������н���� b.length ���ֽڵ����ݶ���һ�� byte ������
 * 		����ֵ�Ƕ��뻺�������ֽ�������Ҳ����ʵ�ʵĶ�ȡ����
 * 		�����Ϊ�Ѿ������ļ�ĩβ��û�и�������ݣ��򷵻� -1��
 */
public class FileInputStreamDemo2 {
	public static void main(String[] args) throws IOException {
		//�����ֽ�����������
		FileInputStream fis = new FileInputStream("b.txt");
		
		/*
		//���ö����ݵķ���
		//����һ������
		byte[] bys = new byte[5];
		
		//��һ�ζ�ȡ
		int len = fis.read(bys);
		System.out.println(len);
		//byte[] -- String
		//String(byte[] bytes) 
		//String(byte[] bytes, int offset, int length) 
		System.out.println(new String(bys));
		
		//�ڶ��ζ�ȡ
		len = fis.read(bys);
		System.out.println(len);
		System.out.println(new String(bys));
		
		//�����ζ�ȡ
		len = fis.read(bys);
		System.out.println(len);
//		System.out.println(new String(bys));
		System.out.println(new String(bys,0,len));
		
		//���Ĵζ�ȡ
		len = fis.read(bys);
		System.out.println(len);
		//����ζ�ȡ
		len = fis.read(bys);
		System.out.println(len);
		*/
		
		/*
		 * hello\r\n
		 * world\r\n
		 * 
		 * hello
		 * \r\nwor
  		 * ld\r\nr
		 */
		
		/*
		byte[] bys = new byte[5];
		int len = fis.read(bys);
		while(len != -1) {
			System.out.print(new String(bys,0,len));
			len = fis.read(bys);
		}
		*/
		
		//���հ����
		byte[] bys = new byte[1024]; //1024����1024��������
		//1G = 1024MB
		//1MB = 1024KB
		//...
		int len;
		while((len=fis.read(bys))!=-1) {
			System.out.print(new String(bys,0,len));
		}
		
		//�ͷ���Դ
		fis.close();
	}
}

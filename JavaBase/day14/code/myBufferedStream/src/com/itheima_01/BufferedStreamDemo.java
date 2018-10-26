package com.itheima_01;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * �ֽڻ���������
 * BufferedOutputStream:�ֽڻ��������
 * BufferedInputStream:�ֽڻ���������
 * 
 * BufferedOutputStream(OutputStream out) 
 * ʹ�����ֹ��췽�������ṩ��һ��Ĭ�ϵĻ�������С������һ������ʹ��Ĭ�ϵĻ������Ϳ����ˡ�
 * 
 * Ϊʲô���췽�����ݵ���һ����OutputStream�������Ǿ�����ļ�����·����?
 * �ֽڻ������������ṩ���������������ĵײ�Ķ�д���ݻ�����Ҫ��������������в�����
 */
public class BufferedStreamDemo {
	public static void main(String[] args) throws IOException {
		// BufferedOutputStream(OutputStream out)
		// FileOutputStream fos = new FileOutputStream("a.txt");
		// BufferedOutputStream bos = new BufferedOutputStream(fos);
		// ���������ȼ����������һ��
		// BufferedOutputStream bos = new BufferedOutputStream(new
		// FileOutputStream("a.txt"));
		// bos.write("hello".getBytes());
		// bos.close();

		// BufferedInputStream(InputStream in)
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.txt"));
		//��ʽ1��һ�ζ�ȡһ���ֽ�
//		int by;
//		while((by=bis.read())!=-1) {
//			System.out.print((char)by);
//		}
		
		//��ʽ2��һ�ζ�ȡһ���ֽ�����
		byte[] bys = new byte[1024];
		int len;
		while((len=bis.read(bys))!=-1) {
			System.out.print(new String(bys,0,len));
		}
		
		bis.close();
	}
}

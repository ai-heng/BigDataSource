package com.itheima;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���췽����
 * FileOutputStream(String name) 
 * FileOutputStream(File file) 
 * 
 * public void write(int b):һ��дһ���ֽ�
 * public void write(byte[] b):һ��дһ���ֽ�����
 * public void write(byte[] b,int off,int len):һ��дһ���ֽ������һ����
 * 
 * �ֽ���д���ݵĲ��裺
 * 		A:�����ֽ����������
 * 		B:����д���ݵķ���
 * 		C:�ͷ���Դ
 */
public class FileOutputStreamDemo2 {
	public static void main(String[] args) throws IOException {
		//�����ֽ����������
		//FileOutputStream(String name) 
		FileOutputStream fos = new FileOutputStream("b.txt");
		//new File(name)
//		FileOutputStream fos = new FileOutputStream(new File("b.txt"));
		
		//FileOutputStream(File file) 
//		File file = new File("b.txt");
//		FileOutputStream fos = new FileOutputStream(file);
//		FileOutputStream fos = new FileOutputStream(new File("b.txt"));
		
		//public void write(int b):һ��дһ���ֽ�
//		fos.write(65);
		
		//public void write(byte[] b):һ��дһ���ֽ�����
//		byte[] bys = {65,66,67,68,69};
//		fos.write(bys);
		//�����������һ���ַ��������ݣ���д��?
		//String -- byte[]
		//String������һ��������public byte[] getBytes()
//		byte[] bys = "ABCDE".getBytes();
//		fos.write(bys);
//		fos.write("ABCDE".getBytes());
		
		//public void write(byte[] b,int off,int len):һ��дһ���ֽ������һ����
		fos.write("ABCDE".getBytes(),0,3);
		
		//�ͷ���Դ
		fos.close();
	}
}

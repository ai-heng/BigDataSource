package com.itheima_02;

import java.io.File;
import java.io.IOException;

/*
 * ��������
 * public boolean createNewFile():�����ļ�
 * 		����ļ������ڣ������ļ�������true
 * 		����ļ����ڣ������ļ�ʧ�ܲ�����false
 * 
 * public boolean mkdir():����Ŀ¼
 * 		���Ŀ¼�����ڣ�����Ŀ¼������true
 * 		���Ŀ¼���ڣ�����Ŀ¼ʧ�ܲ�����false
 * 
 * public boolean mkdirs():�����༶Ŀ¼
 */
public class FileDemo {
	public static void main(String[] args) throws IOException {
		//����1����Ҫ��d��Ŀ¼�´���һ���ļ�a.txt
		File f1 = new File("d:\\a.txt");
		System.out.println("createNewFile:"+f1.createNewFile());
		
		//����2����Ҫ��d��Ŀ¼�´���һ��Ŀ¼bb
		File f2 = new File("d:\\bb");
		System.out.println("mkdir:"+f2.mkdir());
		System.out.println("-----------------");
		
		//����3����Ҫ��d��Ŀ¼�´���һ���༶Ŀ¼cc\\dd
//		File f3 = new File("d:\\cc\\dd");
//		System.out.println("mkdir:"+f3.mkdir());
		//һ��һ����ʵ��
//		File f3 = new File("d:\\cc");
//		File f4 = new File("d:\\cc\\dd");
//		System.out.println("mkdir:"+f3.mkdir());
//		System.out.println("mkdir:"+f4.mkdir());
		//һ������
		File f3 = new File("d:\\cc\\dd");
		System.out.println("mkdirs:"+f3.mkdirs());
		
		//����4����Ҫ��d��Ŀ¼�´���һ���ļ�ee\\f.txt
		File f4 = new File("d:\\ee");
		File f5 = new File("d:\\ee\\f.txt");
		System.out.println("mkdir:"+f4.mkdir());
		System.out.println("createNewFile:"+f5.createNewFile());
	}
}

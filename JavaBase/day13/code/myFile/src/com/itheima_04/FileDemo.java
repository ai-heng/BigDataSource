package com.itheima_04;

import java.io.File;

/*
 * �жϹ���
 * public boolean isDirectory():�ж��Ƿ���Ŀ¼
 * public boolean isFile():�ж��Ƿ����ļ�
 * public boolean exists():�ж��Ƿ����
 * ��ȡ����
 * public String getAbsolutePath():��ȡ����·��
 * public String getPath():��ȡ���·��
 * public String getName():��ȡ����
 */
public class FileDemo {
	public static void main(String[] args) {
		//����File����
		File f = new File("aaa\\bbb.txt");
		
		//�жϹ���
		System.out.println("isDirectory:"+f.isDirectory());
		System.out.println("isFile:"+f.isFile());
		System.out.println("exists:"+f.exists());
		System.out.println("------------------");
		
		//��ȡ����
		System.out.println("getAbsolutePath:"+f.getAbsolutePath());
		System.out.println("getPath:"+f.getPath());
		System.out.println("getName:"+f.getName());
	}
}

package com.itheima_03;

import java.io.File;
import java.io.IOException;

/*
 * ɾ������
 * public boolean delete():ɾ���ļ���Ŀ¼
 * 
 * ·�������⣺
 * ����·���������̷���ʼ��·����d:\\aa\\b.txt
 * ���·���������̷���ʼ������ڵ�ǰ����Ŀ���ԣ�����Ŀ��Ŀ¼�¡������ʾ�����أ�ˢ����Ŀ�Ϳ����ˡ�
 * 
 * ע�⣺
 * 		���һ��Ŀ¼��������(Ŀ¼���ļ�)���Ͳ���ֱ��ɾ����
 * 		Ӧ����ɾ��Ŀ¼�е����ݣ�������ɾ��Ŀ¼��
 */
public class FileDemo {
	public static void main(String[] args) throws IOException {
		// //����1����Ҫ����һ���ļ�a.txt
		// File f1 = new File("a.txt");
		// System.out.println("createNewFile:"+f1.createNewFile());
		//
		// //����2����Ҫ����һ��Ŀ¼bb
		// File f2 = new File("bb");
		// System.out.println("mkdir:"+f2.mkdir());
		// System.out.println("-----------------");
		//
		// //����3����Ҫ����һ���ļ�cc\\d.txt
		// File f3 = new File("cc");
		// File f4 = new File("cc\\d.txt");
		// System.out.println("mkdir:"+f3.mkdir());
		// System.out.println("createNewFile:"+f4.createNewFile());
		// System.out.println("-----------------");

		// public boolean delete():ɾ���ļ���Ŀ¼
		// ����1����Ҫɾ��a.txt����ļ�
		File f1 = new File("a.txt");
		System.out.println("delete:" + f1.delete());
		
		//����2����Ҫɾ��bb���Ŀ¼
		File f2 = new File("bb");
		System.out.println("delete:"+f2.delete());
		System.out.println("--------------------");
		
		//����3����Ҫɾ��cc���Ŀ¼
		File f3 = new File("cc");
		System.out.println("delete:"+f3.delete());
		//˼·����ɾ��d.txt����ļ�����ɾ��cc���Ŀ¼
	}
}

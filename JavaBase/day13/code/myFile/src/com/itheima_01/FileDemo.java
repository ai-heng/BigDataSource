package com.itheima_01;

import java.io.File;

/*
 * File:�ļ���Ŀ¼·�����ĳ����ʾ��ʽ
 * Ҳ����˵�ļ���Ŀ¼�ǿ���ͨ��File��װ�ɶ����
 * Ŀ¼����ʵ�����ļ���
 * 
 * File���췽����
 * 		File(String pathname):ͨ��������·�����ַ���ת��Ϊ����·����������һ���� File ʵ����
 * 		File(String parent, String child):���� parent ·�����ַ����� child ·�����ַ�������һ���� File ʵ����
 * 		File(File parent, String child):���� parent ����·������ child ·�����ַ�������һ���� File ʵ����
 */
public class FileDemo {
	public static void main(String[] args) {
		//File(String pathname)
		File f1 = new File("d:\\aa\\b.txt");
		
		//File(String parent, String child)
		File f2 = new File("d:\\aa","b.txt");
		
		//File(File parent, String child)
		File f3 = new File("d:\\aa");
		File f4 = new File(f3,"b.txt");
		
		//�����f1,f2,f4��ʵ������ͬ�������飬���ǰ�d:\\aa\\b.txtת��Ϊ��һ��File����
	}
}

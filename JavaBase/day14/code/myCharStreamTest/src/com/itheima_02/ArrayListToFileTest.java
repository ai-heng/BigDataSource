package com.itheima_02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * ��ArrayList�����е��ַ������ݴ洢���ı��ļ�
 * ÿһ���ַ���Ԫ����Ϊ�ļ��е�һ������
 * 
 * ������
 * 		A:�������϶���
 * 		B:������������ַ���Ԫ��
 * 		C:�����ַ��������������
 * 		D:�������ϣ��õ�ÿһ���ַ���Ԫ�أ����ַ���Ԫ����Ϊ����д�뵽�ı��ļ�
 * 		E:�ͷ���Դ
 */
public class ArrayListToFileTest {
	public static void main(String[] args) throws IOException {
		//�������϶���
		ArrayList<String> array = new ArrayList<String>();
		
		//������������ַ���Ԫ��
		array.add("hello");
		array.add("world");
		array.add("java");
		
		//�����ַ��������������
		BufferedWriter bw = new BufferedWriter(new FileWriter("array.txt"));
		
		//�������ϣ��õ�ÿһ���ַ���Ԫ�أ����ַ���Ԫ����Ϊ����д�뵽�ı��ļ�
		for(String s : array) {
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
		
		//�ͷ���Դ
		bw.close();
	}
}

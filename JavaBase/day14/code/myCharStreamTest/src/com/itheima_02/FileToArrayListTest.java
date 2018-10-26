package com.itheima_02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * ���ı��ļ��ж�ȡ���ݵ�ArrayList�����У�����������
 * ÿһ��������Ϊһ���ַ���Ԫ��
 * 
 * ������
 * 		A:�����ַ���������������
 * 		B:�������϶���
 * 		C:��ȡ���ݣ�ÿһ�ζ�ȡһ�У����Ѹ�������ΪԪ�ش洢��������
 * 		D:�ͷ���Դ
 * 		E:��������
 */
public class FileToArrayListTest {
	public static void main(String[] args) throws IOException {
		//�����ַ���������������
		BufferedReader br = new BufferedReader(new FileReader("array.txt"));
		
		//�������϶���
		ArrayList<String> array = new ArrayList<String>();
		
		//��ȡ���ݣ�ÿһ�ζ�ȡһ�У����Ѹ�������ΪԪ�ش洢��������
		String line;
		while((line=br.readLine())!=null) {
			array.add(line);
		}
		
		//�ͷ���Դ
		br.close();
		
		//��������
		for(String s : array) {
			System.out.println(s);
		}
	}
}

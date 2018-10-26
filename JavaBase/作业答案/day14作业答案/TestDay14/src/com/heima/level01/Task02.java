package com.heima.level01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task02 {
	/**
	 * �ַ��������������⹦�ܸ���Java�ļ�
	 * 
	 *  1.	����BufferedReader�������������Դ�ļ�
		2.	����BufferedWriter������������Ŀ���ļ�
		3.	����readLine�������ϵĶ�ȡ��ֻҪ������null ˵��û�ж�ȡ���
		4.	����writer����ֱ��д���ַ���������Ҫ����newLine�����ֶ�����
		5.	�ر����ͷ���Դ

	 */
	public static void main(String[] args) throws IOException {
		// 1.����BufferedReader�������������Դ�ļ�
		BufferedReader br = new BufferedReader(new FileReader("level01_Task02.txt"));
		// 2.����BufferedWriter������������Ŀ���ļ�
		BufferedWriter bw = new BufferedWriter(new FileWriter("copy_level01_Task02.txt"));
		// 3.��readLine�������ϵĶ�ȡ��ֻҪ������null ˵��û�ж�ȡ���
		String line;
		while((line = br.readLine()) != null){
			// 4.����writer����ֱ��д���ַ���������Ҫ����newLine�����ֶ�����
			bw.write(line);
			bw.newLine();
		}
		
		//5.�ر����ͷ���Դ
		br.close();
		bw.close();
	}
}

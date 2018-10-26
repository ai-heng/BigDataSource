package com.itheima.tests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * ��֪����Ŀ��Ŀ¼����һ��stu.txt�ļ����������£�
		 	
	���󣺽����ļ�������D�̸�Ŀ¼�µ�stu.txt�ļ��У�����ʱ���ļ�ÿһ�е�ĩβ׷�ӵ�ǰ������ĩβ������ʹ��--���ӡ�
	��������ļ��������£�

 */
public class Test1_01 {
	public static void main(String[] args) throws IOException {
		//1.�Ȱ����ݶ���list��
		BufferedReader br = new BufferedReader(new FileReader("stu.txt"));
		ArrayList<String> list = new ArrayList<>();
		
		String line;
		while((line = br.readLine())!=null){
			list.add(line);
		}
		br.close();
		
		int count = 1;
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("stu.txt"));
		//д���ļ���
		for (String s : list) {
			bw.write(s+"--"+count);
			count++;
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
}

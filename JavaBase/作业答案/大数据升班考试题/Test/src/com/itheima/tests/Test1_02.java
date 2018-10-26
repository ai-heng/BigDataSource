package com.itheima.tests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
/*
 * ����Ŀ��Ŀ¼�е��ļ�number.txt�У����������֣�
		 	  
	����:
	1.���ļ��е����ݶ�ȡ��List������,Ȼ���ӡ����.
	2.�Լ��Ͻ���ȥ�ز���,�������ְ��մӴ�С����,�����д�뵽��Ŀ��Ŀ¼�е�number2.txt��.

 */
public class Test1_02 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("number.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("number2.txt"));
		
		ArrayList<Integer> list = new ArrayList<>();
		//�Ȱ����ݶ���list,���ڶ����Ķ������ֶ������ǻ�Ҫ��������������Է�����Integer
		String line;
		while((line=br.readLine())!=null){
			list.add(Integer.parseInt(line));
		}
		//����set�Ĺ��췽����listʱ��ȥ��
		HashSet<Integer> set = new HashSet<>(list);
		
		System.out.println(set);
		//��������Ҫ����������������ٰ���ת��list
		list = new ArrayList<>(set);
		//��������
		Collections.sort(list,Collections.reverseOrder());
		
		System.out.println(list);
		
		
		br.close();
		bw.close();
	}
}

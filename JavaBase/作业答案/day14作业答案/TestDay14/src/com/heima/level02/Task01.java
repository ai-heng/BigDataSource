package com.heima.level02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task01 {
	 /**
	  * һ�� �����������󣬲��ô���ʵ�֣� 
			  ʵ��һ����֤��С����Ҫ�����£�
			   1. ����Ŀ��Ŀ¼���½�һ���ļ���data.txt,����¼��3���ַ�����֤�룬������data.txt�У�Ҫ��һ����֤��ռһ�У�
			   2. ����¼��һ����Ҫ��У�����֤�룬����������֤����data.txt�д��ڣ��ڿ���̨��ʾ��֤�ɹ�����������ڿ���̨��ʾ��֤ʧ��
			 
			  ����:
			   1. ����¼��������֤�����ַ�������
			   2. ����������������data.txt
			   3. ��������֤��д��data.txt����, �ر������
			   4. ����¼��һ����ҪУ�����֤�벢���ַ�������
			   5. �����������������data.txt
			   6. �������϶���
			   7. ��ȡdata.txt ����ȡ�������ݴ洢��������
			   8. ʹ�ü��ϵ���contains����, ����ҪУ����ַ�������
			   9. ���ݷ��صĽ��, ��ӡ�Ƿ����
	
	  */
	public static void main(String[] args) throws IOException{
		// 1. ����¼��������֤�����ַ�������
		Scanner sc = new Scanner(System.in);
		System.out.println("��������֤��:");
		String line1 = sc.nextLine();
		System.out.println("��������֤��:");
		String line2 = sc.nextLine();
		System.out.println("��������֤��:");
		String line3 = sc.nextLine();
		// 2. ����������������data.txt
		BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));
		// 3. ��������֤��д��data.txt����, �ر������
		bw.write(line1);
		bw.newLine();
		bw.write(line2);
		bw.newLine();
		bw.write(line3);
		bw.newLine();
		bw.close();
		
		// 4. ����¼��һ����ҪУ�����֤�벢���ַ�������
		System.out.println("��������ҪУ�����֤��");
		String num = sc.nextLine();
		
		// 5. �����������������data.txt
		BufferedReader br = new BufferedReader(new FileReader("data.txt"));
		
		// 6. �������϶���
		ArrayList<String> list = new ArrayList<>();
		
		// 7. ��ȡdata.txt ����ȡ�������ݴ洢��������
		String line;
		while ((line = br.readLine()) != null) {
			list.add(line);
		}
		
		br.close();
		
		// 8. ʹ�ü��ϵ���contains����, ����ҪУ����ַ�������
		boolean b = list.contains(num);			// ���жϼ������Ƿ���������Ԫ��
		
		// 9. ���ݷ��صĽ��, ��ӡ�Ƿ����
		if (b) {
			System.out.println("��֤�ɹ�");
		} else {
			System.out.println("��֤ʧ��");
		}
	}
}

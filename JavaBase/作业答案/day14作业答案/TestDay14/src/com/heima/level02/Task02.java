package com.heima.level02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task02 {
	/**
	 * ���������
	 * 	  1.��Ŀ��Ŀ¼�½����ļ��� user.txt���ļ��д���û����͵�¼���룬��ʽ���û���������,�磺aaa,123��
		  2. user.txt�ļ��г�ʼ��ŵ��û���Ϣ�����£�
			 jack,123
			 rose,123
			 tom,123
		  3.Ҫ��������¹��ܣ�
	 		��������ʱ������̨��ʾ�û�����ע����û��������룻
	   		��֤����¼����û�����user.txt����ע����û����Ƿ��ظ���
	   			�ǣ�����̨��ʾ���û����Ѵ���
	   			�񣺽�����¼����û���������д��user.txt�ļ������ڿ���̨��ʾ��ע��ɹ��� 
	   			
	   	1. ����¼���û��������벢������String��������
		2. �����������������user.txt
		3. �������϶���, ���ڴ洢��ȡ��������
		4. ����boolean���͵ı��flag, �������¼����û���������, Ĭ��Ϊfalse
		5. �������ϻ�ȡ��ÿһ������(�������û���,������ַ���, ˼·��Ҫ��)
			a) ���ݶ����иǰ�ַ���, ��ȡ�ַ���������0�������û���
			b) ���ż���¼����û������и����û�������Ա�, ��ͬ�Ļ���flag��Ϊtrue
		6. �ж�flag
			a) true : ��ʾ�Ѿ�����
			b) false: ����������������user.txt, ��������¼����û���������ƴ���϶���д��. (ע��β��׷��)


	 */
	public static void main(String[] args) throws IOException {
		// 1. ����¼���û��������벢������String��������
		Scanner sc = new Scanner(System.in);
		System.out.println("�������û���:");
		String userName = sc.nextLine();
		System.out.println("����������:");
		String passWord = sc.nextLine();
		// 2. �����������������user.txt
		BufferedReader br = new BufferedReader(new FileReader("user.txt"));
		// 3. �������϶���, ���ڴ洢��ȡ��������
		ArrayList<String> list = new ArrayList<>();
		
		String line;
		while((line = br.readLine()) != null){
			list.add(line);
		}
		br.close();
		
		// 4. ����boolean���͵ı��flag, �������¼����û���������, Ĭ��Ϊfalse
		boolean flag = false;
		
		// 5. �������ϻ�ȡ��ÿһ������(�������û���,������ַ���, ˼·��Ҫ��)
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			// a) ���ݶ����иǰ�ַ���, ��ȡ�ַ���������0�������û���
			String[] split = s.split(",");
			// ���ż���¼����û������и����û�������Ա�, ��ͬ�Ļ���flag��Ϊtrue
			if(userName.equals(split[0])){
				flag = true;
			}
		}
		
		// 6. �ж�flag
		if(flag){
			// a) true : ��ʾ�Ѿ�����
			System.out.println("�û����Ѵ���");
		}else{
			// b) false: ����������������user.txt, ��������¼����û���������ƴ���϶���д��. 
			BufferedWriter bw = new BufferedWriter(new FileWriter("user.txt",true));
			String result = userName + "," + passWord;
			bw.write(result); 
			bw.newLine();
			bw.close();
			System.out.println("ע��ɹ�");
		}
	}
}

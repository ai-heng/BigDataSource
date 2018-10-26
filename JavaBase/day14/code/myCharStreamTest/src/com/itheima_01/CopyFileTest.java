package com.itheima_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ����5�ַ�ʽ�����ı��ļ�
 * ����Դ��
 * 		d:\\����ϼ.txt
 * Ŀ�ĵأ�
 * 		���ﴰ��.txt
 * 
 * 5�ַ�ʽ��
 * 		�����ַ���һ�ζ�дһ���ַ�
 * 		�����ַ���һ�ζ�дһ���ַ�����
 * 		�����ַ���һ�ζ�дһ���ַ�
 * 		�����ַ���һ�ζ�дһ���ַ�����
 * 		�����ַ���һ�ζ�дһ���ַ���
 */
public class CopyFileTest {
	public static void main(String[] args) throws IOException {
		method1();
		// method2();
		// method3();
		// method4();
		// method5();
	}
	
	//�����ַ���һ�ζ�дһ���ַ���
	private static void method5() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("d:\\����ϼ.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("���ﴰ��.txt"));
		
		String line;
		while((line=br.readLine())!=null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		bw.close();
		br.close();
	}
	
	//�����ַ���һ�ζ�дһ���ַ�����
	private static void method4() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("d:\\����ϼ.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("���ﴰ��.txt"));
		
		char[] chs = new char[1024];
		int len;
		while((len=br.read(chs))!=-1) {
			bw.write(chs, 0, len);
		}
		
		bw.close();
		br.close();
	}
	
	//�����ַ���һ�ζ�дһ���ַ�
	private static void method3() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("d:\\����ϼ.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("���ﴰ��.txt"));
		
		int ch;
		while((ch=br.read())!=-1) {
			bw.write(ch);
		}
		
		bw.close();
		br.close();
	}
	
	// �����ַ���һ�ζ�дһ���ַ�����
	private static void method2() throws IOException {
		FileReader fr = new FileReader("d:\\����ϼ.txt");
		FileWriter fw = new FileWriter("���ﴰ��.txt");

		char[] chs = new char[1024];
		int len;
		while((len=fr.read(chs))!=-1) {
			fw.write(chs, 0, len);
		}

		fw.close();
		fr.close();
	}

	// �����ַ���һ�ζ�дһ���ַ�
	private static void method1() throws IOException {
		FileReader fr = new FileReader("d:\\����ϼ.txt");
		FileWriter fw = new FileWriter("���ﴰ��.txt");

		int ch;
		while ((ch = fr.read()) != -1) {
			fw.write(ch);
		}

		fw.close();
		fr.close();
	}
}

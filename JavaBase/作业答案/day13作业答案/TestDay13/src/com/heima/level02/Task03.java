package com.heima.level02;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) throws IOException {
		
		// 1. ����¼��Ҫ���ҵ��ַ�
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ���ҵ��ַ�");
		String line = sc.nextLine();
		
		// 2. �����������������info3.txt
		FileInputStream fis = new FileInputStream("info3.txt");
		
		// 3. ����StringBuilder���ڴ洢��ȡ���������ַ�
		StringBuilder sb = new StringBuilder();
		
		int b;
		
		while((b = fis.read()) != -1){
			char c = (char) b;
			// 4. ����ȡ�����ַ���ӵ�StringBuilder����
			sb.append(c);
		}
		
		// 5. ����indexOf�����жϼ���¼����ַ��Ƿ����, �������-1˵��������
		if(sb.indexOf(line) == -1){
			System.out.println("��Ǹû���ҵ�");
		} else {
			// 6. ������ڵĻ�, ��StringBuilder��ֳ��ַ�����
			int count = 0;
			char[] cArr = sb.toString().toCharArray();
			// 7. �����ַ�����, ��ȡ��ÿһ���ַ�
			for (char c : cArr) {
				// 8. ������¼����ַ��������ƥ�� (��Ҫ���˽��ַ�ת��Ϊ�ַ���)
				if(line.equals(c + "")){
					count++;
				}
			}
			// 9. ��ӡ���ֵĴ���
			System.out.println(count);
		}
	}
}

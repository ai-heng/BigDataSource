package com.heima.level01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task02 {
	/**
	 * ����˵���������ı��ļ�
	 * 
	 * 	����: 
	 * 		1.	����FileInputStream�������Դ�ļ���
			2.	����FileOutputStream�������Ŀ���ļ���
			3.	�Զ����ֽ�������߶�дЧ�ʡ�
			4.	ͨ��whileѭ�����ϵؽ����ݶ�ȡ�������С�
			5.	��ѭ�������н���ȡ�������ݴ�������д����Ŀ���ļ���
			6.	�ر����ͷ���Դ

	 */
	public static void main(String[] args) throws IOException {
		//1.����FileInputStream�������Դ�ļ���
		FileInputStream fis = new FileInputStream("Task02.txt");
		//2.����FileOutputStream�������Ŀ���ļ���
		FileOutputStream fos = new FileOutputStream("copyTask02.txt");
		//3.�Զ����ֽ�������߶�дЧ�ʡ�
		byte[] b = new byte[1024];
		//4.ͨ��whileѭ�����ϵؽ����ݶ�ȡ�������С�
		int len;
		while((len = fis.read(b)) != -1){
			//5.��ѭ�������н���ȡ�������ݴ�������д����Ŀ���ļ���
			fos.write(b,0,len);
		}
		//6.�ر����ͷ���Դ
		fis.close();
		fos.close();
	}
}

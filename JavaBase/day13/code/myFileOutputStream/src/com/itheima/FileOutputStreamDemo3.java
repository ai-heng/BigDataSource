package com.itheima;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���ʵ�����ݵĻ���?
 * 		��ͬ�Ĳ���ϵͳ����Ի��еķ���ʶ���ǲ�һ���ġ�
 * 		windows:\r\n
 * 		linux:\n
 * 		mac:\r
 * 
 * ���ʵ�����ݵ�׷��д��?
 * 		�ù��췽�����ڶ���������true���������
 */
public class FileOutputStreamDemo3 {
	public static void main(String[] args) throws IOException {
		//�����ֽ����������
		//FileOutputStream fos = new FileOutputStream("c.txt");
		//FileOutputStream(String name, boolean append) 
		//����ڶ�������Ϊ true�����ֽ�д���ļ�ĩβ����������д���ļ���ʼ��
		FileOutputStream fos = new FileOutputStream("c.txt",true);
		
		//����д���ݵķ���
		for(int x=0; x<10; x++) {
			fos.write("hello".getBytes());
			//���뻻�з���
			fos.write("\r\n".getBytes());
		}
		
		//�ͷ���Դ
		fos.close();
	}
}

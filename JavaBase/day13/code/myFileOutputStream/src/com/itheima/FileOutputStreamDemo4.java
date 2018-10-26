package com.itheima;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �ֽ���д���ݼ����쳣����
 */
public class FileOutputStreamDemo4 {
	public static void main(String[] args) {
//		FileOutputStream fos = new FileOutputStream("d.txt");
//		fos.write("hello".getBytes());
//		fos.close();
		
		//�ֿ����쳣����
//		FileOutputStream fos = null;
//		try {
//			fos = new FileOutputStream("d.txt");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		try {
//			fos.write("hello".getBytes());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		try {
//			fos.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		//����һ�����쳣����
//		try{
//			FileOutputStream fos = new FileOutputStream("d.txt");
//			fos.write("hello".getBytes());
//			fos.close();
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
		//���ַ�ʽ������Ȼ����ˣ������ͷ���Դ�Ķ�������δִ�е�
		//try...catch...finally
		FileOutputStream fos = null;
		try{
			//FileOutputStream fos = new FileOutputStream("d.txt");
//			fos = new FileOutputStream("z:\\d.txt");
			fos = new FileOutputStream("d.txt");
			fos.write("hello".getBytes());
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fos!=null) {
				//�ͷ���Դ
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

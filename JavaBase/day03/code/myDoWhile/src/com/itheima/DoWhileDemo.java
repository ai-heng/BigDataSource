package com.itheima;
/*
 * do...whileѭ�����ĸ�ʽ��
 * 		do {
 * 			ѭ�������;
 * 		}while(�ж��������);
 * 
 * ������ʽ��
 * 		��ʼ�����;
 * 		do {
 * 			ѭ�������;
 * 			�����������;
 * 		}while(�ж��������);
 * 
 * ִ�����̣�
 * 		A:ִ�г�ʼ�����
 * 		B:ִ��ѭ�������
 * 		C:ִ�п����������
 * 		D:ִ���ж�������䣬����true����false			
 * 			�����false���ͽ���ѭ��
 * 			�����true���ͻص�B����
 * 
 * ��ϰ����Ͱ�����ˮ�ɻ�����
 */
public class DoWhileDemo {
	public static void main(String[] args) {
		//�ڿ���̨���5��HelloWorld����
		/*
		for(int x=1; x<=5; x++) {
			System.out.println("HelloWorld");
		}
		*/
		
		int x=1;
		do {
			System.out.println("HelloWorld");
			x++;
		}while(x<=5);
		
	}
}

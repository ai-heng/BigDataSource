package com.itheima;
/*
 * �쳣����
 * ����1��try...catch...
 * 
 * ��ʽ��
 * 		try {
 * 			���ܳ����쳣�Ĵ���;
 * 		}catch(�쳣����  ������) {
 * 			�쳣�Ĵ������;
 * 		}
 * 
 * ִ�����̣�
 * 		�����try��ʼִ�У�ִ�е�������������⣬�ͻ���ת��catch����ִ�С�
 * 		ִ����Ϻ󣬳����ܼ�������ִ�С�
 * 
 * public void printStackTrace():���쳣�Ĵ�����Ϣ������˿���̨��
 * ��ʵ�ʿ����У������������쳣�������һ��ҳ�������ʾ��������Ŀǰ�����ˣ�
 * ���ԣ������쳣�������printStackTrace()�Ϳ����ˡ�
 * ���������Ժ����ǵĳ��򻹿��Լ�������ִ�С�
 */
public class ExceptionDemo3 {
	public static void main(String[] args) {
		System.out.println("����ʼִ��");
		method();
		System.out.println("�������ִ��");
	}
	
	public static void method() {
//		try{
//			int a = 10;
//			int b = 0;
//			System.out.println(a/b);
//			System.out.println("���ǲ²��������ִ����?");
//		}catch(ArithmeticException e) {
//			System.out.println("��������Ϊ0");
//		}
//		System.out.println("�����ٲ²��������ִ����?");
		
		try{
			int a = 10;
			int b = 0;
			System.out.println(a/b);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}
}

package com.heima.level01;

public class Task01 {
	/**
	 *  һ��	����˵������д���룬����ArithmeticException�쳣����ʹ��try..catch���д���
		����	����ʽ�����쳣��Ϣ����ڿ���̨
		
		����:
			1.	��д��ӡ��� xx / 0 �����������
			2.	ʹ��try�����������
			3.	��catchС���б�д��Ӧ��ArithmeticException���в���
			4.	ʹ��printStackTrace�������쳣��Ϣ����ڿ���̨��

	 */
	public static void main(String[] args) {
		//2.ʹ��try�����������
		try {
			
			//1.��д��ӡ��� xx / 0 �����������
			System.out.println(10 / 0);
			
		//3.��catchС���б�д��Ӧ��ArithmeticException���в���
		} catch (ArithmeticException e) {
			
			//4.ʹ��printStackTrace�������쳣��Ϣ����ڿ���̨��
			e.printStackTrace();
		
		}
		
	}
}

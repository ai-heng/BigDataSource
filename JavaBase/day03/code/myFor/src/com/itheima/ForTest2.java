package com.itheima;
/*
 * �������1-5֮������֮��
 * 
 * ������
 * 		A:����һ����ͱ�������ʼ��ֵ��0
 * 		B:��ȡ1-5�����ݣ���forѭ���Ϳ���ʵ��
 * 		C:��ÿһ�λ�ȡ���������ۼӵ���ͱ���
 * 		D:�����ͱ���
 */
public class ForTest2 {
	public static void main(String[] args) {
		//����һ����ͱ�������ʼ��ֵ��0
		int sum = 0;
		
		//��ȡ1-5�����ݣ���forѭ���Ϳ���ʵ��
		for(int x=1; x<=5; x++) {
			//��ÿһ�λ�ȡ���������ۼӵ���ͱ���
			//sum = sum + x;
			sum += x;
			/*
			 * ��һ�Σ�sum = sum + x = 0 + 1 = 1
			 * �ڶ��Σ�sum = sum + x = 1 + 2 = 3
			 * �����Σ�sum = sum + x = 3 + 3 = 6
			 * ���ĴΣ�sum = sum + x = 6 + 4 = 10
			 * ����Σ�sum = sum + x = 10 + 5 = 15
			 */
		}
		
		//�����ͱ���
		System.out.println("sum:"+sum);
	}
}

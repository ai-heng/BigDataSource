package com.itheima_02;
/*
 * ����дһ����������ӡ1��n֮�������(n�ǵ��õ�ʱ�򴫵ݹ�����)
 * ������n>=1
 */
public class MethodTest2 {
	public static void main(String[] args) {
		//���÷���
		printNumber(3);
		System.out.println("------------");
		printNumber(5);
	}
	
	/*
	 * ��ӡ1��n֮�������(n�ǵ��õ�ʱ�򴫵ݹ�����)
	 * 
	 * ������ȷ��
	 * 		����ֵ���ͣ�void
	 * 		�����б�int
	 */
	public static void printNumber(int n) {
		for(int x=1; x<=n; x++) {
			System.out.println(x);
		}
	}
}

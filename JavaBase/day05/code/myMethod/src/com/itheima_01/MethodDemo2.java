package com.itheima_01;
/*
 * �����ĵ��ã�(����ȷ����ֵ�ķ����ĵ���)
 * 		A:�������ã�û������
 * 		B:��ֵ����(�����Ƽ��ķ�ʽ)
 * 		C:�������
 */
public class MethodDemo2 {
	public static void main(String[] args) {
		//��ε��÷�����?
		//����Ӧ�ø��ݷ�����������
		//sum();
		//���÷�����������Ҫ������������Ҫ�������Ĳ���(����������)
		//sum(10,20);
	
		//��Ϊ�÷���������һ��int���͵�ֵ����������Ӧ����һ��int���͵ı�������
		int result = sum(10,20);
		System.out.println("result:"+result);
		
		//�������
		//System.out.println(sum(10,20));
	}
	
	/*
	 * ���������ݺ͵ķ���
	 */
	public static int sum(int a,int b) {
		int c = a + b;
		return c;
	}
}

package com.itheima_01;
/*
 * ���飺�洢ͬһ���������͵Ķ��Ԫ�ص�������
 * 
 * �����ʽ��
 * 		A:��������[] ������;(�Ƽ���ʹ�÷�ʽ)
 * 		B:�������� ������[];
 * 
 * 		������
 * 			int[] arr;	������һ��int���͵����飬��������arr
 * 			int arr[];	������һ��int���͵ı�������������arr����
 * 
 * �����ʼ����
 * 		A:��ν�ĳ�ʼ������ʵ����Ϊ���鿪���ڴ�ռ䣬��Ϊ�����е�ÿ��Ԫ�ظ����ʼֵ��
 * 		B:��ν��г�ʼ����?���������ַ�ʽ��������г�ʼ��
 * 			a:��̬��ʼ��	ֻ�������ȣ���ϵͳ������ʼ��ֵ
 * 			b:��̬��ʼ��	������ʼ��ֵ����ϵͳ��������
 * 
 * ��̬��ʼ����
 * 		��������[] ������ = new ��������[���鳤��];
 */
public class ArrayDemo {
	public static void main(String[] args) {
		//��������[] ������ = new ��������[���鳤��];
		int[] arr = new int[3];
		/*
		 * ��ߣ�
		 * 		int:˵�����������е�Ԫ��������int����
		 * 		[]:˵������һ������
		 * 		arr:�������������
		 * �ұߣ�
		 * 		new:Ϊ������������ڴ�ռ䡣
		 * 		int:˵�����������е�Ԫ��������int����
		 * 		[]:˵������һ������
		 * 		3:���鳤�ȣ���ʵ���������е�Ԫ�ظ���
		 */
		
		//���������
		System.out.println("arr:"+arr); //[I@104c575
		//ͨ����������������ǵõ���һ����ֵַ���������ֵ��������˵û������
		//��Ҫ��ȡ���������е�Ԫ��ֵ���ܲ��ܻ�ȡ����?��
		//��ô��ȡ��?��ͬ���ģ�Java�Ѿ����������
		//��ʵ�����е�ÿ��Ԫ�����б�ŵģ���Ŵ�0��ʼ�����ı��������ĳ���-1
		//ͨ���������ͱ�ŵ����ʹ�����ǾͿ��Ի�ȡ������ָ����ŵ�Ԫ��ֵ
		//��ô��ϵ���?��ŵ�רҵ�з�������
		//��ȡԪ�صĸ�ʽ��������[����]
		System.out.println("arr[0]:"+arr[0]);//0
		System.out.println("arr[1]:"+arr[1]);//0
		System.out.println("arr[2]:"+arr[2]);//0
	}
}
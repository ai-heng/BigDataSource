package com.itheima_01;
/*
 * Java�̳��г�Ա�������ص㣺
 * 		A:��Ա�������Ʋ�һ����ʹ�õ�ʱ��ǳ��򵥡�
 * 		B:��Ա��������һ�������
 * 			�����෽���з��ʱ�����
 * 				a:�ڷ����ľֲ���Χ�ң�����о�ʹ��
 * 				b:������ĳ�Ա��Χ�ң�����о�ʹ��
 * 				c:�ڸ���ĳ�Ա��Χ�ң�����о�ʹ��
 * 				d:������Ҳ������ͱ���
 * 			�ͽ�ԭ��
 */
public class Son extends Father {
	//���
	public int height = 170;
	//����
	public int age = 20;
	
	public void show() {
		System.out.println(height);
		System.out.println(age);
	}
	
	public void printAge() {
		int age = 10;
		System.out.println(age);
	}
}

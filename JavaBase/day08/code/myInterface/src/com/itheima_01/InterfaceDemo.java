package com.itheima_01;
/*
 * �ӿڵ��ص㣺
 * 		A:����ӿ�ʹ�õ���interface�ؼ���
 * 		B:��ͽӿ�֮����ʵ�ֹ�ϵ����implements�ؼ��ֱ�ʾ
 * 		C:�ӿڲ���ʵ����
 * 			�ӿ���û�������ķ�ʽʵ������?
 * 			���ն�̬����ʽʹ��ʵ������ʵ������
 * 		D:�ӿڵ�ʵ����
 * 			Ҫô��д�ӿ��е����еĳ��󷽷�
 * 			Ҫô��һ��������
 * 
 * ��̬�ļ�����ʽ��
 * 		�������̬(��������)
 * 		�������̬(����)
 * 		�ӿڶ�̬(���)
 */
public class InterfaceDemo {
	public static void main(String[] args) {
		//Jumpping j = new Jumpping();
		//�ӿڶ�̬����ʽʵ����
		Jumpping j = new Cat();
		j.jump();
	}
}

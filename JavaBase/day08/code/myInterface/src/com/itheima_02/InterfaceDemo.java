package com.itheima_02;
/*
 * �ӿڵĳ�Ա�ص㣺
 * 		��Ա������
 * 			�г�Ա���������ұ���ֻ���ǳ�����
 * 			Ĭ�����η���public static final
 * 		���췽����
 * 			û�й��췽����
 * 		��Ա������
 * 			�г�Ա���������Ҷ��ǳ���ġ�
 * 			Ĭ�����η���public abstract
 * 
 * Object:�����νṹ�ĸ��࣬���е��඼ֱ�ӵĻ��߼�ӵļ̳��Ը��ࡣ
 */
public class InterfaceDemo {
	public static void main(String[] args) {
		//���ն�̬����ʽ�����ӿڶ���
		Inter i = new InterImpl();
		//i.num = 30;
		//System.out.println(i.num);
		//i.num2 = 40;
		//System.out.println(i.num2);
		System.out.println(Inter.num);
		System.out.println(Inter.num2);
	}
}

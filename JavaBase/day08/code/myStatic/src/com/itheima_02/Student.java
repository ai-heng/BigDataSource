package com.itheima_02;
/*
 * �Ǿ�̬�ĳ�Ա������
 * 		�ܷ��ʾ�̬�ĳ�Ա����
 * 		�ܷ��ʷǾ�̬�ĳ�Ա����
 * 		�ܷ��ʾ�̬�ĳ�Ա����
 * 		�ܷ��ʷǾ�̬�ĳ�Ա����
 * 
 * ��̬�ĳ�Ա������
 * 		�ܷ��ʾ�̬�ĳ�Ա����
 * 		�ܷ��ʾ�̬�ĳ�Ա����
 * 
 * ע�����
 * 		��̬��Ա�����в��ܳ���this,super�����Ĺؼ��֡�
 * 		ԭ���ǣ���̬��������ļ��ض����أ�this,super�����Ĺؼ��������Ŷ���Ĵ��������ڡ�
 * 			    �Ƚ��ڴ�ģ����ܷ��ʺ���ڴ�ġ�
 */
public class Student {
	//�Ǿ�̬�ĳ�Ա����
	private String name = "����ϼ";
	//��̬�ĳ�Ա����
	private static int age = 30;
	
	//�Ǿ�̬�ĳ�Ա����
	public void show() {
		this.name = "���»�";
		System.out.println(name);
		System.out.println(age);
		show2();
		show4();
	}
	
	public void show2() {}
	
	//��̬�ĳ�Ա����
	public static void show3() {
		//this.age
		//this.name
		
		//System.out.println(name);
		System.out.println(age);
		//show2();
		show4();
	}
	
	public static void show4() {}
}

package com.itheima_01;
/*
 * ������д�������г����˺͸�����һģһ���ķ��������������
 * 
 * ������д��Ӧ�ã�
 * 		��������Ҫ����Ĺ��ܣ��������������������Լ����������ݵ�ʱ�򣬾Ϳ���ʹ�÷�����д��
 * 		��������֤�˸���Ĺ��ܣ��������������������ݡ�
 */
public class PhoneTest {
	public static void main(String[] args) {
		Phone p = new Phone();
		p.call("����ϼ");
		System.out.println("-----------");
		NewPhone np = new NewPhone();
		np.call("����ϼ");
	}
}

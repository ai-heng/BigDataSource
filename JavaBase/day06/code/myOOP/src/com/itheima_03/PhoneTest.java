package com.itheima_03;
/*
 * �ֻ�������
 */
public class PhoneTest {
	public static void main(String[] args) {
		Phone p = new Phone();
		
		System.out.println(p.brand+"---"+p.price+"---"+p.color);
		
		p.brand = "����";
		p.price = 2999;
		p.color = "��ɫ";
		
		System.out.println(p.brand+"---"+p.price+"---"+p.color);
		
		p.call("����ϼ");
		p.sendMessage("����ϼ");
	}
}

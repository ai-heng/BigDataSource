package com.itheima_03;
/*
 * �ֻ�������
 */
public class PhoneTest3 {
	public static void main(String[] args) {
		Phone p = new Phone();
		p.brand = "OPPO";
		p.price = 2999;
		p.color = "��ɫ";
		System.out.println(p.brand+"---"+p.price+"---"+p.color);
		
		Phone p2 = p;
		p2.brand = "����";
		p2.price = 1999;
		p2.color = "��ɫ";
		System.out.println(p.brand+"---"+p.price+"---"+p.color);
		System.out.println(p2.brand+"---"+p2.price+"---"+p2.color);
	}
}

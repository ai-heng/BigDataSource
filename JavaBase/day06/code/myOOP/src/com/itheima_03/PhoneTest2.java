package com.itheima_03;
/*
 * �ֻ�������
 */
public class PhoneTest2 {
	public static void main(String[] args) {
		Phone p = new Phone();
		p.brand = "С��5s";
		p.price = 1999;
		p.color = "��ɫ";
		System.out.println(p.brand+"---"+p.price+"---"+p.color);
		p.call("����ϼ");
		p.sendMessage("����ϼ");
		
		Phone p2 = new Phone();
		p2.brand = "��ΪP9";
		p2.price = 3288;
		p2.color = "��ɫ";
		System.out.println(p2.brand+"---"+p2.price+"---"+p2.color);
		p2.call("������");
		p2.sendMessage("������");
	}
}

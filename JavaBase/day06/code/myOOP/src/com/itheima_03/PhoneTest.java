package com.itheima_03;
/*
 * 手机测试类
 */
public class PhoneTest {
	public static void main(String[] args) {
		Phone p = new Phone();
		
		System.out.println(p.brand+"---"+p.price+"---"+p.color);
		
		p.brand = "锤子";
		p.price = 2999;
		p.color = "棕色";
		
		System.out.println(p.brand+"---"+p.price+"---"+p.color);
		
		p.call("林青霞");
		p.sendMessage("林青霞");
	}
}

package com.itheima_03;
/*
 * 手机测试类
 */
public class PhoneTest2 {
	public static void main(String[] args) {
		Phone p = new Phone();
		p.brand = "小米5s";
		p.price = 1999;
		p.color = "银色";
		System.out.println(p.brand+"---"+p.price+"---"+p.color);
		p.call("林青霞");
		p.sendMessage("林青霞");
		
		Phone p2 = new Phone();
		p2.brand = "华为P9";
		p2.price = 3288;
		p2.color = "灰色";
		System.out.println(p2.brand+"---"+p2.price+"---"+p2.color);
		p2.call("张曼玉");
		p2.sendMessage("张曼玉");
	}
}

package com.itheima.level02_05;
/*
 * 手机类Phone
	属性:
		品牌brand
		价格price
	行为:
		打电话call()
		发短信sendMessage()
		玩游戏playGame()
 */
public class Phone {
	private String brand;
	private int price;
	public Phone() {
	}
	public Phone(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//打电话功能
	public void call() {
		System.out.println("正在使用价格为"+price+"元的"+brand+"品牌的手机打电话....");
	}
//	发短信sendMessage()
	public void sendMessage(){
		System.out.println("正在使用价格为"+price+"元的"+brand+"品牌的手机发短信....");
	}
//	玩游戏playGame()
	public void playGame(){
		System.out.println("正在使用价格为"+price+"元的"+brand+"品牌的手机玩游戏....");
	}
}

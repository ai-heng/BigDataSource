package com.itheima;

/*
 * 分析：
 * 	抽象类：Computer
 * 		属性：brand， price
 * 		具体方法：StartingUp() shutDown()
 * 		抽象方法：power()
 * 	
 * 	接口：
 * 		Mouse
 * 			mouseStart()
 * 			mouseClose()
 * 		Keyboard
 * 			keyboardStart()
 * 			keyboardClose()
 * 	实现类: 
 * 		DesktopPC
 * 		NotebookPC
 * 		其中台式机实现接口
 */
public class Test7 {
	public static void main(String[] args) {
		// 测试台式机
		DesktopPC dpc = new DesktopPC("联想", 4000);
		System.out.println(dpc);
		
		dpc.power();
		dpc.StartingUp();
		dpc.keyboardStart();
		dpc.keyboardClose();
		dpc.mouseStart();
		dpc.mouseClose();
		dpc.shutDown();
		
		System.out.println("----------------");
		
		// 测试笔记本电脑
		NotebookPC npc = new NotebookPC("苹果", 9000);
		System.out.println(npc);
		npc.power();
		npc.StartingUp();
		npc.shutDown();
	}
}

class NotebookPC extends Computer {

	public NotebookPC() {
	}

	public NotebookPC(String brand, int price) {
		super(brand, price);
	}

	@Override
	public void power() {
		System.out.println("笔记本电脑需要安装电池");
	}

	@Override
	public String toString() {
		return "NotebookPC [getBrand()=" + getBrand() + ", getPrice()=" + getPrice() + "]";
	}

}

class DesktopPC extends Computer implements Mouse, Keyboard {

	public DesktopPC() {
	}

	public DesktopPC(String brand, int price) {
		super(brand, price);
	}

	@Override
	public void keyboardClose() {
		System.out.println("台式机外接键盘关闭");
	}

	@Override
	public void keyboardStart() {
		System.out.println("台式机外接键盘启动");
	}

	@Override
	public void mouseClose() {
		System.out.println("台式机外接鼠标关闭");
	}

	@Override
	public void mouseStart() {
		System.out.println("台式机外接鼠标启动");
	}

	@Override
	public void power() {
		System.out.println("台式机直接使用插座电源");
	}

	@Override
	public String toString() {
		return "DesktopPC [getBrand()=" + getBrand() + ", getPrice()=" + getPrice() + "]";
	}

}

interface Mouse {
	public abstract void mouseStart();

	void mouseClose();
}

interface Keyboard {
	void keyboardStart();

	void keyboardClose();
}

abstract class Computer {
	private String brand;
	private int price;

	public Computer() {
	}

	public Computer(String brand, int price) {
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

	// 启动功能
	public void StartingUp() {
		System.out.println("电脑启动");
	}

	// 关闭
	public void shutDown() {
		System.out.println("电脑关闭");
	}

	// 通电
	public abstract void power();

}

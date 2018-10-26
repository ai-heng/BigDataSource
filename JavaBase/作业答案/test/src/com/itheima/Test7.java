package com.itheima;

/*
 * ������
 * 	�����ࣺComputer
 * 		���ԣ�brand�� price
 * 		���巽����StartingUp() shutDown()
 * 		���󷽷���power()
 * 	
 * 	�ӿڣ�
 * 		Mouse
 * 			mouseStart()
 * 			mouseClose()
 * 		Keyboard
 * 			keyboardStart()
 * 			keyboardClose()
 * 	ʵ����: 
 * 		DesktopPC
 * 		NotebookPC
 * 		����̨ʽ��ʵ�ֽӿ�
 */
public class Test7 {
	public static void main(String[] args) {
		// ����̨ʽ��
		DesktopPC dpc = new DesktopPC("����", 4000);
		System.out.println(dpc);
		
		dpc.power();
		dpc.StartingUp();
		dpc.keyboardStart();
		dpc.keyboardClose();
		dpc.mouseStart();
		dpc.mouseClose();
		dpc.shutDown();
		
		System.out.println("----------------");
		
		// ���ԱʼǱ�����
		NotebookPC npc = new NotebookPC("ƻ��", 9000);
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
		System.out.println("�ʼǱ�������Ҫ��װ���");
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
		System.out.println("̨ʽ����Ӽ��̹ر�");
	}

	@Override
	public void keyboardStart() {
		System.out.println("̨ʽ����Ӽ�������");
	}

	@Override
	public void mouseClose() {
		System.out.println("̨ʽ��������ر�");
	}

	@Override
	public void mouseStart() {
		System.out.println("̨ʽ������������");
	}

	@Override
	public void power() {
		System.out.println("̨ʽ��ֱ��ʹ�ò�����Դ");
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

	// ��������
	public void StartingUp() {
		System.out.println("��������");
	}

	// �ر�
	public void shutDown() {
		System.out.println("���Թر�");
	}

	// ͨ��
	public abstract void power();

}

package com.itheima.level01;

public class Task03 {
	public static void main(String[] args){
		
	}
}

class Student2 {
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

package com.itheima_01;

public class NewPhone extends Phone {
	
	public void call(String name) {
		System.out.println("������Ƶ����");
		//System.out.println("��"+name+"��绰");
		super.call(name);
	}
}
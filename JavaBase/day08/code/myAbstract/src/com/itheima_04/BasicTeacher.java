package com.itheima_04;
//��������ʦ
public class BasicTeacher extends Teacher {

	public BasicTeacher() {}
	
	public BasicTeacher(String name,int age) {
		super(name,age);
	}
	
	@Override
	public void teach() {
		System.out.println("��������ʦ����JavaSE������");
	}

}

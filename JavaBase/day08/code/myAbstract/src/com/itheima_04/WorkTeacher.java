package com.itheima_04;
//��ҵ����ʦ
public class WorkTeacher extends Teacher {

	public WorkTeacher() {}
	
	public WorkTeacher(String name,int age) {
		super(name,age);
	}
	
	@Override
	public void teach() {
		System.out.println("��ҵ����ʦ����JavaEE������");
	}

}

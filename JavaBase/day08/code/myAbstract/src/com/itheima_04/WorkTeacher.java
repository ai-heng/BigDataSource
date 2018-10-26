package com.itheima_04;
//就业班老师
public class WorkTeacher extends Teacher {

	public WorkTeacher() {}
	
	public WorkTeacher(String name,int age) {
		super(name,age);
	}
	
	@Override
	public void teach() {
		System.out.println("就业班老师讲解JavaEE的内容");
	}

}

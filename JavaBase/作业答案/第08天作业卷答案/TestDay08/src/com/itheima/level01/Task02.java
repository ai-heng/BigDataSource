package com.itheima.level01;

public class Task02 {
	public static void main(String[] args) {
		Student.graduateFrom = "����ѧԺ";

		Student s1 = new Student();
		s1.name = "����ϼ";
		s1.age = 30;
		// s1.graduateFrom = "����ѧԺ";
		s1.show();
		System.out.println("----------------------");

		Student s2 = new Student();
		s2.name = "���»�";
		s2.age = 28;
		// s2.graduateFrom = "����ѧԺ";
		s2.show();
	}
}

class Student {
	public String name;
	public int age;
	//public String graduateFrom; //��ҵԺУ
	public static String graduateFrom; //��ҵԺУ
	
	public void show() {
		System.out.println(name+"---"+age+"---"+graduateFrom);
	}
}


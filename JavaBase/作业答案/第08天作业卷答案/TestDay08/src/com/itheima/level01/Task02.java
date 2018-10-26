package com.itheima.level01;

public class Task02 {
	public static void main(String[] args) {
		Student.graduateFrom = "传智学院";

		Student s1 = new Student();
		s1.name = "林青霞";
		s1.age = 30;
		// s1.graduateFrom = "传智学院";
		s1.show();
		System.out.println("----------------------");

		Student s2 = new Student();
		s2.name = "刘德华";
		s2.age = 28;
		// s2.graduateFrom = "传智学院";
		s2.show();
	}
}

class Student {
	public String name;
	public int age;
	//public String graduateFrom; //毕业院校
	public static String graduateFrom; //毕业院校
	
	public void show() {
		System.out.println(name+"---"+age+"---"+graduateFrom);
	}
}


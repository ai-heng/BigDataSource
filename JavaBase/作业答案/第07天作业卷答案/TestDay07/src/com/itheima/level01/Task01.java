package com.itheima.level01;

/*
一、	分析以下需求，并用代码实现：
1.	定义Person类
		属性：姓名name、年龄age；
		方法：空参构造方法、满参构造方法、setXxx()、getXxx()、工作work。 
2.	根据人类，派生一个老师类Teacher 
		重写工作方法（老师的工作是学习）。	
3.	根据人类，派生一个学生类Teacher 
		重写工作方法（学生的工作是学习）。
4.	编写测试类分别对上述2类具体人物进行测试
5.	要求运行结果:
		学生的工作要好好学习
		老师的工作要好好讲课
*/
public class Task01 {
	public static void main(String[] args) {
		Student s = new Student();
		s.work();

		Teacher t = new Teacher();
		t.work();
	}
}

class Person {
	private String name;
	private int age;

	public Person() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void work() {
		System.out.println("所有人都需要工作");
	}
}

class Student extends Person {
	public void work() {
		System.out.println("学生的工作要好好学习");
	}
}

class Teacher extends Person {
	public void work() {
		System.out.println("老师的工作要好好讲课");
	}
}
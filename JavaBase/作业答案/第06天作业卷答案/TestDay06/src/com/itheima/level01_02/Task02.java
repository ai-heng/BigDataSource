package com.itheima.level01_02;

import java.util.Scanner;

/*
 * 1. 设计，并定义一个学员类：Student
 * 		学员编号（String） 
		姓名（String）
		性别（String）
		身高（double）
		年龄（int）
		提供无参和全参的构造方法\get\set
 */
public class Task02 {
	public static void main(String[] args) {
		//2. 通过用户键盘输入学员编号、姓名等信息，把数据保存到变量中
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入学员编号：");
		String id = sc.next();
		System.out.print("请输入学员姓名：");
		String name = sc.next();
		System.out.print("请输入学员性别：");
		String sex = sc.next();
		System.out.print("请输入学员身高：");
		double height = sc.nextDouble();
		System.out.print("请输入学员年龄：");
		int age = sc.nextInt();
		
		//3. 创建Student对象，通过构造方法将所有数据存储到Student对象中
		Student stu = new Student(id, name, sex, height, age);
		//4. 打印对象中的每个属性值。
		System.out.println(stu.getId() + ", " + stu.getName() + "," + stu.getSex() + ", " + stu.getHeight() + ", " + stu.getAge());;
	}
}

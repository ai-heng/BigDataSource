package com.itheima.level02;

/*
 * Ա����
 */
public class Employee2 {
//	���� ���� ����
	private String name;
	private String id;
	private double salary;
	public Employee2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee2(String name, String id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void work(){
		System.out.println("����Ա����Ҫ����");
	}
}

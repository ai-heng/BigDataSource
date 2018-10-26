package com.itheima.level02;

public class Task01 {
	public static void main(String[] args) {
		Manager m = new Manager("张三", "007", 22000, 5000);
		m.work();
		
		Coder c = new Coder("李四", "110", 22000);
		c.work();
	}
}

class Manager extends Employee {
	private double bonus;

	public Manager() {
		super();
	}

	public Manager(String name, String id, double salary, double bonus) {
		super(name, id, salary);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public void work(){
		System.out.println("项目经理正在与客户谈生意");
	}
}

class Coder extends Employee{
	public Coder() {
		super();
	}

	public Coder(String name, String id, double salary) {
		super(name, id, salary);
	}

	@Override
	public void work() {
		System.out.println("程序员正在敲代码");
	}
}

abstract class Employee {
	private String name;
	private String id;
	private double salary;

	public Employee() {
		super();
	}

	public Employee(String name, String id, double salary) {
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
	
	public abstract void work();
}
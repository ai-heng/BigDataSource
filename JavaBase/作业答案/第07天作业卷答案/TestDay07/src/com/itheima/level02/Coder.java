package com.itheima.level02;

public class Coder extends Employee2 {
	
	public Coder() {
		super();
	}

	public Coder(String name, String id, double salary) {
		super(name, id, salary);
	}

	public void work(){
		System.out.println(this.getName() + "..." + this.getId() + "..." + this.getSalary() + ",程序员正在敲代码");
	}
}

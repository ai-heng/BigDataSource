package com.itheima.level02;

public class Manager2 extends Employee2{
	private double bonus;

	public Manager2() {
		super();
	}

	public Manager2(String name, String id, double salary, double bonus) {
		super(name, id, salary);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public void work() {
		System.out.println(this.getName() + "..." + this.getId() + "...." + this.getSalary() + "..." + this.getBonus() + ",项目经理正在上班");
	}
}

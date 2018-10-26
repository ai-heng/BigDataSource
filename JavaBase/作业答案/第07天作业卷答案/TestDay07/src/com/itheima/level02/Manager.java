package com.itheima.level02;

public class Manager extends Employee {
	private double bonus;
	
	public Manager() {
		super();
	}

	public Manager(String id, String name, double bonus) {
		super(id, name);
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
		System.out.println(this.getName() + "..." + this.getId() + "...." + this.getBonus() + ",项目经理正在上班");
	}
}

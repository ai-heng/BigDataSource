package com.itheima.level02;

/*
 * 服务员类
 */
public class Waiter extends Employee {
	public Waiter() {
		super();
	}

	public Waiter(String id, String name) {
		super(id, name);
	}

	@Override
	public void work() {
		System.out.println(this.getName() + "..." + this.getId() + ",服务员正在上班");
	}
}

package com.itheima.level02;

/*
 * ����Ա��
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
		System.out.println(this.getName() + "..." + this.getId() + ",����Ա�����ϰ�");
	}
}

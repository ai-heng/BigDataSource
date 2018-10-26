package com.itheima.level01;

public class Task05 {
	public static void main(String[] args) {
		// ʹ�õ��Ǿ������Ķ���
		// BasicTeacher

		// ��̬��ʽ�Ĳ���
		Teacher t = new BasicTeacher();
		t.setName("����ϼ");
		t.setAge(30);
		System.out.println(t.getName() + "---" + t.getAge());
		t.teach();
		System.out.println("---------------------------");

		t = new BasicTeacher("����ϼ", 30);
		System.out.println(t.getName() + "---" + t.getAge());
		t.teach();
	}
}

// �������ʦ��
abstract class Teacher {
	private String name;
	private int age;

	public Teacher() {
	}

	public Teacher(String name, int age) {
		this.name = name;
		this.age = age;
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

	// ���󷽷�
	public abstract void teach();
}

/*
 * ��ҵ����ʦ
 */
class WorkTeacher extends Teacher {
	public WorkTeacher() {
	}

	public WorkTeacher(String name, int age) {
		super(name, age);
	}

	@Override
	public void teach() {
		System.out.println("��ҵ����ʦ����JavaEE������");
	}
}

/*
 * ��������ʦ
 */
class BasicTeacher extends Teacher {
	public BasicTeacher() {
	}

	public BasicTeacher(String name, int age) {
		super(name, age);
	}

	@Override
	public void teach() {
		System.out.println("��������ʦ����JavaSE������");
	}

}

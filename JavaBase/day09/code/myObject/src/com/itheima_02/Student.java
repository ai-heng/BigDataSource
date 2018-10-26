package com.itheima_02;

public class Student {
	private String name;
	private int age;
	
	public Student() {}
	
	public Student(String name,int age) {
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

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}


	@Override
	public boolean equals(Object obj) {
		//s1.equals(s2)
		//this -- s1
		//obj -- s2
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		//�Ƚϵ��Ƕ����Ƿ���ͬһ����Ķ���
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj; //other -- s2
		if (age != other.age) //this.age -- s1.age
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			//�ַ�����equals()�Ƚϵ����ַ����������Ƿ���ͬ
			return false;
		return true;
	}
	
	
}

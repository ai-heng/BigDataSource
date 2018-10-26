package com.itheima.level02;

/*
增加属性：
	职务job；
增加方法：开会meeting。
 */
public class StudentLeader extends Student {
	private String job;

	public StudentLeader() {
		super();
	}

	public StudentLeader(String name, String gender, int age, String nationality, String school, String stuNumber, String job) {
		super(name, gender, age, nationality, school, stuNumber);
		this.job = job;
	}
	
	public String getJob() {
		return job;
	}



	public void setJob(String job) {
		this.job = job;
	}



	public void meeting(){
		System.out.println("学生干部喜欢开会!");
	}
}

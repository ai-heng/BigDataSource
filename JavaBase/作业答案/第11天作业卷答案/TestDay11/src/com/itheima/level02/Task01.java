package com.itheima.level02;

public class Task01 {
	public static void main(String[] args) {
		Student s1 = new Student("马云", 51, 40);
		Student s2 = new Student("李四", 44, 60);
		Student s3 = new Student("张三", 23, 90);
		Student s4 = new Student("王五", 25, 82);
		Student s5 = new Student("张飞", 29, 59);
		Student[] arr = { s1, s2, s3, s4, s5 };

		StudentsTool tool = new StudentsTool();
		tool.listStudents(arr);

		System.out.println("学生成绩的最高分为:" + tool.getMaxScore(arr));

		Student s = tool.getMaxStudent(arr);
		System.out.println("成绩最高的学生为：" + s.getName());

		System.out.println("学生成绩的平均值为:" + tool.getAverageScore(arr));

		System.out.println("不及格的学员数量为:" + tool.getCount(arr));
	}
}

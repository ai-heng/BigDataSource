package com.itheima.level02;

public class Task01 {
	public static void main(String[] args) {
		Student s1 = new Student("����", 51, 40);
		Student s2 = new Student("����", 44, 60);
		Student s3 = new Student("����", 23, 90);
		Student s4 = new Student("����", 25, 82);
		Student s5 = new Student("�ŷ�", 29, 59);
		Student[] arr = { s1, s2, s3, s4, s5 };

		StudentsTool tool = new StudentsTool();
		tool.listStudents(arr);

		System.out.println("ѧ���ɼ�����߷�Ϊ:" + tool.getMaxScore(arr));

		Student s = tool.getMaxStudent(arr);
		System.out.println("�ɼ���ߵ�ѧ��Ϊ��" + s.getName());

		System.out.println("ѧ���ɼ���ƽ��ֵΪ:" + tool.getAverageScore(arr));

		System.out.println("�������ѧԱ����Ϊ:" + tool.getCount(arr));
	}
}

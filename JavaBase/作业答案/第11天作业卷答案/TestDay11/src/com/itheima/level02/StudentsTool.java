package com.itheima.level02;

public class StudentsTool {
//	public void listStudents(Student[] arr):遍历打印学生信息
	public void listStudents(Student[] arr){
		for (int i = 0; i < arr.length; i++) {
			Student s = arr[i];
			System.out.println(s.getName() + "..." + s.getAge() + "..." + s.getScore());
		}
	}
	
//	public int getMaxScore(Student[] arr):获取学生成绩的最高分
	public int getMaxScore(Student[] arr){
		Student s = getMaxStudent(arr);
		return s.getScore();
	}
	
//	public Student getMaxStudent(Student[] arr):获取成绩最高的学员
	public Student getMaxStudent(Student[] arr){
		Student s = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(s.getScore() < arr[i].getScore()){
				s = arr[i];
			}
		}
		return s;
	}
	
//	public int getAverageScore(Student[] arr):获取学生成绩的平均值
	public int getAverageScore(Student[] arr){
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			Student s = arr[i];
			sum += s.getScore();
		}
		return sum / arr.length;
	}
	
//	public int getCount(Student[] arr):获取不及格的学员数量
	public int getCount(Student[] arr){
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].getScore() < 60){
				count++;
			}
		}
		return count;
	}
}

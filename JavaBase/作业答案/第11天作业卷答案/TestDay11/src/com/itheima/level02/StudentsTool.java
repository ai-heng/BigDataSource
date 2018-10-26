package com.itheima.level02;

public class StudentsTool {
//	public void listStudents(Student[] arr):������ӡѧ����Ϣ
	public void listStudents(Student[] arr){
		for (int i = 0; i < arr.length; i++) {
			Student s = arr[i];
			System.out.println(s.getName() + "..." + s.getAge() + "..." + s.getScore());
		}
	}
	
//	public int getMaxScore(Student[] arr):��ȡѧ���ɼ�����߷�
	public int getMaxScore(Student[] arr){
		Student s = getMaxStudent(arr);
		return s.getScore();
	}
	
//	public Student getMaxStudent(Student[] arr):��ȡ�ɼ���ߵ�ѧԱ
	public Student getMaxStudent(Student[] arr){
		Student s = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(s.getScore() < arr[i].getScore()){
				s = arr[i];
			}
		}
		return s;
	}
	
//	public int getAverageScore(Student[] arr):��ȡѧ���ɼ���ƽ��ֵ
	public int getAverageScore(Student[] arr){
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			Student s = arr[i];
			sum += s.getScore();
		}
		return sum / arr.length;
	}
	
//	public int getCount(Student[] arr):��ȡ�������ѧԱ����
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

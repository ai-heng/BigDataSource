package com.itheima.level02;

import java.util.ArrayList;

/*
1.����Student��
����:
	������String name
	���䣺int age
	�ɼ���int score
��Ϊ:
	�ղι��췽��
	�вι��췽��
	set��get����
	toString����
2.���������,���в���
(1)����10��ѧ���������ArrayList������
(2)��ӡ��߷ֵ�ѧԱ���������䡢�ɼ�  [Ҫ���װ1������  �����Ǽ��϶���   ����ֵ����ΪStudent]
(3)��ӡ10��ѧ�����ܳɼ���ƽ����		 [Ҫ���װ�����������]
(4)��ӡ�������ѧԱ��Ϣ������		 [Ҫ���װһ���������]
*/
public class Task03 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("����", 23, 30));
		list.add(new Student("����", 24, 50));
		list.add(new Student("����", 25, 30));
		list.add(new Student("����", 26, 86));
		list.add(new Student("����", 27, 75));
		list.add(new Student("С��", 28, 60));
		list.add(new Student("����", 29, 70));
		list.add(new Student("����", 30, 90));
		list.add(new Student("С��", 18, 99));
		list.add(new Student("�ƿ�", 19, 80));

		// (2)��ӡ��߷ֵ�ѧԱ���������䡢�ɼ� [Ҫ���װ1������ �����Ǽ��϶��� ����ֵ����ΪStudent]
		Student stu = getMaxScoreStu(list);
		System.out.println(stu);

		// (3)��ӡ10��ѧ�����ܳɼ���ƽ����[Ҫ���װ�����������]
		int sum = getSumScore(list);
		int avg = getAverageScore(list);
		System.out.println("�ܳɼ���" + sum + ",ƽ���ɼ���" + avg);

		// (4)��ӡ�������ѧԱ��Ϣ������ [Ҫ���װһ���������]
		printFailStuInfo(list);
	}

	private static Student getMaxScoreStu(ArrayList<Student> list) {
		Student s = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (s.getScore() < list.get(i).getScore()) {
				s = list.get(i);
			}
		}
		return s;
	}

	// �ܳɼ�
	public static int getSumScore(ArrayList<Student> list) {
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			sum += s.getScore();
		}
		return sum;
	}

	// ƽ���ɼ�
	public static int getAverageScore(ArrayList<Student> list) {
		return getSumScore(list) / list.size();
	}

	// (4)��ӡ�������ѧԱ��Ϣ������ [Ҫ���װһ���������]
	public static void printFailStuInfo(ArrayList<Student> list) {
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getScore() < 60) {
				System.out.println(list.get(i));
				count++;
			}
		}
		System.out.println("������ѧ�����У�" + count + "��");
	}
}

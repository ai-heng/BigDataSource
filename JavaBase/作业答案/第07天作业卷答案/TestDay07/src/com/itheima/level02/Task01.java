package com.itheima.level02;

/*
�����������󣬲��ô���ʵ��
	1.����Person��
		���ԣ�
			����name���Ա�gender������age������nationality��
		�������Է�eat��˯��sleep������work��
	2.�������࣬����һ��ѧ����Student
		�������ԣ�
			ѧУschool��ѧ��stuNumber��
		��д����������ѧ���Ĺ�����ѧϰ����	
	3.�������࣬����һ��������Worker
		�������ԣ�
			��λunit������workAge��
		��д�������������˵Ĺ����ǸǷ��ӣ���
	4.����ѧ���࣬����һ��ѧ���ɲ��� StudentLeader
		�������ԣ�
			ְ��job��
		���ӷ���������meeting��
	5.��д������ֱ������3�����������в��ԡ�
	6.Ҫ�����н��:
		ѧ����Ҫѧϰ!
		���˵Ĺ����ǸǷ���!
		ѧ���ɲ�ϲ������!
 */
public class Task01 {
	public static void main(String[] args) {
		Student s = new Student("����", "female", 20, "�й�", "����", "heima001");
		System.out.println(s.getName() + ":::" + s.getGender() +"::" + s.getAge() + "::" + s.getNationality()+ ":::" + s.getSchool() + "::" + s.getStuNumber());
		s.work();
		
		Worker w = new Worker("������", "male", 50, "����", "�����", 10);
		w.work();
		
		StudentLeader leader = new StudentLeader("����", "male", 38, "�й�", "��������ѧԺ", "NO1", "����");
		leader.work();
	}
}

package com.itheima_01;
/*
 * ���췽�������ڸ���������ݽ��г�ʼ��
 * 
 * ��ʽ��
 * 		��������������ͬ
 * 		û�з���ֵ���ͣ���void������д
 * 		û�о���ķ���ֵ
 * 
 * ���췽����ע�����
 * 		A:�������û�и������췽����ϵͳ������һ��Ĭ�ϵ��޲������췽��������ʹ��
 * 		B:������Ǹ����˹��췽����ϵͳ�������ṩĬ�ϵĹ��췽��������ʹ�á�
 * 			���ʱ�������������ʹ���޲������췽�����ͱ����Լ��ṩ��
 * 			�����Ƽ����Լ������޲������췽����
 * 		C:���췽��Ҳ�ǿ������صġ�
 * 
 * ����Ա������ֵ�ķ�ʽ��
 * 		A:ͨ��setXxx()
 * 		B:ͨ�����췽��
 */
public class Student {
	private String name;
	private int age;
	
	/*
	public Student() {
		System.out.println("���ǹ��췽��");
	}
	*/
	
	public Student() {}
	
	public Student(String name) {
		this.name = name;
	}
	
	public Student(int age) {
		this.age = age;
	}
	
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println(name+"---"+age);
	}
}

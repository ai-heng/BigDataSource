package com.itheima_04;
/*
 * �������Ӿ��嵽����
 * ʵ�֣��ӳ��󵽾���
 * ʹ�ã�ʹ�õ��Ǿ������Ķ���
 * 
 * ������
 * 		��������ʦ��
 * 			��Ա������name,age
 * 			���췽�����޲Σ�����
 * 			��Ա������getXxx(),setXxx(),teach(){}
 * 		��ҵ����ʦ��
 * 			��Ա������name,age
 * 			���췽�����޲Σ�����
 * 			��Ա������getXxx(),setXxx(),teach(){}
 * 
 * 		�������ʦ�ࣺ
 * 			��Ա������name,age
 * 			���췽�����޲Σ�����
 * 			��Ա������getXxx(),setXxx(),teach();
 */
public class TeacherDemo {
	public static void main(String[] args) {
		//ʹ�õ��Ǿ������Ķ���
		//BasicTeacher
		
		//��̬��ʽ�Ĳ���
		Teacher t = new BasicTeacher();
		t.setName("����ϼ");
		t.setAge(30);
		System.out.println(t.getName()+"---"+t.getAge());
		t.teach();
		System.out.println("---------------------------");
		
		t = new BasicTeacher("����ϼ", 30);
		System.out.println(t.getName()+"---"+t.getAge());
		t.teach();
	}
}

package com.itheima;
/*
 * ѧ������ʦ������
 * 
 * ѧ���ࣺ
 * 		��Ա������name,age
 * 		���췽�����޲�,����
 * 		��Ա������getXxx(),setXxx(),study()
 * ��ʦ�ࣺ
 * 		��Ա������name,age
 * 		���췽�����޲�,����
 * 		��Ա������getXxx(),setXxx(),teach()
 * ���Ƿ���������������ͬ�Ĵ���Ƚ϶࣬������ȡ��һ�����ࡣ
 * ���ࣺ
 * 		��Ա������name,age
 * 		���췽�����޲�,����
 * 		��Ա������getXxx(),setXxx()
 * ѧ���ࣺ
 * 		�̳�����
 * 		study()
 * ��ʦ�ࣺ
 * 		�̳�����
 * 		teach()
 */
public class ExtendsTest {
	public static void main(String[] args) {
		//ѧ����Ĳ���
		//setXxx()
		Student s1 = new Student();
		s1.setName("����ϼ");
		s1.setAge(30);
		System.out.println(s1.getName()+"---"+s1.getAge());
		s1.study();
		System.out.println("-------------");
		
		//���췽��
		Student s2 = new Student("����ϼ",30);
		System.out.println(s2.getName()+"---"+s2.getAge());
		s2.study();
	}
}

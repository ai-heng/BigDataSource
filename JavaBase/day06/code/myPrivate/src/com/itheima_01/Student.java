package com.itheima_01;
/*
 * ֱ��ʹ�ö��������ʳ�Ա��������������ݵİ�ȫ����
 * ���ʱ�����Ǿ�Ӧ��˼���ܲ�������粻Ҫֱ�ӷ��ʳ�Ա����?
 * ��
 * ���ʵ����?
 * 		��private�ؼ���
 * private:
 * 		��һ�����η�
 * 		�������γ�Ա������Ҳ�������γ�Ա����
 * 		��private���εĳ�Աֻ���ڱ����б�����
 * 
 * ��Ա�private���εĳ�Ա���������ǻ���Ӧ�ĸ���getXxx()��setXxx()���ڻ�ȡ�����ó�Ա������ֵ��
 * ������public����
 */
public class Student {
	String name;
	//int age;
	private int age;
	
	public void setAge(int a) {
		if(a<0 || a>200) {
			System.out.println("�������������");
		}else {
			age = a;
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public void show() {
		System.out.println(name+"***"+age);
	}
}

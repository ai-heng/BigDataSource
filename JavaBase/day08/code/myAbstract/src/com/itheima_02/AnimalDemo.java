package com.itheima_02;
/*
 * ��������ص㣺
 * 		A:������ͳ��󷽷�����ʹ��abstract�ؼ�������
 * 		B:�������в�һ���г��󷽷����г��󷽷�����һ���ǳ�����
 * 		C:�����಻��ʵ����
 * 			���������ʵ������?
 * 			���ն�̬�ķ�ʽ��ͨ���������ʵ������
 * 		D:�����������
 * 			Ҫô��д�������е����г��󷽷�
 * 			Ҫô�ǳ�����
 */
public class AnimalDemo {
	public static void main(String[] args) {
		//��������
		//Animal a = new Animal();
		//���ն�̬����ʽʵ����������
		Animal a = new Cat();
		a.eat();
		a.sleep();
	}
}

package com.itheima_02;
/*
 * ��̬�г�Ա�ķ����ص㣺
 * 		A:��Ա����
 * 			���뿴��ߣ�ִ�п���ߡ�
 * 		B:��Ա����
 * 			���뿴��ߣ�ִ�п��ұߡ�
 * 
 * 		Ϊʲô��Ա�����ͳ�Ա�����ķ��ʲ�һ����?
 * 			��Ϊ��Ա��������д��������û�С�
 */
public class DuoTaiDemo {
	public static void main(String[] args) {
		//��̬
		Animal a = new Cat();
		System.out.println(a.age);
		//System.out.println(a.weight);
		
		a.eat();
		//a.playGame();
	}
}

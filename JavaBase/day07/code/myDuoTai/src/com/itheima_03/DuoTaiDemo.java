package com.itheima_03;
/*
 * ��̬�ĺô�������˳������չ��
 * 		�������֣����巽����ʱ��ʹ�ø�������Ϊ������������ʹ�õ�ʱ��ʹ�þ���������Ͳ��������
 * ��̬�ı׶ˣ�����ʹ����������й���
 */
public class DuoTaiDemo {
	public static void main(String[] args) {
		AnimalOperator ao = new AnimalOperator();
		Cat c = new Cat();
		ao.useAnimal(c);
		
		Dog d = new Dog();
		ao.useAnimal(d);
		
		Pig p = new Pig();
		ao.useAnimal(p);
	}
}

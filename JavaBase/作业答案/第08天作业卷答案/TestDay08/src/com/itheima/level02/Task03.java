package com.itheima.level02;

/*
����������ɴ���:
	1.���嶯���ࣺ
		��Ϊ��
			��У�û�о���ĺ����Ϊ
			�Է�:û�о���ĳԷ���Ϊ
	2.���弩���ӿ�
		��Ϊ: 
			����
	3.���弩����:Ȯ��һ��
		��Ϊ��
			���:������
			�Է�:���й�ͷ
			����:�ñ�����ⶾ
	4.���������:
		ʹ�ö�̬����ʽ��������������,���ü��������ͺ�з���
 */
public class Task03 {
	public static void main(String[] args) {
		Animal a = new ����Ȯ();
		a.eat();
		a.���();
		����Ȯ j = (����Ȯ)a;
		j.����();
	}
}

abstract class Animal{
	public abstract void ���();
	public abstract void eat();
}

interface ����{
	public abstract void ����();
}

/*
���弩����:Ȯ��һ��
��Ϊ��
	���:������
	�Է�:���й�ͷ
	����:�ñ�����ⶾ
*/
class ����Ȯ extends Dog implements ����{
	@Override
	public void ����() {
		System.out.println("�ñ�����ⶾ");
	}
}

class Dog extends Animal{
	@Override
	public void ���() {
		System.out.println("������");
	}

	@Override
	public void eat() {
		System.out.println("���й�ͷ");
	}
}

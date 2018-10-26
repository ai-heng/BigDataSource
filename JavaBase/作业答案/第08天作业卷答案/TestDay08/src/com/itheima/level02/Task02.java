package com.itheima.level02;

/*
����������ɴ���:
1.�����ֻ���
	��Ϊ:
		��绰,������

2.����ӿ�IPlay
	��Ϊ:
		����Ϸ

3.������ֻ���̳��ֻ���
	��Ϊ:
		�̳и������Ϊ

4.�������ֻ��̳��ֻ���ʵ��IPlay�ӿ�
��Ϊ:�̳и������Ϊ,��д����Ϸ����

5.���������
	�ڲ������ж���һ�� ���ֻ��ķ���,Ҫ��÷������ܽ������ֻ�����,Ҳ�ܽ������ֻ�����
	�ڸ÷����ڲ����ô�绰,�������Լ����ֻ����е�����Ϸ����
 */
public class Task02 {
	public static void main(String[] args) {
		usePhone(new Phone());
		System.out.println("----------");
		usePhone(new NewPhone());
	}

	// ����һ�����ֻ��ķ���
	public static void usePhone(Phone p) { // Phone p = new OldPhone();
		if (p instanceof OldPhone) {
			OldPhone old = (OldPhone) p;
			old.call();
			old.sendMessage();
		} else if (p instanceof NewPhone) {
			NewPhone newPhone = (NewPhone) p;
			newPhone.call();
			newPhone.sendMessage();
			newPhone.playGame();
		} else {
			p.call();
			p.sendMessage();
		}
	}
}

class Phone{
//	��Ϊ:
//		��绰,������
	public void call(){
		System.out.println("��绰");
	}
	
	public void sendMessage(){
		System.out.println("������");
	}
}

class OldPhone extends Phone{}

interface IPlay{
	public abstract void playGame();
}

class NewPhone extends Phone implements IPlay{
	@Override
	public void playGame() {
		System.out.println("������ũҩ");
	}
}
package com.itheima_02;

//ƹ�����˶�Ա������
public class PingPangPlayer extends Player implements SpeakEnglish {

	public PingPangPlayer() {
	}

	public PingPangPlayer(String name, int age) {
		super(name, age);
	}

	@Override
	public void speak() {
		System.out.println("ƹ�����˶�Ա˵Ӣ��");
	}

	@Override
	public void study() {
		System.out.println("ƹ�����˶�Աѧϰ��η���ͽ���");
	}

	@Override
	public void eat() {
		System.out.println("ƹ�����˶�Ա�Դ�ײˣ���С����");
	}

}

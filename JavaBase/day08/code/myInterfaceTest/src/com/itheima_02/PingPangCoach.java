package com.itheima_02;
//ƹ�������������
public class PingPangCoach extends Coach implements SpeakEnglish {

	public PingPangCoach() {}
	
	public PingPangCoach(String name,int age) {
		super(name,age);
	}
	
	@Override
	public void speak() {
		System.out.println("ƹ�������˵Ӣ��");
	}

	@Override
	public void teach() {
		System.out.println("ƹ�����������η���ͽ���");
	}

	@Override
	public void eat() {
		System.out.println("ƹ���������С�ײˣ��ȴ�����");
	}

}

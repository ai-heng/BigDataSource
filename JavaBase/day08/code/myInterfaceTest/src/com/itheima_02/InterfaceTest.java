package com.itheima_02;
/*
 * �˶�Ա�ͽ�������
 */
public class InterfaceTest {
	public static void main(String[] args) {
		//�����˶�Ա
		//ƹ�����˶�Ա
		PingPangPlayer ppp = new PingPangPlayer();
		ppp.setName("����");
		ppp.setAge(33);
		System.out.println(ppp.getName()+"---"+ppp.getAge());
		ppp.eat();
		ppp.study();
		ppp.speak();
		//ͨ�����ι��췽������Ա������ֵ�ķ�ʽ(��Ȼ����ͬѧ��)
		System.out.println("---------------");
		
		//�����˶�Ա
		BasketballPlayer bp = new BasketballPlayer();
		bp.setName("Ҧ��");
		bp.setAge(35);
		System.out.println(bp.getName()+"---"+bp.getAge());
		bp.eat();
		bp.study();
		
		//���Խ����Ĵ�������ͬѧ��ʵ��
	}
}

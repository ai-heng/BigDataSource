package com.itheima_02;
/*
 * super��this���÷�����
 * 		this:��������������
 * 		super:������Ĵ洢�ռ�(�������Ϊ��������������)
 * 
 * �÷���
 * 		���ʳ�Ա������
 * 			this.��Ա����
 * 			super.��Ա����
 * 		���ʹ��췽����
 * 			this(...)
 * 			super(...)
 * 		���ʳ�Ա������
 * 			this.��Ա����()
 * 			super.��Ա����()
 */
public class Son extends Father {
	public int age = 20;
	
	public void printAge() {
		int age = 10;
		System.out.println(age);
		//��Ҫ���ʳ�Ա��Χ��age?
		System.out.println(this.age);
		//��Ҫ���ʸ����Ա��Χ��age?
		System.out.println(super.age);
	}
}

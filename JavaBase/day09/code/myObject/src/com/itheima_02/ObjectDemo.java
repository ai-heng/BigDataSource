package com.itheima_02;
/*
 * ==:
 * 		���ԱȽϻ����������ͣ��Ƚϻ����������͵�ʱ��Ƚϵ��ǻ����������͵�ֵ�Ƿ���ͬ
 * 		Ҳ���ԱȽ������������ͣ��Ƚ������������͵�ʱ��Ƚϵ��������������͵ĵ�ֵַ�Ƿ���ͬ
 * 
 * ������������Ƚϵ��Ƕ���������Ƿ���ͬ?����ô����?
 * ͨ���鿴API�������ҵ��˱Ƚ϶����Ƿ���ȵķ�����
 * public boolean equals(Object obj)
 * Object���е�equals()����Ĭ�ϱȽϵ��Ƕ���ĵ�ַ�Ƿ���ͬ��
 * ���������Ƚ϶���������Ƿ���ͬ���ͱ����Լ���д�÷�����
 * �����д�÷�����?
 * 		�Զ����ɼ��ɡ�
 */
public class ObjectDemo {
	public static void main(String[] args) {
		Student s1 = new Student("����ϼ", 30);
		Student s2 = new Student("����ϼ", 30);
		
		//System.out.println(s1 == s2);//false
		
		System.out.println(s1.equals(s2));//false
		/*
	    public boolean equals(Object obj) {
	    	//this -- s1
	    	//obj -- s2
	        return (this == obj);
	    }
	    */
	}
}

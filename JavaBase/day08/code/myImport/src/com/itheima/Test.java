package com.itheima;
/*
 * ������
 * 		import ����;
 */
import cn.itcast.Teacher;

public class Test {
	public static void main(String[] args) {
		Student s = new Student();
		s.show();
		
		/*
		//��Ҫʹ��Teacher�µ�method()����
		//�಻��ͬһ�����£�ʹ�õ�ʱ��Ҫ�����ȫ·������
		cn.itcast.Teacher t = new cn.itcast.Teacher();
		t.method();
		t.method();
		
		cn.itcast.Teacher t2 = new cn.itcast.Teacher();
		t2.method();
		//������̫�鷳�ˣ�java���ṩ��һ�������Ĺ���
		 * 
		 */
		
		Teacher t = new Teacher();
		t.method();
		
	}
}

package com.itheima;
/*
 * continue:��������˼
 * 
 * ʹ�ó�����
 * 		ѭ���С��뿪ʹ�ó�����û������ġ�
 * 
 * break��continue������
 * 		break:��������ѭ��
 * 		continue:������һ�εĲ�����������һ�ε�ִ��
 */
public class ContinueDemo {
	public static void main(String[] args) {
		for(int x=1; x<=5; x++) {
			if(x == 3) {
				continue;
			}
			System.out.println("HelloWorld"+x);
		}
	}
}

package com.itheima;
/*
 * �������������ͼ��
 *			*
 *			**
 *			***
 *			****
 *			*****
 */
public class ForForTest {
	public static void main(String[] args) {
		//ͨ���򵥵Ĺ۲죬���Ƿ�������һ��5�еģ������仯����״
		//������ʵ��һ��5��5�е���״
		for(int x=1; x<=5; x++) {
			for(int y=1; y<=5; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------------");
		
		//��Ȼ����ʵ����һ��5��5�е���״
		//�����ⲻ��������Ҫ��
		//����Ҫ����״�������仯��
		//��ô����?
		//��һ�У�1	y=1; y<=1
		//�ڶ��У�2	y=1; y<=2
		//�����У�3	y=1; y<=3
		//�����У�4	y=1; y<=4
		//�����У�5	y=1; y<=5
		//������Ҫһ�������ı����Ǵ�1��ʼ����5����
		int z = 1;
		for(int x=1; x<=5; x++) {
			for(int y=1; y<=z; y++) {
				System.out.print("*");
			}
			System.out.println();
			z++;
		}
		System.out.println("----------------------");
		
		//���������Ѿ�ʵ�������ǵ����󣬵������Ǽ����۲�ᷢ��
		//��һ�Σ�x��ֵ��1
		//�ڶ��Σ�x��ֵ��2
		//...
		//x��z��һ���ı仯���̣������Ļ������ǾͿ���ʡ��z��ֱ����x���
		for(int x=1; x<=5; x++) {
			for(int y=1; y<=x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------------");
	}
}

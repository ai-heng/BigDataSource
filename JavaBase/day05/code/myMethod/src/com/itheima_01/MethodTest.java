package com.itheima_01;

import java.util.Scanner;

/*
 * ���󣺼���¼���������ݣ������������еĽϴ�ֵ
 * 
 * ˼����
 * 		����¼���������ݵĶ�����������ȽϺ�����?
 * 		�������¼�����ݵĶ��������˷����������еĽϴ�ֵ�ķ������棬��ô����������뷵�ؼ���¼��
 * 		�����ݵĽϴ�ֵ���Ҿ��뷵�������̶�ֵ�Ľϴ�ֵ�������ǲ����ֵ��޸Ĵ����ˡ����ʱ����
 * 		�ǲ������ģ���������Ӧ�ðѼ���¼�����ݵĶ�������main�����С�
 * 
 * ����ϰ�����⣺
 * 		�ࣺ
 * 			�����һ�����ʣ�����ĸ��д��Student
 * 			����Ƕ�����ʣ�ÿ�����ʵ�����ĸ��д��HelloWorld
 * 
 * 		�������ͱ�����������һ���Ĺ���
 * 			�����һ�����ʣ�����ĸСд��sum()
 * 			����Ƕ�����ʣ��ӵڶ������ʿ�ʼ��ÿ����������ĸ��д��getMax()
 */
public class MethodTest {
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		//��ȡ����
		System.out.println("�������һ�����ݣ�");
		int a = sc.nextInt();
		
		System.out.println("������ڶ������ݣ�");
		int b = sc.nextInt();
		
		//���÷���
		int max = getMax(a,b);
		
		//������
		System.out.println("max:"+max);
	}
	
	/*
	 * �����������еĽϴ�ֵ
	 * 
	 * ������ȷ��
	 * 		����ֵ���ͣ�int
	 * 		�����б���int a,int b
	 */
	public static int getMax(int a,int b) {
		if(a > b) {
			return a;
		}else {
			return b;
		}
	}
}
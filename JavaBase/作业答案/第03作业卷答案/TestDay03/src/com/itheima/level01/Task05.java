package com.itheima.level01;
/*
 * 	2��һ�д�ӡˮ�ɻ������м��ÿո������,����ӡˮ�ɻ��������
 */
public class Task05 {
	public static void main(String[] args) {
		int count = 0;
		//ͨ��ѭ����ȡ��ÿһ����λ��
		for(int x=100; x<1000; x++) {
			//��ȡ��λ��ʮλ����λ
			int ge = x%10;
			int shi = x/10%10;
			int bai = x/10/10%10;
			if(ge*ge*ge+shi*shi*shi+bai*bai*bai== x) {				
				System.out.print(x+" ");
				count++;
				if(count%2==0)
					System.out.println();
			}
		}
		System.out.println("�ܹ��� "+count+" ��ˮ�ɻ���");
	}
}

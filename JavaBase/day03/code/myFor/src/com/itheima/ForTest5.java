package com.itheima;
/*
 * ����ͳ�ơ�ˮ�ɻ��������ж��ٸ�
 * 
 * ������
 * 		A:����ͳ�Ʊ�������ʼ��ֵ��0
 * 		B:��ȡ��λ������forѭ��ʵ��
 * 		C:��ȡÿ��λ�ϵ�����
 * 		D:�ж������Ƿ���ˮ�ɻ���
 * 			����ǣ���ͳ�Ʊ���++
 * 		E:���ͳ�Ʊ���
 */
public class ForTest5 {
	public static void main(String[] args) {
		//����ͳ�Ʊ�������ʼ��ֵ��0
		int count = 0;
		
		//��ȡ��λ������forѭ��ʵ��
		for(int x=100; x<1000; x++) {
			//��ȡÿ��λ�ϵ�����
			int ge = x%10;
			int shi = x/10%10;
			int bai = x/10/10%10;
			
			//�ж������Ƿ���ˮ�ɻ���
			if((ge*ge*ge+shi*shi*shi+bai*bai*bai) == x){
				//����ǣ���ͳ�Ʊ���++
				count++;
			}
		}
		
		//���ͳ�Ʊ���
		System.out.println("ˮ�ɻ��ĸ����ǣ�"+count);
	}
}

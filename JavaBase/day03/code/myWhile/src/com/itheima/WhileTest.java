package com.itheima;
/*
 * ������1-100֮������ݺ͡�
 */
public class WhileTest {
	public static void main(String[] args) {
		//forѭ��ʵ��
		/*
		//������ͱ���
		int sum = 0;
		
		for(int x=1; x<=100; x++) {
			//�ۼӼ���
			sum += x;
		}
		
		//������
		System.out.println("sum:"+sum);
		*/
		
		//whileѭ��ʵ��
		//������ͱ���
		int sum = 0;
		
		int x=1;
		while(x<=100) {
			//�ۼӼ���
			sum += x;
			x++;
		}
		
		//������
		System.out.println("sum:"+sum);
	}
}

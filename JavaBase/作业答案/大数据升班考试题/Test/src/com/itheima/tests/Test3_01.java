package com.itheima.tests;
/*
 * ����: ��1-100֮�����е�����, ����5��һ��,�м��ÿո�����ĸ�ʽ��ӡ������̨��.
	��ʽ����
	������һ��ֻ�ܱ�1����������������  2  3  5  7  11  13  17  19 
	
 */
public class Test3_01 {
	public static void main(String[] args) {
		
		int count = 0;
		
		for (int i = 2; i < 100; i++) {//13
			boolean flag = true;//������Ϊi��һ������
			for (int j = 2; j < i; j++) {
				if(i%j==0){
					//����һ������
					flag = false;//���������Ա�������������ѱ�ʶλ��Ϊfalse
				}
			}
//			if(flag==true){
			if(flag){
				System.out.print(i +" ");
				count++;
				if(count%5==0){
					System.out.println();
				}
			}
		}
	}
}

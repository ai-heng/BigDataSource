package com.itheima.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * ����:ѭ�������û���������Ķ���ַ�����ֱ���û�¼�롰end��ʱѭ������������������������ַ������ֵ�˳�����ӡ��.
	��ʾ:
	1.	����ArrayList����, ��������Ԫ��.
	2.	����Collections�������еķ����Լ��Ͻ������򼴿�.

 */
public class Test2_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<>();
		while(true){//¼����ٸ��ַ��������ǲ�֪�� ������������������ѭ��
			System.out.println("������һ���ַ���");
			String s = sc.nextLine();
			if(s.equals("end")){
				break;
			}
			list.add(s);
		}
		
		//�������򼯺�
//		Collections.sort(list,Collections.reverseOrder());
//		Collections.sort(list);//����
//		Collections.reverse(list);//��ת
		Collections.sort(list);
		for (int i = 0,j=list.size()-1; i < j; i++,j--) {
			String i1 = list.get(i);
			String j1 = list.get(j);
			list.set(i, j1);
			list.set(j, i1);
		}
		
		System.out.println(list);
		
		
		
	}
}

package com.itheima.tests;
/*
 * ��֪�ַ��� String str = "goOd gooD stUdy dAy dAy up"; 
����: ��ÿ�����ʵ�����ĸת���ɴ�д������ĸת��Сд,Ȼ�󽫽����ӡ������̨��. 
	(����ֱ�����Good Good Study Day Day Up Ҫ�ô���ʵ��)
 

��ʾ:
1.	���ַ������տո�����и�.
2.	����,��ȡ��ÿһ���ַ���,����ĸ��д����Сд.
3.	ƴ�ӳ��µ��ַ���, Ȼ���ӡ������̨��.

 */
public class Test2_01 {
	public static void main(String[] args) {
		String str = "goOd gooD stUdy dAy dAy up"; 
		
		String[] split = str.split(" ");
		
		String news = "";
		
		for (int i = 0; i < split.length; i++) {
			String s = split[i];
			//��ȫ����ĸ���Сд
			s = s.toLowerCase();
//			news+=(char)(s.charAt(0)-32);
//			news+=s.substring(1);//�ӵ�һ��λ�ÿ�ʼ��ȡ�ַ�������ȡ�����һ���ַ�����ӵ�news��
			//��ĳ������λ�ÿ�ʼ��ȡ�ַ�������ȡ�����һ���ַ�
			//�����ַ���
			for (int j = 0; j < s.length(); j++) {
				//����ǵ�һ���ַ��Ļ���ת�ɴ�д�ڷŵ�news��
				if(j==0){
					news+=(char)(s.charAt(j)-32);
				}else{
					//������ǵ�һ���ַ�����ֱ���ӵ�news�� ��ok
					news+=s.charAt(j);
				}
			}
			news+=" ";
		}
		System.out.println(news);
	}
}

package com.itheima;

import java.util.Date;

/*
 * public long getTime():��ȡ���Ǻ���ֵ����1970��1��1�� 00:00:00��ʼ�ġ�
 * public void setTime(long time):����ʱ�䣬�����Ǻ���ֵ��
 * 
 * ��Date�õ�һ������ֵ��
 * 		getTime()
 * 
 * ��һ������ֵ�õ�һ��Date����
 * 		���췽��
 * 		setTime(long time)
 */
public class DateDemo2 {
	public static void main(String[] args) {
		//��������
		Date d = new Date();
		
		//public long getTime()
		System.out.println(d.getTime());
		
		//public void setTime(long time)
		d.setTime(1000*60*60);
		System.out.println(d.getTime());
	}
}

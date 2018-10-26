package com.itheima.level01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * ���ڹ�����
 * 
 * ���췽��˽��
 * ��Ա������̬
 */

public class DateUtil {
	private DateUtil() {}

	/*
	 * ������ת��Ϊָ����ʽ���ַ��� ������ȷ�� ����ֵ���ͣ�String �����б�Date date, String format
	 */
	public static String dateToString(Date date, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String s = sdf.format(date);
		return s;
	}

	/*
	 * ��ָ����ʽ���ַ�������Ϊ���� ������ȷ�� ����ֵ���ͣ�Date �����б�String s, String format
	 */
	public static Date stringToDate(String s, String format) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date d = sdf.parse(s);
		return d;
	}
}

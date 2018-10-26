package com.itheima;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * ���ڸ�ʽ�Ĺ����࣬�ṩһЩ���õĲ��������������ݵķ�����
 */
public class DateUtil {

	/**
	 * ���ݸ��������ڸ�ʽ�������ַ�������Ϊ���ڶ���
	 * 
	 * @param dateString
	 *            �����ַ���
	 * @param pattern
	 *            ���������ڸ�ʽ,���Ϊnull��Ĭ��ʹ��"yyyy-MM-dd HH:mm:ss"��ʽ
	 * @return Date �����������
	 */
	public static Date convertStringToDate(String dateString, String pattern) {
		Date date = null;
		if (pattern == null || pattern.trim().equals("")) {
			pattern = "yyyy-MM-dd HH:mm:ss";
		}
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);

		try {
			date = sdf.parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	/**
	 * ����Ĭ�ϵ�"yyyy-MM-dd HH:mm:ss"��ʽ���������ַ�������Ϊ���ڶ���
	 * 
	 * @param dateString
	 *            �����ַ���
	 * @return �����������
	 */
	public static Date convertStringToDate(String dateString) {
		return convertStringToDate(dateString, "yyyy-MM-dd HH:mm:ss");
	}

	/**
	 * ���ݸ��������ڸ�ʽ�����ڽ���Ϊ�����ַ���
	 * 
	 * @param date
	 *            ����
	 * @param pattern
	 *            ���������ڸ�ʽ,���Ϊnull��Ĭ��ʹ��"yyyy-MM-dd HH:mm:ss"��ʽ
	 * @return String ������������ַ���
	 */
	public static String convertDateToString(Date date, String pattern) {
		String dateString = null;
		if (pattern == null || pattern.trim().equals("")) {
			pattern = "yyyy-MM-dd HH:mm:ss";
		}
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		dateString = sdf.format(date);
		return dateString;
	}

	/**
	 * ����Ĭ�ϵ�"yyyy-MM-dd HH:mm:ss"��ʽ�������ڽ���Ϊ�����ַ���
	 * 
	 * @param date
	 *            ����
	 * @return String ������������ַ���
	 */
	public static String convertDateToString(Date date) {
		return convertDateToString(date, "yyyy-MM-dd HH:mm:ss");
	}

	/**
	 * ���ݸ��������ڸ�ʽ���Ƚ������ַ�����ʽ���ڵĴ�С
	 * 
	 * @param date1
	 *            �����ַ���1
	 * @param date2
	 *            �����ַ��� 2
	 * @param pattern
	 *            ���ڸ�ʽ(���Ϊ�գ�Ĭ��"yyyy-MM-dd HH:mm:ss")
	 * @return 
	 * 		������� date2 ���� date1���򷵻�ֵ 0��
	 * 		��� date1 �� date2 ����֮ǰ���򷵻�С�� 0 ��ֵ��
	 * 		��� date1 �� date2 ����֮���򷵻ش��� 0 ��ֵ��
	 * @throws ParseException 
	 */
	public static int compareDateThan(String date1, String date2, String pattern) throws ParseException {

		if (pattern == null || pattern.trim().equals("")) {
			pattern = "yyyy-MM-dd HH:mm:ss";
		}
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.parse(date1).compareTo(sdf.parse(date2));
	}

	/**
	 * ������������֮����������
	 * 
	 * @param smdate
	 *            ��С��ʱ��
	 * @param bdate
	 *            �ϴ��ʱ��
	 * @return �������
	 * @throws ParseException
	 * @throws NumberFormatException 
	 */
	public static int daysBetween(Date smdate, Date bdate)
			throws ParseException, NumberFormatException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		smdate = sdf.parse(sdf.format(smdate));
		bdate = sdf.parse(sdf.format(bdate));
		Calendar cal = Calendar.getInstance();
		cal.setTime(smdate);
		long time1 = cal.getTimeInMillis();
		cal.setTime(bdate);
		long time2 = cal.getTimeInMillis();
		long between_days = (time2 - time1) / (1000 * 3600 * 24);

		return Integer.parseInt(String.valueOf(between_days));
	}

	/**
	 * ���������ַ���������֮����������
	 * 
	 * @param smdate
	 *            ��С��ʱ��
	 * @param bdate
	 *            �ϴ��ʱ��
	 * @return �������
	 * @throws ParseException
	 */
	public static int daysBetween(String smdate, String bdate)
			throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		cal.setTime(sdf.parse(smdate));
		long time1 = cal.getTimeInMillis();
		cal.setTime(sdf.parse(bdate));
		long time2 = cal.getTimeInMillis();
		long between_days = (time2 - time1) / (1000 * 3600 * 24);

		return Integer.parseInt(String.valueOf(between_days));
	}
}

package com.itheima;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期格式的工具类，提供一些常用的操作日期类型数据的方法。
 */
public class DateUtil {

	/**
	 * 根据给定的日期格式将日期字符串解析为日期对象
	 * 
	 * @param dateString
	 *            日期字符串
	 * @param pattern
	 *            给定的日期格式,如果为null则默认使用"yyyy-MM-dd HH:mm:ss"格式
	 * @return Date 解析后的日期
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
	 * 采用默认的"yyyy-MM-dd HH:mm:ss"格式，将日期字符串解析为日期对象
	 * 
	 * @param dateString
	 *            日期字符串
	 * @return 解析后的日期
	 */
	public static Date convertStringToDate(String dateString) {
		return convertStringToDate(dateString, "yyyy-MM-dd HH:mm:ss");
	}

	/**
	 * 根据给定的日期格式将日期解析为日期字符串
	 * 
	 * @param date
	 *            日期
	 * @param pattern
	 *            给定的日期格式,如果为null则默认使用"yyyy-MM-dd HH:mm:ss"格式
	 * @return String 解析后的日期字符串
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
	 * 采用默认的"yyyy-MM-dd HH:mm:ss"格式，将日期解析为日期字符串
	 * 
	 * @param date
	 *            日期
	 * @return String 解析后的日期字符串
	 */
	public static String convertDateToString(Date date) {
		return convertDateToString(date, "yyyy-MM-dd HH:mm:ss");
	}

	/**
	 * 根据给定的日期格式，比较两个字符串格式日期的大小
	 * 
	 * @param date1
	 *            日期字符串1
	 * @param date2
	 *            日期字符串 2
	 * @param pattern
	 *            日期格式(如果为空，默认"yyyy-MM-dd HH:mm:ss")
	 * @return 
	 * 		如果参数 date2 等于 date1，则返回值 0；
	 * 		如果 date1 在 date2 参数之前，则返回小于 0 的值；
	 * 		如果 date1 在 date2 参数之后，则返回大于 0 的值。
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
	 * 计算两个日期之间相差的天数
	 * 
	 * @param smdate
	 *            较小的时间
	 * @param bdate
	 *            较大的时间
	 * @return 相差天数
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
	 * 计算两个字符串的日期之间相差的天数
	 * 
	 * @param smdate
	 *            较小的时间
	 * @param bdate
	 *            较大的时间
	 * @return 相差天数
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

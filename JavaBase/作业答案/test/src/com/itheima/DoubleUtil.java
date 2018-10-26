package com.itheima;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * ������ṩ��ȷ�ĸ��������㣬���������ļӼ��˳����������
 * @author SuperHan
 * @version 1.0
 *
 */
public class DoubleUtil {
	
	public static final int DEF_DIV_SCALE = 10; // Ĭ�ϱ�������ЧС��λ��
	
	// ���಻�ܱ�ʵ����
	private DoubleUtil(){}
	
	/**
	 * ����double����ֵΪ��value1 + value2��
	 * @param value1 ��������ĵ�һ��������
	 * @param value2 ��������ĵڶ���������
	 * @return ���أ�value1 + value2��
	 */
	public static double add(double value1, double value2) {
		BigDecimal bd1 = new BigDecimal(Double.toString(value1));
		BigDecimal bd2 = new BigDecimal(Double.toString(value2));
		return bd1.add(bd2).doubleValue();
	}
	
	/**
	 * ����double����ֵΪ��minuend - subtrahend��
	 * @param minuend ������
	 * @param subtrahend ����
	 * @return minuend - subtrahend
	 */
	public static double subtract(double minuend, double subtrahend) {
		BigDecimal bd1 = new BigDecimal(Double.toString(minuend));
		BigDecimal bd2 = new BigDecimal(Double.toString(subtrahend));
		return bd1.subtract(bd2).doubleValue();
	}
	
	/**
	 * ����double����ֵΪ��value1 * value2��
	 * @param value1 ��������ĵ�һ��������
	 * @param value2 ��������ĵڶ���������
	 * @return ���أ�value1 * value2��
	 */
	public static double multiply(double value1, double value2) {
		BigDecimal bd1 = new BigDecimal(Double.toString(value1));
		BigDecimal bd2 = new BigDecimal(Double.toString(value2));
		return bd1.multiply(bd2).doubleValue();
	}
	
	/**
	 * ����double����ֵΪ��dividend / divisor������Ҫָ��������ʱ����ЧС��λ���Լ�����ģʽ
	 * @param dividend ������
	 * @param divisor ����
	 * @param scale ������ЧС��λ��
	 * @param rm ����ģʽ������ο�RoundingMode��
	 * @return ���أ�dividend / divisor��
	 */
	public static double divide(double dividend, double divisor, int scale, RoundingMode rm) {
		if (scale < 0) {
			throw new IllegalArgumentException("The scale must be a positive integer or zero");
		}
		BigDecimal bd1 = new BigDecimal(Double.toString(dividend));
		BigDecimal bd2 = new BigDecimal(Double.toString(divisor));
		BigDecimal shang = bd1.divide(bd2, scale, rm);
		return shang.doubleValue();
	}
	
	/**
	 * ����double����ֵΪ��dividend / divisor����������ʱĬ�ϲ�����������ģʽ
	 * @param dividend ������
	 * @param divisor ����
	 * @param scale ������ЧС��λ��
	 * @return ���أ�dividend / divisor��
	 */
	public static double divide(double dividend, double divisor, int scale) {
		if (scale < 0) {
			throw new IllegalArgumentException("The scale must be a positive integer or zero");
		}
		BigDecimal bd1 = new BigDecimal(Double.toString(dividend));
		BigDecimal bd2 = new BigDecimal(Double.toString(divisor));
		BigDecimal shang = bd1.divide(bd2, scale, RoundingMode.HALF_UP);
		return shang.doubleValue();
	}
	
	/**
	 * ����double����ֵΪ��dividend / divisor����������ʱĬ�ϱ���10λ��ЧС��λ����������������ģʽ
	 * @param dividend ������
	 * @param divisor ����
	 * @return ���أ�dividend / divisor��
	 */
	public static double divide(double dividend, double divisor) {
		return divide(dividend, divisor, DEF_DIV_SCALE, RoundingMode.HALF_UP);
	}
	
	/**
	 * �ṩ��ȷ��С��λ�������봦��
	 * 
	 * @param value
	 *            ��Ҫ�������������
	 * @param scale
	 *            С���������λ
	 * @return ���������Ľ��
	 */
	public static double round(double value, int scale) {
		if (scale < 0) {
			throw new IllegalArgumentException("The scale must be a positive integer or zero");
		}
		BigDecimal b = new BigDecimal(Double.toString(value));
		BigDecimal one = new BigDecimal("1");
		return b.divide(one, scale, RoundingMode.HALF_UP).doubleValue();
	}

}

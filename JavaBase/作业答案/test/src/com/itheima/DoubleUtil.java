package com.itheima;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 这个类提供精确的浮点数运算，包括常见的加减乘除和舍入操作
 * @author SuperHan
 * @version 1.0
 *
 */
public class DoubleUtil {
	
	public static final int DEF_DIV_SCALE = 10; // 默认保留的有效小数位数
	
	// 本类不能被实例化
	private DoubleUtil(){}
	
	/**
	 * 返回double，其值为（value1 + value2）
	 * @param value1 参与运算的第一个浮点数
	 * @param value2 参与运算的第二个浮点数
	 * @return 返回（value1 + value2）
	 */
	public static double add(double value1, double value2) {
		BigDecimal bd1 = new BigDecimal(Double.toString(value1));
		BigDecimal bd2 = new BigDecimal(Double.toString(value2));
		return bd1.add(bd2).doubleValue();
	}
	
	/**
	 * 返回double，其值为（minuend - subtrahend）
	 * @param minuend 被减数
	 * @param subtrahend 减数
	 * @return minuend - subtrahend
	 */
	public static double subtract(double minuend, double subtrahend) {
		BigDecimal bd1 = new BigDecimal(Double.toString(minuend));
		BigDecimal bd2 = new BigDecimal(Double.toString(subtrahend));
		return bd1.subtract(bd2).doubleValue();
	}
	
	/**
	 * 返回double，其值为（value1 * value2）
	 * @param value1 参与运算的第一个浮点数
	 * @param value2 参与运算的第二个浮点数
	 * @return 返回（value1 * value2）
	 */
	public static double multiply(double value1, double value2) {
		BigDecimal bd1 = new BigDecimal(Double.toString(value1));
		BigDecimal bd2 = new BigDecimal(Double.toString(value2));
		return bd1.multiply(bd2).doubleValue();
	}
	
	/**
	 * 返回double，其值为（dividend / divisor），需要指定除不尽时的有效小数位数以及舍入模式
	 * @param dividend 被除数
	 * @param divisor 除数
	 * @param scale 保留有效小数位数
	 * @param rm 舍入模式（建议参考RoundingMode）
	 * @return 返回（dividend / divisor）
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
	 * 返回double，其值为（dividend / divisor），除不尽时默认采用四舍五入模式
	 * @param dividend 被除数
	 * @param divisor 除数
	 * @param scale 保留有效小数位数
	 * @return 返回（dividend / divisor）
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
	 * 返回double，其值为（dividend / divisor），除不尽时默认保留10位有效小数位，并采用四舍五入模式
	 * @param dividend 被除数
	 * @param divisor 除数
	 * @return 返回（dividend / divisor）
	 */
	public static double divide(double dividend, double divisor) {
		return divide(dividend, divisor, DEF_DIV_SCALE, RoundingMode.HALF_UP);
	}
	
	/**
	 * 提供精确的小数位四舍五入处理。
	 * 
	 * @param value
	 *            需要四舍五入的数字
	 * @param scale
	 *            小数点后保留几位
	 * @return 四舍五入后的结果
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

package com.itheima_01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * SimpleDateFormat:是一个以与语言环境有关的方式来格式化和解析日期的具体类。
 * 它允许进行格式化（日期 -> 文本）、解析（文本 -> 日期）
 * 
 * 格式化（日期 -> 文本）: Date -- String
 * 		public final String format(Date date)
 * 
 * 解析（文本 -> 日期）:  String -- Date
 * 		public Date parse(String source)
 */
public class SimpleDateFormatDemo {
	public static void main(String[] args) throws ParseException {
		/*
		//Date -- String
		Date d = new Date();
		//SimpleDateFormat(): 用默认的模式
		//SimpleDateFormat sdf = new SimpleDateFormat();
		//SimpleDateFormat(String pattern):用给定的模式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		String s = sdf.format(d);
		//现在虽然实现了把日期格式化成一个字符串，但是不是我们想要的格式
		//我们想要的格式是：xxxx年xx月xx日 xx:xx:xx
		System.out.println(s);
		*/
		
		//String -- Date
		String str = "2080-08-08 12:23:45";
		//把一个字符串解析为日期的时候，请注意模式字符串和给定的日期字符串的格式要匹配
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = sdf.parse(str);
		System.out.println(d);
	}
}

package com.itheima_01;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
 * 编码
 * 把看得懂的变成看不懂的
 * public byte[] getBytes(String charsetName) throws UnsupportedEncodingException
 * 使用指定的字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。 
 * 
 * 解码
 * 把看不懂的变成看得懂的
 * public String(byte[] bytes, String charsetName)
 * 通过使用指定的 charset解码指定的 byte 数组，构造一个新的 String。
 */
public class StringDemo {
	public static void main(String[] args) throws UnsupportedEncodingException {
		//定义一个字符串
		String s = "你好";
		
		//编码
		//byte[] bys = s.getBytes();//使用平台的默认字符集将此 String 编码为 byte 序列
		//默认编码是GBK
		//[-60, -29, -70, -61]
		//byte[] bys = s.getBytes("GBK"); //指定编码GBK
		//[-60, -29, -70, -61]
		byte[] bys = s.getBytes("UTF-8"); //指定编码UTF-8
		//[-28, -67, -96, -27, -91, -67]
		System.out.println(Arrays.toString(bys));
		
		//解码
		//String ss = new String(bys); //通过使用平台的默认字符集解码指定的 byte 数组
//		String ss = new String(bys,"GBK");//指定编码GBK
		String ss = new String(bys,"UTF-8");//指定编码UTF-8
		System.out.println(ss);
	}
}

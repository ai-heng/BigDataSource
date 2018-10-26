package com.itheima;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 异常处理方案2：throws
 * 
 * 我们通过try...catch可以对异常进行处理了，但是并不是所有的时候我们都有权限进行异常的处理。
 * 也就是说，有些时候我们处理不了，但是，这个时候异常时存在的，不处理也不行，怎么办?
 * 这个时候，Java就提供了throws的处理方案。
 * 
 * 格式：
 * 		throws 异常类名
 * 		注意：这个格式必须跟在方法的括号的后面
 * 
 * 注意：
 * 		编译时异常时必须要进行处理的，两种处理方案：try...catch...或者throws
 * 		如果你采用了throws这种方案，将来谁调用，还得进行处理。
 * 
 * 		运行时异常可以不用处理，出现问题后我们需要回来修改代码。
 */
public class ExceptionDemo5 {
	public static void main(String[] args) {
		System.out.println("程序开始执行");
		try {
			method();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		method2();
		System.out.println("程序结束执行");
	}
	
	//编译时异常
	public static void method() throws ParseException {
		String s = "2088-08-08";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d = sdf.parse(s);
		System.out.println(d);
	}
	
	//运行时异常
	public static void method2() throws ArithmeticException {
		int a = 10;
		int b = 0;
		System.out.println(a/b);
	}
	
}

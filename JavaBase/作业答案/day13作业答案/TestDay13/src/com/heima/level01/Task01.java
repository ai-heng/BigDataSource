package com.heima.level01;

public class Task01 {
	/**
	 *  一、	需求说明：编写代码，产生ArithmeticException异常，并使用try..catch进行处理。
		二、	处理方式：将异常信息输出在控制台
		
		分析:
			1.	编写打印语句 xx / 0 将问题产生。
			2.	使用try语句对其包裹。
			3.	在catch小括中编写对应的ArithmeticException进行捕获。
			4.	使用printStackTrace方法将异常信息输出在控制台。

	 */
	public static void main(String[] args) {
		//2.使用try语句对其包裹。
		try {
			
			//1.编写打印语句 xx / 0 将问题产生。
			System.out.println(10 / 0);
			
		//3.在catch小括中编写对应的ArithmeticException进行捕获。
		} catch (ArithmeticException e) {
			
			//4.使用printStackTrace方法将异常信息输出在控制台。
			e.printStackTrace();
		
		}
		
	}
}

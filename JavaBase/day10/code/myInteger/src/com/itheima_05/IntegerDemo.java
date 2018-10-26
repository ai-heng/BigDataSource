package com.itheima_05;
/*
 * JDK5新特性：
 * 自动装箱：把基本数据类型转换为对应的包装类类型
 * 		public static Integer valueOf(int i)
 * 自动拆箱：把包装类类型转换为对应的基本数据类型
 * 		public int intValue()
 * 
 * Java程序的运行：
 * 		编写java文件 -- 编译生成class文件 -- 执行
 * 
 * 注意：在使用包装类类型的新特性的时候，如果做操作，最好先判断是否为null。
 * 
 * 开发中的原则：
 * 		只要是对象，在使用前就必须进行不为null的判断。
 */
public class IntegerDemo {
	public static void main(String[] args) {
		//创建一个包装类类型的对象
		//Integer i = new Integer(100);
		Integer ii = 100; //自动装箱	
		//public static Integer valueOf(int i)
		ii += 200; //ii = ii + 200; 自动拆箱,自动装箱
		//public int intValue()
		System.out.println(ii);
		
		/*
		Integer ii = Integer.valueOf(100);
		ii = Integer.valueOf(ii.intValue() + 200);
		System.out.println(ii);
		*/
		
		Integer iii = null;
		if(iii != null) {
			iii += 300; //NullPointerException
			System.out.println(iii);
		}
	}
}

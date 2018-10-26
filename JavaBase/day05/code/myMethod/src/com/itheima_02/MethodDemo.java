package com.itheima_02;
/*
 * 需求：写一个方法，在控制台输出10次HelloWorld案例
 * 
 * 两个明确：
 * 		返回值类型：void
 * 		参数列表：没有参数
 * 
 * 如果一个方法没有明确的返回值类型，也不能把返回值类型的地方空出来。
 * 这里应该写void表示该方法无返回值类型。
 * 
 * 方法调用：(void修饰的方法)
 * 		只能单独调用
 */
public class MethodDemo {
	public static void main(String[] args) {
		//单独调用
		printHelloWorld();
		
		//输出调用
		//System.out.println(printHelloWorld());
		
		//赋值调用
		//void v = printHelloWorld();
	}
	
	/*
	 * 写一个方法，在控制台输出10次HelloWorld案例
	 * 
	 * 两个明确：
	 * 		返回值类型：void
	 * 		参数列表：
	 */
	public static void printHelloWorld() {
		/*
		for(int x=1; x<=10; x++) {
			System.out.println("HelloWorld");
		}
		*/
		
		for(int x=0; x<10; x++) {
			System.out.println("HelloWorld");
		}
	}
}

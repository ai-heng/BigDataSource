package com.itheima;
/*
 * 三种循环语句可以完成相同的事情，但是也是有小区别的：
 * 		do...while循环语句至少执行一次循环体。
 * 		而for和while循环语句要先进行条件的判断，然后看是否执行循环体语句。
 * 
 * for循环和while循环的小区别：
 * 		for循环结束后，初始化的变量不能被使用了。
 * 		而while循环结束后，初始化的变量还可以继续被使用。
 * 
 * 推荐使用的顺序：
 * 		for -- while -- do...while
 */
public class DoWhileDemo2 {
	public static void main(String[] args) {
		/*
		int x = 3;
		do {
			System.out.println("爱生活，爱Java");
			x++;
		}while(x < 3);
		*/
		
		/*
		int x = 3;
		while(x < 3) {
			System.out.println("爱生活，爱Java");
			x++;
		}
		*/
		
		/*
		for(int x=1; x<=5; x++) {
			System.out.println("爱生活，爱Java");
		}
		System.out.println(x);
		*/
		
		int x=1;
		while(x <= 5) {
			System.out.println("爱生活，爱Java");
			x++;
		}
		System.out.println(x);
	}
}

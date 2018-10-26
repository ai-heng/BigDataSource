package com.itheima;
/*
 * 需求：在控制台打印九九乘法表
 * 
 * \t:转移字符，表示一个tab键的位置
 */
public class ForForTest2 {
	public static void main(String[] args) {
		//先打印一个9行9列的星形(列是变化的)
		for(int x=1; x<=9; x++) {
			for(int y=1; y<=x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------");
		
		/*
		1*1=1
		1*2=2	2*2=4
		1*3=3	2*3=6	3*3=9
		...
		*/
		for(int x=1; x<=9; x++) {
			for(int y=1; y<=x; y++) {
				System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println();
		}
	}
}

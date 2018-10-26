/*
找出以下代码的错误，并修改
*/
public class Task07_02 {
	public static void main(String[] args) {
		int x = 2;
		{
			int y = 6;
			System.out.println("x is " + x);
			System.out.println("y is " + y);
		}
		//y = x; 错误，变量y超过使用范围，重新定义变量y
		int y = x; //修改后
		System.out.println("x is " + x);
	}
}
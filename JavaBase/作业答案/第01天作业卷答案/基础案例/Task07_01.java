/*
找出以下代码的错误，并修改
*/
public class Task07_01 {
	public static void main(String[] args) {
		//int a; 错误，尚未初始化变量a的值
		int a = 30;//修改后
		System.out.println(a);
		{
			int c = 20;
			System.out.println(c);
		}
		//c = 30; 错误，变量c超过了使用范围，需要重新定义
		int c = 30; //修改后
		System.out.println(c);
	}
}

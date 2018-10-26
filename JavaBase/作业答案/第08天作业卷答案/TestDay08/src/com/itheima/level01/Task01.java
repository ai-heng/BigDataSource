package com.itheima.level01;

public class Task01 {
	public static void main(String[] args) {
		Son s = new Son();
		s.show();
	}
}

class Son extends Father {
	public final int age = 20;
	
	public void show() {
		// age = 10;
		System.out.println(age);
	}
	
	/*
	@Override
	public void method() {
		System.out.println("method son");
	}
	*/
}

/*
final class Father {

}
*/

class Father {
	public final void method() {
		System.out.println("method father");
	}
}


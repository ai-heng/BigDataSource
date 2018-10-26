package com.itheima_02;
/*
 * @Override 这是注解，这个注解标记一个方法，表明该方法是重写父类的方法。
 * 
 * 方法重写的注意事项：
 * 		A:父类私有的方法不能被重写
 * 		B:子类重写父类方法时，访问权限不能更低
 * 			子类重写父类方法时，建议访问权限一模一样。
 */
public class Son extends Father {
	/*
	@Override
	public void show() {
		System.out.println("show son");
	}
	*/
	
	@Override
	public void show() {
		System.out.println("show son");
	}
	
	/*
	@Override
	public void method() {
		System.out.println("method son");
	}
	*/
}

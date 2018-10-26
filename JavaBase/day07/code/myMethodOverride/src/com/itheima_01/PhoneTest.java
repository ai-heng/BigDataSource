package com.itheima_01;
/*
 * 方法重写：子类中出现了和父类中一模一样的方法声明的情况。
 * 
 * 方法重写的应用：
 * 		当子类需要父类的功能，而功能主体子类又有自己的特有内容的时候，就考虑使用方法重写，
 * 		这样即保证了父类的功能，还添加了子类的特有内容。
 */
public class PhoneTest {
	public static void main(String[] args) {
		Phone p = new Phone();
		p.call("林青霞");
		System.out.println("-----------");
		NewPhone np = new NewPhone();
		np.call("林青霞");
	}
}

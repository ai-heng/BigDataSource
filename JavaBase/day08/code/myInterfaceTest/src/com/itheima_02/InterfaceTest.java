package com.itheima_02;
/*
 * 运动员和教练案例
 */
public class InterfaceTest {
	public static void main(String[] args) {
		//测试运动员
		//乒乓球运动员
		PingPangPlayer ppp = new PingPangPlayer();
		ppp.setName("王浩");
		ppp.setAge(33);
		System.out.println(ppp.getName()+"---"+ppp.getAge());
		ppp.eat();
		ppp.study();
		ppp.speak();
		//通过带参构造方法给成员变量赋值的方式(依然留给同学们)
		System.out.println("---------------");
		
		//篮球运动员
		BasketballPlayer bp = new BasketballPlayer();
		bp.setName("姚明");
		bp.setAge(35);
		System.out.println(bp.getName()+"---"+bp.getAge());
		bp.eat();
		bp.study();
		
		//测试教练的代码留给同学们实现
	}
}

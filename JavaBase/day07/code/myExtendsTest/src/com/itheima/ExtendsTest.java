package com.itheima;
/*
 * 学生和老师案例。
 * 
 * 学生类：
 * 		成员变量：name,age
 * 		构造方法：无参,带参
 * 		成员方法：getXxx(),setXxx(),study()
 * 老师类：
 * 		成员变量：name,age
 * 		构造方法：无参,带参
 * 		成员方法：getXxx(),setXxx(),teach()
 * 我们发现这两个类中相同的代码比较多，所以提取出一个父类。
 * 人类：
 * 		成员变量：name,age
 * 		构造方法：无参,带参
 * 		成员方法：getXxx(),setXxx()
 * 学生类：
 * 		继承人类
 * 		study()
 * 老师类：
 * 		继承人类
 * 		teach()
 */
public class ExtendsTest {
	public static void main(String[] args) {
		//学生类的测试
		//setXxx()
		Student s1 = new Student();
		s1.setName("林青霞");
		s1.setAge(30);
		System.out.println(s1.getName()+"---"+s1.getAge());
		s1.study();
		System.out.println("-------------");
		
		//构造方法
		Student s2 = new Student("林青霞",30);
		System.out.println(s2.getName()+"---"+s2.getAge());
		s2.study();
	}
}

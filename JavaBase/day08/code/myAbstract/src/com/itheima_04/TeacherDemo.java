package com.itheima_04;
/*
 * 分析：从具体到抽象
 * 实现：从抽象到具体
 * 使用：使用的是具体的类的对象
 * 
 * 分析：
 * 		基础班老师：
 * 			成员变量：name,age
 * 			构造方法：无参，带参
 * 			成员方法：getXxx(),setXxx(),teach(){}
 * 		就业班老师：
 * 			成员变量：name,age
 * 			构造方法：无参，带参
 * 			成员方法：getXxx(),setXxx(),teach(){}
 * 
 * 		抽象的老师类：
 * 			成员变量：name,age
 * 			构造方法：无参，带参
 * 			成员方法：getXxx(),setXxx(),teach();
 */
public class TeacherDemo {
	public static void main(String[] args) {
		//使用的是具体的类的对象
		//BasicTeacher
		
		//多态形式的测试
		Teacher t = new BasicTeacher();
		t.setName("林青霞");
		t.setAge(30);
		System.out.println(t.getName()+"---"+t.getAge());
		t.teach();
		System.out.println("---------------------------");
		
		t = new BasicTeacher("林青霞", 30);
		System.out.println(t.getName()+"---"+t.getAge());
		t.teach();
	}
}

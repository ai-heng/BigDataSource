package com.itheima_01;
/*
 * 需求：猫狗案例,让所有的猫狗具备跳高的额外功能
 * 
 * 分析：从具体到抽象
 * 		猫：姓名，年龄，吃饭(){}
 * 		狗：姓名，年龄，吃饭(){}
 * 		发现了共性的内容，就提取了一个父类。
 * 		抽象动物类：
 * 			姓名，年龄，吃饭();
 * 		猫：继承动物类
 * 		狗：继承动物类
 * 		
 * 		跳高的额外功能是一个扩展功能，所以应该定义接口实现。
 * 		跳高接口：
 * 			跳高();
 * 		猫：继承动物类,实现跳高接口
 * 		狗：继承动物类,实现跳高接口
 * 实现：从抽象到具体
 * 使用：使用的是具体的类的对象
 * 
 * 作业：具体的狗类，模仿着猫类给出。
 * 	   狗类的测试，也模仿着猫类的测试给出。	
 * 		
 */
public class InterfaceTest {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.setName("加菲猫");
		c.setAge(3);
		System.out.println(c.getName()+"---"+c.getAge());
		c.eat();
		c.jump();
		System.out.println("-------------------------");
		
		Cat c2 = new Cat("加菲猫",3);
		System.out.println(c2.getName()+"---"+c2.getAge());
		c2.eat();
		c2.jump();
	}
}

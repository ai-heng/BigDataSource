package com.itheima.level02;

/*
一、	分析以下需求，并用代码实现
1.	已知学生类和老师类如下：
		属性:
			姓名,年龄
		行为:
			吃饭
		老师有特有的方法:
			讲课
		学生有特有的方法:
			学习
2.	要求:向上抽取一个父类,让这两个类都继承这个父类,共有的属性写在父类中，子类重写父类中的方法
3.	编写测试类:完成这两个类的测试
 */
public class Task03 {
	public static void main(String[] args) {
		Student2 s = new Student2("小明", 20);
		s.work();
		s.eat();
		
		System.out.println("-------------");
		Teacher t = new Teacher("苍老师", 18);
		t.work();
		t.eat();
	}
}

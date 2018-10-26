package com.itheima.level02;

/*
第四题: 分析以下需求,并用代码实现
	1.定义员工类:
		属性:
			工号,姓名
		行为:
			工作方法(用简单的输出语句模拟)
	2.定义经理类:
		属性:
			工号,姓名,奖金
		行为:
			工作方法(管理员工,简单输出语句模拟)
	3.定义服务员类:
		属性:
			工号,姓名
		行为:
			工作方法(为客户服务,简单输出语句模拟)
	4.定义测试类:
		分别创建经理类对象和服务员类对象
		调用各自的工作方法

		要求:
			分析各个事物之间的继承关系,抽取出相关的类
*/
public class Task04 {
	public static void main(String[] args) {
		Manager m = new Manager("007", "张飞", 1000);
		m.work();
		
		Waiter w = new Waiter("9527", "小翠");
		w.work();
	}
}
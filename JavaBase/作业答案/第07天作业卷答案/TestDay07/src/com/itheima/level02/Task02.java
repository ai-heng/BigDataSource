package com.itheima.level02;

/*
分析以下需求，并用代码实现
	1.定义项目经理类 
		属性：
			姓名 工号 工资 奖金
		行为：
			工作work
	2.定义程序员类
		属性：
			姓名 工号 工资
		行为：
			工作work

	3.要求:向上抽取一个父类,让这两个类都继承这个父类,共有的属性写在父类中，子类重写父类中的方法
	
		编写测试类:完成这两个类的测试
 */
public class Task02 {
	public static void main(String[] args) {
		Manager2 m = new Manager2("殷天正", "007", 21000, 1000);
		m.work();
		
		Coder w = new Coder("小翠", "9527", 18000);
		w.work();
	}
}

package com.itheima_04;
/*
*	向上转型
*		从子到父
*		父类引用指向子类对象
*	向下转型
*		从父到子
*		父类引用转为子类对象
*/
public class DuoTaiDemo {
	public static void main(String[] args) {
		//多态
		Animal a = new Cat(); //向上转型
		a.eat();
		
		//a.playGame();
		//多态的弊端：无法访问子类特有方法
		//现在我就想使用子类特有方法，怎么办呢?
		//创建子类对象就可以了
		/*
		Cat c = new Cat();
		c.eat();
		c.playGame();
		*/
		//现在的代码虽然可以访问子类的特有功能，但是不合理
		//因为我们发现内存中有两个猫类的对象
		//这个时候，我们得想办法把多态中的猫对象还原
		//这个时候，就要使用多态中的转型了
		//父类引用转为子类对象
		Cat c = (Cat)a;
		c.eat();
		c.playGame();
	}
}

package com.itheima.level02;

/*
根据需求完成代码:
	1.定义动物类：
		行为：
			吼叫；没有具体的吼叫行为
			吃饭:没有具体的吃饭行为
	2.定义缉毒接口
		行为: 
			缉毒
	3.定义缉毒狗:犬的一种
		行为：
			吼叫:汪汪叫
			吃饭:狗啃骨头
			缉毒:用鼻子侦测毒
	4.定义测试类:
		使用多态的形式创建缉毒狗对象,调用缉毒方法和吼叫方法
 */
public class Task03 {
	public static void main(String[] args) {
		Animal a = new 缉毒犬();
		a.eat();
		a.吼叫();
		缉毒犬 j = (缉毒犬)a;
		j.缉毒();
	}
}

abstract class Animal{
	public abstract void 吼叫();
	public abstract void eat();
}

interface 缉毒{
	public abstract void 缉毒();
}

/*
定义缉毒狗:犬的一种
行为：
	吼叫:汪汪叫
	吃饭:狗啃骨头
	缉毒:用鼻子侦测毒
*/
class 缉毒犬 extends Dog implements 缉毒{
	@Override
	public void 缉毒() {
		System.out.println("用鼻子侦测毒");
	}
}

class Dog extends Animal{
	@Override
	public void 吼叫() {
		System.out.println("汪汪叫");
	}

	@Override
	public void eat() {
		System.out.println("狗啃骨头");
	}
}

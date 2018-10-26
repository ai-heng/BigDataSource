package com.itheima.level02;

/*
根据需求完成代码:
1.定义手机类
	行为:
		打电话,发短信

2.定义接口IPlay
	行为:
		玩游戏

3.定义旧手机类继承手机类
	行为:
		继承父类的行为

4.定义新手机继承手机类实现IPlay接口
行为:继承父类的行为,重写玩游戏方法

5.定义测试类
	在测试类中定义一个 用手机的方法,要求该方法既能接收老手机对象,也能接收新手机对象
	在该方法内部调用打电话,发短信以及新手机特有的玩游戏方法
 */
public class Task02 {
	public static void main(String[] args) {
		usePhone(new Phone());
		System.out.println("----------");
		usePhone(new NewPhone());
	}

	// 定义一个用手机的方法
	public static void usePhone(Phone p) { // Phone p = new OldPhone();
		if (p instanceof OldPhone) {
			OldPhone old = (OldPhone) p;
			old.call();
			old.sendMessage();
		} else if (p instanceof NewPhone) {
			NewPhone newPhone = (NewPhone) p;
			newPhone.call();
			newPhone.sendMessage();
			newPhone.playGame();
		} else {
			p.call();
			p.sendMessage();
		}
	}
}

class Phone{
//	行为:
//		打电话,发短信
	public void call(){
		System.out.println("打电话");
	}
	
	public void sendMessage(){
		System.out.println("发短信");
	}
}

class OldPhone extends Phone{}

interface IPlay{
	public abstract void playGame();
}

class NewPhone extends Phone implements IPlay{
	@Override
	public void playGame() {
		System.out.println("打王者农药");
	}
}
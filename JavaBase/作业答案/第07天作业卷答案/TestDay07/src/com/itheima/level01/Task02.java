package com.itheima.level01;

/*
一、	分析以下需求，并用代码实现：
1.	定义手机类
		方法：打电话(手机的功能是给某人打电话)
2.	根据手机类，派生一个新手机类
		重写打电话功能(新功能可以开启视频电话，同时要包含老功能)
3.	编写测试类分别对上述2类手机进行测试
4.  要求运行结果:
		给林青霞打电话
		-----------
		开启视频功能
		给林青霞打电话
 */
public class Task02 {
	public static void main(String[] args) {
		Phone p = new Phone();
		p.call("林青霞");
		System.out.println("-----------");
		NewPhone np = new NewPhone();
		np.call("林青霞");
	}
}

class Phone {
	public void call(String name) {
		System.out.println("给"+name+"打电话");
	}
}

class NewPhone extends Phone {
	public void call(String name) {
		System.out.println("开启视频功能");
		//System.out.println("给"+name+"打电话");
		super.call(name);
	}
}


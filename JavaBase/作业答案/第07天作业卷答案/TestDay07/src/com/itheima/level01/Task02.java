package com.itheima.level01;

/*
һ��	�����������󣬲��ô���ʵ�֣�
1.	�����ֻ���
		��������绰(�ֻ��Ĺ����Ǹ�ĳ�˴�绰)
2.	�����ֻ��࣬����һ�����ֻ���
		��д��绰����(�¹��ܿ��Կ�����Ƶ�绰��ͬʱҪ�����Ϲ���)
3.	��д������ֱ������2���ֻ����в���
4.  Ҫ�����н��:
		������ϼ��绰
		-----------
		������Ƶ����
		������ϼ��绰
 */
public class Task02 {
	public static void main(String[] args) {
		Phone p = new Phone();
		p.call("����ϼ");
		System.out.println("-----------");
		NewPhone np = new NewPhone();
		np.call("����ϼ");
	}
}

class Phone {
	public void call(String name) {
		System.out.println("��"+name+"��绰");
	}
}

class NewPhone extends Phone {
	public void call(String name) {
		System.out.println("������Ƶ����");
		//System.out.println("��"+name+"��绰");
		super.call(name);
	}
}


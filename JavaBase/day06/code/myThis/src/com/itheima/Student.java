package com.itheima;

/*
 * ѧ����
 * 
 * Ŀǰ�����е�n��aû����������֪�⣬��Ҫ�Ľ���
 * 
 * ����ֲ��������ƺͳ�Ա��������һ�£��ڷ�����ʹ�õ�ʱ����õ��Ǿͽ�ԭ��
 * 
 * ������û�а취�Ѿֲ�������name��ֵ����Ա������name��?
 * ��
 * 
 * ��ʲô�취��?
 * 		��this�ؼ��־Ϳ��Խ���������
 * 
 * this:����������Ķ�������
 * 		�������ĸ�������ã�this�ʹ���˭��
 * 
 * ʹ�ó�����
 * 		�������ڽ����Ա���������ص����⡣		
 */
public class Student {
	private String name;
	private int age;

	public void setName(String name) { //"����ϼ"
		//name = name;
		this.name = name;
	}

	public String getName() {
		return name;
		//return this.name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
}

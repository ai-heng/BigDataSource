package com.itheima.level01_01;
/*
 * 1. 定义二个类
 * 	Teacher(教师类)和Course(课程类)
 * 
 * 	Teacher(教师类)
 * 		教师编号	姓名		性别		年龄		科目
 * 		id		name	sex		age		course
 * 		提供构造方法与get、set方法
 * 
 * Course(课程类)
 * 		课程编号	名称		创建时间		课程描述
 * 		id		name	createtime	desc
 * 		提供构造方法与get、set方法
 */
public class Task01 {
	public static void main(String[] args) {
		/*2.创建相应对象,通过构造方法给成员变量赋值。
		 * 教师编号	姓名		性别		年龄		科目
			t001	薛之谦	男		26		Java
			t002	张碧晨	女		24		IOS
			t003	张杰		男		28		Java

			课程编号	名称		创建时间		课程描述
			s001	Java	2007-02-08	Java学科，包含JavaSE和JavaEE
			s002	IOS		2007-02-09	IOS系统开发
		 */
		Teacher t1 = new Teacher("t001", "薛之谦", "男", 26, "Java");
		Teacher t2 = new Teacher("t002", "张碧晨", "女", 24, "IOS");
		Teacher t3 = new Teacher("t003", "张杰", "男", 28, "Java");
		
		Course c1 = new Course("s001", "Java", "2007-02-08", "Java学科，包含JavaSE和JavaEE");
		Course c2 = new Course("s002", "IOS", "2007-02-09", "IOS系统开发");
		
		//3. 打印每个对象的所有属性。
		System.out.println(t1.getId() + ", " + t1.getName() + ", " + t1.getSex() +", "+ t1.getAge() +", "+ t1.getCource());
	}
}

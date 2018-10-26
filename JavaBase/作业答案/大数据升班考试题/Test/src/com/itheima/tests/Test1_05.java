package com.itheima.tests;

import java.util.ArrayList;

/*
 * 定义一个Person类。
		属性：姓名name,年龄age
		行为：吃饭()      方法中输出一句话：人在吃饭
		      睡觉sleep() 方法中输出一句话：人在睡觉
	需求：
	  1、创建三个Person类对象
		第一个：姓名："张三"  年龄：23
		第二个：姓名："阿红"  年龄：24
		第三个：姓名："二狗"  年龄：25
	  2、定义一个集合，将这三个Person对象添加到集合中
	  3、遍历集合，拿到每一个Person对象。
	        如果当前对象的姓名是"阿红"，那么打印当前对象的所有信息。
		输出结果：
			姓名为：阿红，年龄为：24
	                        人在吃饭
			人在睡觉
			
//			打印水仙花数并且统计个数
//			打印水仙花数
	提示:
1.	该题采用ArrayList<Person>集合实现即可.
2.	注意:因为名字是字符串, 字符串的比较用该用: String类的equals()方法.

 */
public class Test1_05 {
	public static void main(String[] args) {
		Person per1 = new Person("苍老师", 23);
		Person per2 = new Person("武老师", 24);
		Person per3 = new Person("波老师", 25);
		
		ArrayList<Person> list = new ArrayList<>();
		list.add(per1);
		list.add(per2);
		list.add(per3);
		
		for (Person per : list) {
			if(per.getName().equals("武老师")){
				System.out.println(per.getName()+",年龄为："+per.getAge());
				per.eat();
				per.sleep();
			}
		}
		
		
	}
}

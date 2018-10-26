package com.itheima;
/*
 * 导包：
 * 		import 包名;
 */
import cn.itcast.Teacher;

public class Test {
	public static void main(String[] args) {
		Student s = new Student();
		s.show();
		
		/*
		//我要使用Teacher下的method()方法
		//类不在同一个包下，使用的时候，要加类的全路径名称
		cn.itcast.Teacher t = new cn.itcast.Teacher();
		t.method();
		t.method();
		
		cn.itcast.Teacher t2 = new cn.itcast.Teacher();
		t2.method();
		//这样做太麻烦了，java就提供了一个导包的功能
		 * 
		 */
		
		Teacher t = new Teacher();
		t.method();
		
	}
}

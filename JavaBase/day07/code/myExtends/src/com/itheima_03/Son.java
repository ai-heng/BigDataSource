package com.itheima_03;

/*
public class Son extends GrandFather {
	public static void main(String[] args) {
		Son s = new Son();
		s.grandFatherSay();
	}
}
*/

/*
public class Son extends Father {
	public static void main(String[] args) {
		Son s = new Son();
		s.fatherSay();
	}
}
*/

//Java中类只支持单继承，不支持多继承
/*
public class Son extends Father,GrandFather {
	public static void main(String[] args) {
		Son s = new Son();
		s.fatherSay();
	}
}
*/

//Java中类支持多层继承
public class Son extends Father {
	public static void main(String[] args) {
		Son s = new Son();
		s.fatherSay();
		s.grandFatherSay();
	}
}

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

//Java����ֻ֧�ֵ��̳У���֧�ֶ�̳�
/*
public class Son extends Father,GrandFather {
	public static void main(String[] args) {
		Son s = new Son();
		s.fatherSay();
	}
}
*/

//Java����֧�ֶ��̳�
public class Son extends Father {
	public static void main(String[] args) {
		Son s = new Son();
		s.fatherSay();
		s.grandFatherSay();
	}
}

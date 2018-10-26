package com.itheima_02;
/*
 * ==:
 * 		可以比较基本数据类型，比较基本数据类型的时候比较的是基本数据类型的值是否相同
 * 		也可以比较引用数据类型，比较引用数据类型的时候比较的是引用数据类型的地址值是否相同
 * 
 * 而我们现在想比较的是对象的内容是否相同?该怎么办呢?
 * 通过查看API，我们找到了比较对象是否相等的方法：
 * public boolean equals(Object obj)
 * Object类中的equals()方法默认比较的是对象的地址是否相同。
 * 如果我们想比较对象的内容是否相同，就必须自己重写该方法。
 * 如何重写该方法呢?
 * 		自动生成即可。
 */
public class ObjectDemo {
	public static void main(String[] args) {
		Student s1 = new Student("林青霞", 30);
		Student s2 = new Student("林青霞", 30);
		
		//System.out.println(s1 == s2);//false
		
		System.out.println(s1.equals(s2));//false
		/*
	    public boolean equals(Object obj) {
	    	//this -- s1
	    	//obj -- s2
	        return (this == obj);
	    }
	    */
	}
}

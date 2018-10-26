package com.itheima_01;
/*
 * Object:是类层次结构的根类，所有的类都直接的或者间接的继承自该类。
 * 构造方法：Object()
 * 
 * 直接输出对象名，输出底层调用的是该对象的toString()
 * 
 * 查看API，我们发现建议所有子类都重写toString()。
 * 到底该如何重写该方法呢?自动生成的就可以。
 */
public class ObjectDemo {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("林青霞");
		s.setAge(30);
		System.out.println(s);
		//System.out.println(s.toString());
		/*
		 public void println(Object x) { //Object x = s;
	        String s = String.valueOf(x);
	        synchronized (this) {
	            print(s);
	            newLine();
	        }
	    }
	    
	    public static String valueOf(Object obj) { //Object obj = x;
        	return (obj == null) ? "null" : obj.toString();
    	}
	    */
	}
}

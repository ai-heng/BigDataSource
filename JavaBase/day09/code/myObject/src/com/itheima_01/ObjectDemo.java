package com.itheima_01;
/*
 * Object:�����νṹ�ĸ��࣬���е��඼ֱ�ӵĻ��߼�ӵļ̳��Ը��ࡣ
 * ���췽����Object()
 * 
 * ֱ�����������������ײ���õ��Ǹö����toString()
 * 
 * �鿴API�����Ƿ��ֽ����������඼��дtoString()��
 * ���׸������д�÷�����?�Զ����ɵľͿ��ԡ�
 */
public class ObjectDemo {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("����ϼ");
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

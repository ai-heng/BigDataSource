package com.itheima_05;
/*
 * JDK5�����ԣ�
 * �Զ�װ�䣺�ѻ�����������ת��Ϊ��Ӧ�İ�װ������
 * 		public static Integer valueOf(int i)
 * �Զ����䣺�Ѱ�װ������ת��Ϊ��Ӧ�Ļ�����������
 * 		public int intValue()
 * 
 * Java��������У�
 * 		��дjava�ļ� -- ��������class�ļ� -- ִ��
 * 
 * ע�⣺��ʹ�ð�װ�����͵������Ե�ʱ�������������������ж��Ƿ�Ϊnull��
 * 
 * �����е�ԭ��
 * 		ֻҪ�Ƕ�����ʹ��ǰ�ͱ�����в�Ϊnull���жϡ�
 */
public class IntegerDemo {
	public static void main(String[] args) {
		//����һ����װ�����͵Ķ���
		//Integer i = new Integer(100);
		Integer ii = 100; //�Զ�װ��	
		//public static Integer valueOf(int i)
		ii += 200; //ii = ii + 200; �Զ�����,�Զ�װ��
		//public int intValue()
		System.out.println(ii);
		
		/*
		Integer ii = Integer.valueOf(100);
		ii = Integer.valueOf(ii.intValue() + 200);
		System.out.println(ii);
		*/
		
		Integer iii = null;
		if(iii != null) {
			iii += 300; //NullPointerException
			System.out.println(iii);
		}
	}
}

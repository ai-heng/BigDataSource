package com.itheima_03;
/*
 * ���󣺱Ƚ����������Ƿ���ȡ�
 * �������ͷֱ�Ϊ����byte���ͣ�����short���ͣ�����int���ͣ�����long���ͣ�
 * ����main�����н��в���
 */
public class MethodTest {
	public static void main(String[] args) {
		//System.out.println(compare(10, 20));
		
		//System.out.println(compare((byte)10, (byte)20));
		
		//System.out.println(compare((short)10, (short)20));
		
		System.out.println(compare(10L, 20L));
	}
	
	/*
	 * ����byte����
	 * 
	 * ������ȷ��
	 * 		����ֵ���ͣ�boolean
	 * 		�����б���byte a,byte b
	 */
	public static boolean compare(byte a,byte b){
		/*
		if(a == b) {
			return true;
		}else {
			return false;
		}
		*/
		System.out.println("byte");
		return a == b;
	}
	
	//����short����
	public static boolean compare(short a,short b){
		System.out.println("short");
		return a == b;
	}
	
	//����int����
	public static boolean compare(int a,int b){
		System.out.println("int");
		return a == b;
	}
	
	//����long����
	public static boolean compare(long a,long b){
		System.out.println("long");
		return a == b;
	}
}
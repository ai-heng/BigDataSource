package com.itheima_03;
/*
 * ���󣺰������е����ݰ���ָ������ʽƴ�ӳ�һ���ַ���
 * ������int[] arr = {1,2,3};
 * ��������[1, 2, 3]
 * 
 * ������
 * 		A:����һ��int���͵�����
 * 		B:д����ʵ�ְ������е�Ԫ�ذ���ָ���ĸ�ʽƴ�ӳ�һ���ַ���
 * 		C:���÷���
 * 		D:������
 */
public class StringTest3 {
	public static void main(String[] args) {
		//����һ��int���͵�����
		int[] arr = {1,2,3};
		
		//д����ʵ�ְ������е�Ԫ�ذ���ָ���ĸ�ʽƴ�ӳ�һ���ַ���
		
		//���÷���
		String result = arrayToString(arr);
		
		//������
		System.out.println("result:"+result);
	}
	
	/*
	 * ������ȷ��
	 * 		����ֵ���ͣ�String
	 * 		�����б�int[] arr
	 */
	public static String arrayToString(int[] arr) {
		String s = "";
		//[1, 2, 3]
		s+="[";
		
		for(int x=0; x<arr.length; x++) {
			if(x==arr.length-1) {
				s += arr[x];
			}else {
				s += arr[x];
				s += ", ";
			}
		}
		
		s+="]";
		return s;
	}
}

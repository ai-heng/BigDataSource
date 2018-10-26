package com.itheima.level01;

/*
 * ������ƴ�ӳ�һ���ַ���
 * ������int[] arr = {1,2,3};
 * ��������[1, 2, 3]
 * 
 * ������
 * 		A:����һ��int���͵�����
 * 		B:д����ʵ�ְ������е�Ԫ�ذ���ָ���ĸ�ʽƴ�ӳ�һ���ַ���
 * 		C:���÷���
 * 		D:������
 * 
 */
public class Task05 {
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
		StringBuilder sb = new StringBuilder();
		//[1, 2, 3]
		sb.append("[");
		
		for(int x=0; x<arr.length; x++) {
			if(x==arr.length-1) {
				sb.append(arr[x]);
			}else {
				sb.append(arr[x]).append(", ");
			}
		}
		
		sb.append("]");
		
		String s = sb.toString();
		
		return s;
		
	}
}


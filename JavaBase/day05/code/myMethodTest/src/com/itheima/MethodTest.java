package com.itheima;
/*
 * ���󣺰ѱ�������Ľ�Ϊ����ʵ�֣������÷���
 */
public class MethodTest {
	public static void main(String[] args) {
		//��������
		int[] arr = {11,22,33,44,55};
		
		//���÷���
		//printArray(arr);
		
		//�����Ѿ�ʵ�������󣬵����Ҿ������Ч�����ÿ�������Ҫ���µ�Ч��������
		//[Ԫ��1, Ԫ��2, Ԫ��3, ...]
		//���ǵĽ��Ӧ���������ģ�[11, 22, 33, 44, 55]
		printArray(arr);
	}
	
	/*
	 * ��������ķ�����
	 * 
	 * ������ȷ��
	 * 		����ֵ���ͣ�void
	 * 		�����б�int[] arr
	 */
	/*
	public static void printArray(int[] arr) {
		for(int x=0; x<arr.length; x++) {
			System.out.println(arr[x]);
		}
	}
	*/
	public static void printArray(int[] arr) {
		System.out.print("[");
		for(int x=0; x<arr.length; x++) {
			if(x == arr.length-1) {
				//�ж��Ƿ������һ��Ԫ��
				System.out.print(arr[x]);
			}else {
				System.out.print(arr[x]+", ");
			}
			
		}
		System.out.println("]");
	}
}

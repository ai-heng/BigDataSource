package com.itheima;
/*
 * ��������(ð������)
 */
public class ArrayDemo {
	public static void main(String[] args) {
		//����һ��int���͵�����
		int[] arr = {24,69,80,57,13};
		
		/*
		//��һ�αȽ�
		//arr.length-1��Ϊ�˷�ֹ����Խ��
		//arr.length-1-0��Ϊ�˼��ٱȽϵĴ���
		for(int x=0; x<arr.length-1-0; x++) {
			//ArrayIndexOutOfBoundsException
			if(arr[x] > arr[x+1]) {
				//��������
				int temp = arr[x];
				arr[x] = arr[x+1];
				arr[x+1] = temp;
			}
		}
		//���ñ�������
		System.out.println("��һ�αȽ���ϣ�");
		printArray(arr);
		
		//�ڶ��αȽ�
		//arr.length-1��Ϊ�˷�ֹ����Խ��
		//arr.length-1-1��Ϊ�˼��ٱȽϵĴ���
		for(int x=0; x<arr.length-1-1; x++) {
			//ArrayIndexOutOfBoundsException
			if(arr[x] > arr[x+1]) {
				//��������
				int temp = arr[x];
				arr[x] = arr[x+1];
				arr[x+1] = temp;
			}
		}
		//���ñ�������
		System.out.println("�ڶ��αȽ���ϣ�");
		printArray(arr);
		
		//�����αȽ�
		//arr.length-1��Ϊ�˷�ֹ����Խ��
		//arr.length-1-2��Ϊ�˼��ٱȽϵĴ���
		for(int x=0; x<arr.length-1-2; x++) {
			//ArrayIndexOutOfBoundsException
			if(arr[x] > arr[x+1]) {
				//��������
				int temp = arr[x];
				arr[x] = arr[x+1];
				arr[x+1] = temp;
			}
		}
		//���ñ�������
		System.out.println("�����αȽ���ϣ�");
		printArray(arr);
		
		//���ĴαȽ�
		//arr.length-1��Ϊ�˷�ֹ����Խ��
		//arr.length-1-3��Ϊ�˼��ٱȽϵĴ���
		for(int x=0; x<arr.length-1-3; x++) {
			//ArrayIndexOutOfBoundsException
			if(arr[x] > arr[x+1]) {
				//��������
				int temp = arr[x];
				arr[x] = arr[x+1];
				arr[x+1] = temp;
			}
		}
		//���ñ�������
		System.out.println("���ĴαȽ���ϣ�");
		printArray(arr);
		*/
		
		//��ѭ���Ľ�
		/*
		for(int y=0; y<4; y++) {
			for(int x=0; x<arr.length-1-y; x++) {
				if(arr[x] > arr[x+1]) {
					//��������
					int temp = arr[x];
					arr[x] = arr[x+1];
					arr[x+1] = temp;
				}
			}
		}
		*/
		
		/*
		//ѭ�����Ĵ�������д�̶���ֵ����arr.length-1�Ľ�����
		for(int y=0; y<arr.length-1; y++) {
			for(int x=0; x<arr.length-1-y; x++) {
				if(arr[x] > arr[x+1]) {
					//��������
					int temp = arr[x];
					arr[x] = arr[x+1];
					arr[x+1] = temp;
				}
			}
		}
		printArray(arr);
		*/
		
		//������ж������Ҫ����ÿ������д������һ�δ��룬̫�鷳����ô����
		//�÷����Ľ�
		sort(arr);
		System.out.println("�����");
		printArray(arr);
	}
	
	/*
	 * ������ȷ��
	 * 		����ֵ���ͣ�void
	 * 		�����б�int[] arr
	 */
	public static void sort(int[] arr) {
		for(int x=0; x<arr.length-1; x++) {
			for(int y=0; y<arr.length-1-x; y++) {
				if(arr[y] > arr[y+1]) {
					int temp = arr[y];
					arr[y] = arr[y+1];
					arr[y+1] = temp;
				}
			}
		}
	}
	
	/*
	 * �������
	 */
	public static void printArray(int[] arr) {
		System.out.print("[");
		for(int x=0; x<arr.length; x++) {
			if(x==arr.length-1) {
				System.out.print(arr[x]);
			}else {
				System.out.print(arr[x]+", ");
			}
		}
		System.out.println("]");
	}
}

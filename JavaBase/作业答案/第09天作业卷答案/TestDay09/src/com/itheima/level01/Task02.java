package com.itheima.level01;

import java.util.Scanner;

/*
ģ���½�������λ��ᣬ����ʾ���м��Ρ�
 */
public class Task02 {
	public static void main(String[] args) {
		// ���������ַ����������ڴ洢�Ѿ����ڵ��û���������
		String username = "admin";
		String password = "admin";

		for (int x = 0; x < 3; x++) {
			// ����¼���û���������
			Scanner sc = new Scanner(System.in);
			System.out.println("�������û�����");
			String name = sc.nextLine();
			System.out.println("���������룺");
			String pwd = sc.nextLine();

			// �ü���¼����û���������ȥ���Ѿ����ڵ��û�����������бȽ�
			if (username.equals(name) && password.equals(pwd)) {
				System.out.println("��¼�ɹ�");
				break;
			} else {
				if ((2 - x) == 0) {
					System.out.println("����ʺű��������������Ա��ϵ");
				} else {
					System.out.println("��¼ʧ�ܣ��㻹��" + (2 - x) + "�λ���");
				}
			}
		}
	}
}

package com.itheima.test;

import java.util.Scanner;

import com.itheima.bean.User;
import com.itheima.service.impl.UserInterImpl;

/*
 * ����
 * 	ģ�������������û�������ɾ�Ĳ飩����¼����
 * 
 * 	�û� -- javabean
 * 
 * 	�����û� -- ��ɾ�Ĳ鹦��
 * 		���ܶ�����ҵ���߼����
 * 		main��ʱģ����ǿ��Ʋ� -- ��ȡ�����Լ��ж����ݵ���Ч�� -- ʣ�µĹ�������ҵ���߼���
 * 
 *	��MainTest������ռ���¼���һ�����ݴ��ݵ�ҵ��㴦��
 */
public class MainTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("��ӭ�����û�����ϵͳ");
		
		// ����ҵ����߼�
		UserInterImpl uii = new UserInterImpl();

		while (true) {
			System.out.println("-----------------");
			System.out.println("������Ҫ���������ͣ�");
			System.out.println("1 ����û���");
			System.out.println("2 ɾ���û���");
			System.out.println("3 ��ѯ�û���");
			System.out.println("4 �޸��û���");
			System.out.println("5 ��¼�û���");
			System.out.println("6 �˳�ϵͳ��");
			System.out.println("-----------------");

			String type = sc.nextLine();
			switch (type) {
			case "1":
				// ���
				System.out.println("�������û�ID��");
				String id = null;
				while (true) {
					// У��ID��Ψһ��
					id = sc.nextLine();
					if (!uii.checkId(id)) {
						break;
					} else {
						System.out.println("��ID�Ѵ��ڣ�������¼�룺");
					} 
				}
				
				System.out.println("�������û�����");
				String username = sc.nextLine();
				System.out.println("�������û����룺");
				String password = sc.nextLine();
				
				User u = new User(id, username, password);
				
				
				if (uii.add(u)) {
					System.out.println("��ӳɹ�");
				} else {
					System.out.println("����Ա�����ʧ��");
				}
				
				
				break;
			case "2":
				// ɾ��
				System.out.println("������Ҫɾ�����û�ID��");
				String delId = sc.nextLine();
				if (uii.checkId(delId)) {
					if (uii.delete(delId)) {
						System.out.println("ɾ���ɹ�");
					} else {
						System.out.println("ɾ��ʧ��");
					}
				} else {
					System.out.println("��¼���ID�����ڣ�����ͨ����ѯ���ܲ鿴�����û�");
				}
				
				break;
			case "3":
				
				uii.select();
				
				// ��ѯ
				break;
			case "4":
				// �޸�
				System.out.println("������Ҫ�޸ĵ��û�ID��");
				String updateId = sc.nextLine();
				if (uii.checkId(updateId)) {
					
					System.out.println("�������޸ĺ���û�����");
					String updateUsername = sc.nextLine();
					
					System.out.println("�������޸ĺ�����룺");
					String updatePassword = sc.nextLine();
					
					User newUser = new User(updateId, updateUsername, updatePassword);
					
					if (uii.update(updateId, newUser)) {
						System.out.println("�޸ĳɹ�");
					} else {
						System.out.println("�޸�ʧ��");
					}
				} else {
					System.out.println("��¼���ID�����ڣ�����ͨ����ѯ���ܲ鿴�����û�");
				}
				break;
			case "5":
				// ��¼
				System.out.println("�������û�����");
				String loginUsername = sc.nextLine();
				System.out.println("���������룺");
				String loginPassword = sc.nextLine();
				if (uii.login(loginUsername, loginPassword)) {
					System.out.println("��¼�ɹ�");
				} else {
					System.out.println("�û�����������󣬵�¼ʧ��");
				}
				
				break;
			case "6":
				// �˳�
				System.out.println("��ӭ�ٴ�ʹ�ã��ټ�");
				System.exit(0);
			default:
				System.out.println("��������ϵͳ��ֹ");
				System.exit(0);
			}

		}

	}

}

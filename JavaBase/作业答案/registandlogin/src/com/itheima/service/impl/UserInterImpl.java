package com.itheima.service.impl;

import com.itheima.bean.User;
import com.itheima.service.UserInter;
/*
 * ������
 * 	1��������Ϊ�洢�û������� -- �����ü��ϸĽ�
 * 	2��Ĭ��ֻ�ܴ�5���û��� ��ô��ʱӦ�����뵽��Ҫ����һ������,��¼��Ч���ݸ���
 *  3�������������Ӧ����һ����Ա������������Ҫ��̬���Σ���������private����Ϊ�˰�ȫ��
 * 
 */


public class UserInterImpl implements UserInter {
	
	// ���ݿ�
	private static User[] arr = new User[5];
	// ��¼�洢��λ�û����Ǹ���
	private static int index = 0;

	@Override
	public boolean add(User u) {
		if (index >= 5) {
			return false;
		}
		arr[index++] = u;
		return true;
	}

	@Override
	public boolean delete(String id) {
		// ���鳤�ȹ̶�
		for (int i = 0; i < index; i++) {
			if (arr[i].getId().equals(id)) { // ��user1, user2,  user3, user4, null��
				// ɾ�� -- ��Ϊnull -- ����Ԫ��һ����ɾ������Ҫ���¸�ֵ
				arr[i] = null;
				// ��һ�������飬�滻�ɵ�
				User[] newArr = new User[5];
				
				int newIndex = 0;
				for (int j = 0; j < arr.length; j++) {
					if (arr[j] != null) {
						newArr[newIndex++] = arr[j];
					}
				}
				// ���¸�ֵ���ݿ�
				arr = newArr;
				index = newIndex;
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean update(String id, User u) {
		
		for (int i = 0; i < index; i++) {
			if (arr[i].getId().equals(id)) {
				arr[i] = u;
				return true;
			}
		}
		return false;
	}

	@Override
	public void select() {
		System.out.println("��ǰϵͳ���У�" + index + "���û�");
		/*for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				System.out.println(arr[i]);
			}
		}*/
		for (int i = 0; i < index; i++) {
			System.out.println(arr[i]);
		}
	}

	@Override
	public boolean checkId(String id) {
		
		// �����û����ж��Ƿ����
		for (int i = 0; i < index; i++) {
			if (arr[i].getId().equals(id)) { // ��ʽ��� id.equale(arr[i].getId())
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean login(String username, String password) {
		
		for (int i = 0; i < index; i++) {
			if (arr[i].getUsername().equals(username) && arr[i].getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

}

package com.itheima.service;

import com.itheima.bean.User;

// ҵ���߼�����û��ӿڣ�����������û��Ĺ��ܣ�������Ĺ��ܶ��ǹ��򣬲�������ʵ��
public interface UserInter {
	
	// ���,��û����ӳɹ�����ø���ǰ̨
	/**
	 * ����û�
	 * @param �û�����
	 * @return ����ֵ��ʾ�Ƿ���ӳɹ�����ӳɹ�����true�����ɹ�����false
	 */
	boolean add(User u);
	
	// ɾ�� -- ����Ψһ��idɾ��
	boolean delete(String id);
	
	// �޸�
	boolean update(String id, User u);
	
	// ��ѯ
	void select();
	
	// �������ݿ����Ƿ��Ѱ�����ID
	boolean checkId(String id);
	
	/**
	 * ��¼
	 * @param username �û���
	 * @param password ����
	 * @return �Ƿ��¼�ɹ�
	 */
	boolean login(String username, String password);
	

}

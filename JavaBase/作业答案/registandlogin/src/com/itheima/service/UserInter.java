package com.itheima.service;

import com.itheima.bean.User;

// 业务逻辑层的用户接口，负责定义管理用户的功能，这里面的功能都是规则，不做具体实现
public interface UserInter {
	
	// 添加,有没有添加成功，最好告诉前台
	/**
	 * 添加用户
	 * @param 用户对象
	 * @return 返回值表示是否添加成功。添加成功返回true，不成功返回false
	 */
	boolean add(User u);
	
	// 删除 -- 根据唯一的id删除
	boolean delete(String id);
	
	// 修改
	boolean update(String id, User u);
	
	// 查询
	void select();
	
	// 返回数据库中是否已包含此ID
	boolean checkId(String id);
	
	/**
	 * 登录
	 * @param username 用户名
	 * @param password 密码
	 * @return 是否登录成功
	 */
	boolean login(String username, String password);
	

}

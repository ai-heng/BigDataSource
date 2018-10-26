package com.itheima.service.impl;

import com.itheima.bean.User;
import com.itheima.service.UserInter;
/*
 * 分析：
 * 	1、数组作为存储用户的容器 -- 将来用集合改进
 * 	2、默认只能存5个用户， 那么此时应该能想到还要定义一个索引,记录有效数据个数
 *  3、发现这个容器应该是一个成员变量，并且需要静态修饰，让它共享。private修饰为了安全。
 * 
 */


public class UserInterImpl implements UserInter {
	
	// 数据库
	private static User[] arr = new User[5];
	// 记录存储的位置或者是个数
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
		// 数组长度固定
		for (int i = 0; i < index; i++) {
			if (arr[i].getId().equals(id)) { // 【user1, user2,  user3, user4, null】
				// 删除 -- 置为null -- 数组元素一旦“删除”，要重新赋值
				arr[i] = null;
				// 做一个新数组，替换旧的
				User[] newArr = new User[5];
				
				int newIndex = 0;
				for (int j = 0; j < arr.length; j++) {
					if (arr[j] != null) {
						newArr[newIndex++] = arr[j];
					}
				}
				// 重新赋值数据库
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
		System.out.println("当前系统中有：" + index + "个用户");
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
		
		// 遍历用户，判断是否存在
		for (int i = 0; i < index; i++) {
			if (arr[i].getId().equals(id)) { // 链式编程 id.equale(arr[i].getId())
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

package com.itheima.test;

import java.util.Scanner;

import com.itheima.bean.User;
import com.itheima.service.impl.UserInterImpl;

/*
 * 需求：
 * 	模拟真正开发中用户管理（增删改查）及登录功能
 * 
 * 	用户 -- javabean
 * 
 * 	管理用户 -- 增删改查功能
 * 		功能定义在业务逻辑层的
 * 		main此时模拟的是控制层 -- 获取数据以及判断数据的有效性 -- 剩下的工作交给业务逻辑层
 * 
 *	在MainTest里面接收键盘录入的一堆数据传递到业务层处理
 */
public class MainTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("欢迎进入用户管理系统");
		
		// 调用业务层逻辑
		UserInterImpl uii = new UserInterImpl();

		while (true) {
			System.out.println("-----------------");
			System.out.println("请输入要操作的类型：");
			System.out.println("1 添加用户：");
			System.out.println("2 删除用户：");
			System.out.println("3 查询用户：");
			System.out.println("4 修改用户：");
			System.out.println("5 登录用户：");
			System.out.println("6 退出系统：");
			System.out.println("-----------------");

			String type = sc.nextLine();
			switch (type) {
			case "1":
				// 添加
				System.out.println("请输入用户ID：");
				String id = null;
				while (true) {
					// 校验ID的唯一性
					id = sc.nextLine();
					if (!uii.checkId(id)) {
						break;
					} else {
						System.out.println("该ID已存在，请重新录入：");
					} 
				}
				
				System.out.println("请输入用户名：");
				String username = sc.nextLine();
				System.out.println("请输入用户密码：");
				String password = sc.nextLine();
				
				User u = new User(id, username, password);
				
				
				if (uii.add(u)) {
					System.out.println("添加成功");
				} else {
					System.out.println("已满员，添加失败");
				}
				
				
				break;
			case "2":
				// 删除
				System.out.println("请输入要删除的用户ID：");
				String delId = sc.nextLine();
				if (uii.checkId(delId)) {
					if (uii.delete(delId)) {
						System.out.println("删除成功");
					} else {
						System.out.println("删除失败");
					}
				} else {
					System.out.println("您录入的ID不存在，可以通过查询功能查看已有用户");
				}
				
				break;
			case "3":
				
				uii.select();
				
				// 查询
				break;
			case "4":
				// 修改
				System.out.println("请输入要修改的用户ID：");
				String updateId = sc.nextLine();
				if (uii.checkId(updateId)) {
					
					System.out.println("请输入修改后的用户名：");
					String updateUsername = sc.nextLine();
					
					System.out.println("请输入修改后的密码：");
					String updatePassword = sc.nextLine();
					
					User newUser = new User(updateId, updateUsername, updatePassword);
					
					if (uii.update(updateId, newUser)) {
						System.out.println("修改成功");
					} else {
						System.out.println("修改失败");
					}
				} else {
					System.out.println("您录入的ID不存在，可以通过查询功能查看已有用户");
				}
				break;
			case "5":
				// 登录
				System.out.println("请输入用户名：");
				String loginUsername = sc.nextLine();
				System.out.println("请输入密码：");
				String loginPassword = sc.nextLine();
				if (uii.login(loginUsername, loginPassword)) {
					System.out.println("登录成功");
				} else {
					System.out.println("用户名或密码错误，登录失败");
				}
				
				break;
			case "6":
				// 退出
				System.out.println("欢迎再次使用，再见");
				System.exit(0);
			default:
				System.out.println("输入有误，系统终止");
				System.exit(0);
			}

		}

	}

}

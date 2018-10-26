package com.heima.level02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task02 {
	/**
	 * 需求分析：
	 * 	  1.项目根目录下建立文件： user.txt，文件中存放用户名和登录密码，格式：用户名，密码,如：aaa,123；
		  2. user.txt文件中初始存放的用户信息有如下：
			 jack,123
			 rose,123
			 tom,123
		  3.要求完成如下功能：
	 		程序运行时：控制台提示用户输入注册的用户名和密码；
	   		验证键盘录入的用户名跟user.txt中已注册的用户名是否重复：
	   			是：控制台提示：用户名已存在
	   			否：将键盘录入的用户名及密码写入user.txt文件，并在控制台提示：注册成功； 
	   			
	   	1. 键盘录入用户名和密码并用两个String变量接受
		2. 创建输入流对象关联user.txt
		3. 创建集合对象, 用于存储读取到的数据
		4. 定义boolean类型的标记flag, 假设键盘录入的用户名不存在, 默认为false
		5. 遍历集合获取到每一个数据(数据是用户名,密码的字符串, 思路不要乱)
			a) 根据逗号切割当前字符串, 获取字符串数组中0索引的用户名
			b) 拿着键盘录入的用户名和切割后的用户名逐个对比, 相同的话将flag改为true
		6. 判断flag
			a) true : 提示已经存在
			b) false: 创建输出流对象关联user.txt, 并将键盘录入的用户名和密码拼接上逗号写出. (注意尾部追加)


	 */
	public static void main(String[] args) throws IOException {
		// 1. 键盘录入用户名和密码并用两个String变量接受
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名:");
		String userName = sc.nextLine();
		System.out.println("请输入密码:");
		String passWord = sc.nextLine();
		// 2. 创建输入流对象关联user.txt
		BufferedReader br = new BufferedReader(new FileReader("user.txt"));
		// 3. 创建集合对象, 用于存储读取到的数据
		ArrayList<String> list = new ArrayList<>();
		
		String line;
		while((line = br.readLine()) != null){
			list.add(line);
		}
		br.close();
		
		// 4. 定义boolean类型的标记flag, 假设键盘录入的用户名不存在, 默认为false
		boolean flag = false;
		
		// 5. 遍历集合获取到每一个数据(数据是用户名,密码的字符串, 思路不要乱)
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			// a) 根据逗号切割当前字符串, 获取字符串数组中0索引的用户名
			String[] split = s.split(",");
			// 拿着键盘录入的用户名和切割后的用户名逐个对比, 相同的话将flag改为true
			if(userName.equals(split[0])){
				flag = true;
			}
		}
		
		// 6. 判断flag
		if(flag){
			// a) true : 提示已经存在
			System.out.println("用户名已存在");
		}else{
			// b) false: 创建输出流对象关联user.txt, 并将键盘录入的用户名和密码拼接上逗号写出. 
			BufferedWriter bw = new BufferedWriter(new FileWriter("user.txt",true));
			String result = userName + "," + passWord;
			bw.write(result); 
			bw.newLine();
			bw.close();
			System.out.println("注册成功");
		}
	}
}

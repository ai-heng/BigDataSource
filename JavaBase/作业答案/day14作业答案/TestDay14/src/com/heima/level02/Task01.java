package com.heima.level02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task01 {
	 /**
	  * 一、 分析以下需求，并用代码实现： 
			  实现一个验证码小程序，要求如下：
			   1. 在项目根目录下新建一个文件：data.txt,键盘录入3个字符串验证码，并存入data.txt中，要求一个验证码占一行；
			   2. 键盘录入一个需要被校验的验证码，如果输入的验证码在data.txt中存在：在控制台提示验证成功，如果不存在控制台提示验证失败
			 
			  分析:
			   1. 键盘录入三个验证码用字符串接收
			   2. 创建输出流对象关联data.txt
			   3. 将三个验证码写入data.txt当中, 关闭输出流
			   4. 键盘录入一个需要校验的验证码并用字符串接收
			   5. 创建输入流对象关联data.txt
			   6. 创建集合对象
			   7. 读取data.txt 将读取到的数据存储到集合中
			   8. 使用集合调用contains方法, 将需要校验的字符串传入
			   9. 根据返回的结果, 打印是否存在
	
	  */
	public static void main(String[] args) throws IOException{
		// 1. 键盘录入三个验证码用字符串接收
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入验证码:");
		String line1 = sc.nextLine();
		System.out.println("请输入验证码:");
		String line2 = sc.nextLine();
		System.out.println("请输入验证码:");
		String line3 = sc.nextLine();
		// 2. 创建输出流对象关联data.txt
		BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));
		// 3. 将三个验证码写入data.txt当中, 关闭输出流
		bw.write(line1);
		bw.newLine();
		bw.write(line2);
		bw.newLine();
		bw.write(line3);
		bw.newLine();
		bw.close();
		
		// 4. 键盘录入一个需要校验的验证码并用字符串接收
		System.out.println("请输入需要校验的验证码");
		String num = sc.nextLine();
		
		// 5. 创建输入流对象关联data.txt
		BufferedReader br = new BufferedReader(new FileReader("data.txt"));
		
		// 6. 创建集合对象
		ArrayList<String> list = new ArrayList<>();
		
		// 7. 读取data.txt 将读取到的数据存储到集合中
		String line;
		while ((line = br.readLine()) != null) {
			list.add(line);
		}
		
		br.close();
		
		// 8. 使用集合调用contains方法, 将需要校验的字符串传入
		boolean b = list.contains(num);			// 是判断集合中是否包含传入的元素
		
		// 9. 根据返回的结果, 打印是否存在
		if (b) {
			System.out.println("验证成功");
		} else {
			System.out.println("验证失败");
		}
	}
}

package com.heima.level02;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) throws IOException {
		
		// 1. 键盘录入要查找的字符
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您要查找的字符");
		String line = sc.nextLine();
		
		// 2. 创建输入流对象关联info3.txt
		FileInputStream fis = new FileInputStream("info3.txt");
		
		// 3. 创建StringBuilder用于存储读取到的所有字符
		StringBuilder sb = new StringBuilder();
		
		int b;
		
		while((b = fis.read()) != -1){
			char c = (char) b;
			// 4. 将读取到的字符添加到StringBuilder当中
			sb.append(c);
		}
		
		// 5. 调用indexOf方法判断键盘录入的字符是否存在, 如果返回-1说明不存在
		if(sb.indexOf(line) == -1){
			System.out.println("抱歉没有找到");
		} else {
			// 6. 如果存在的话, 将StringBuilder拆分成字符数组
			int count = 0;
			char[] cArr = sb.toString().toCharArray();
			// 7. 遍历字符数组, 获取到每一个字符
			for (char c : cArr) {
				// 8. 跟键盘录入的字符逐个进行匹配 (不要忘了将字符转换为字符串)
				if(line.equals(c + "")){
					count++;
				}
			}
			// 9. 打印出现的次数
			System.out.println(count);
		}
	}
}

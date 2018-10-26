package com.itheima.level02_04;

import java.util.Scanner;

/*
 * 	需求说明：创建三个图书类对象，找出价格最高的图书并打印该图书的所有信息。
		设计“图书类”Book，要求有以下属性：
		图书编号：
		书名：
		价格：
 */
public class Task04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入第一本书的信息：");
		System.out.println("图书编号：");
		String bookNo = sc.nextLine();
		System.out.println("书名：");
		String title = sc.nextLine();
		System.out.println("ISBN码：");
		String isbn = sc.nextLine();
		System.out.println("价格：");
		double price = sc.nextDouble();
		System.out.println("出版日期：");
		String publicationDate = sc.nextLine();
		
		Book b1 = new Book(bookNo,title,isbn,price,publicationDate);
		System.out.println("**********************************");
		System.out.println("请输入第二本书的信息：");
		System.out.println("图书编号：");
		bookNo = sc.nextLine();
		System.out.println("书名：");
		title = sc.nextLine();
		System.out.println("ISBN码：");
		isbn = sc.nextLine();
		System.out.println("价格：");
		price = sc.nextDouble();
		System.out.println("出版日期：");
		publicationDate = sc.nextLine();
		
		Book b2 = new Book(bookNo,title,isbn,price,publicationDate);
		System.out.println("**********************************");
		
		System.out.println("请输入第三本书的信息：");
		System.out.println("图书编号：");
		bookNo = sc.nextLine();
		System.out.println("书名：");
		title = sc.nextLine();
		System.out.println("ISBN码：");
		isbn = sc.nextLine();
		System.out.println("价格：");
		price = sc.nextDouble();
		System.out.println("出版日期：");
		publicationDate = sc.nextLine();
		
		Book b3 = new Book(bookNo,title,isbn,price,publicationDate);
		System.out.println("**********************************");
		
		
		Book b = b1;//先存储第一本书的引用；
		
		//判断b的价格是否大于b2的价格（实际上就是判断第一本书的价格和第二本书的价格）
		if(b2.getPrice() > b.getPrice()){
			b = b2;
		}
		
		//判断b的价格是否大于b3的价格
		if(b3.getPrice() > b.getPrice()){
			b = b3;
		}
		
		System.out.println("最贵的书是：" + b.getBookNo() + "," + 
							b.getTitle() + "," + b.getIsbn() + "," + 
							b.getPrice() + "," + b.getPublicationDate());
		
	}
}

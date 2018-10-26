package com.itheima.test07_生命周期;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入你最喜欢吃的水果:");
        String line = sc.nextLine();
        System.out.println("哈哈, 这么巧啊, 我也喜欢吃: " + line);
    }
}

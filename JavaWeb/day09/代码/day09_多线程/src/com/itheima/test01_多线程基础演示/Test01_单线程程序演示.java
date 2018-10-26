package com.itheima.test01_多线程基础演示;

public class Test01_单线程程序演示 {
    public static void main(String[] args) {
        for (int i = 0; i < 200; i++) {
            System.out.println("run..........." + i);
        }

        for (int i = 0; i < 200; i++) {
            System.out.println("main..." + i);
        }
    }
}

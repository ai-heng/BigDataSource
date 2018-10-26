package com.itheima.test03_实现Runnable接口;

public class Test01 {
    public static void main(String[] args) {
        //4. 创建Runnable接口的子类对象, 将其作为参数传入Thread类的构造方法, 创建线程对象.
        //4.1 创建Runnable接口的子类对象,
        MyRunnable mr = new MyRunnable();

        //4.2 将其作为参数传入Thread类的构造方法, 创建线程对象.
        Thread th = new Thread(mr);

        //5. 开启线程.
        th.start();

        for (int i = 0; i < 200; i++) {
            System.out.println("main..." + i);
        }
    }
}

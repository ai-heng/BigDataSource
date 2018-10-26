package com.itheima.test04_模拟卖票_继承Thread类版;

/**
 * 测试类
 */
public class Test01 {
    public static void main(String[] args) {
        //创建线程
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();
        MyThread mt3 = new MyThread();
        MyThread mt4 = new MyThread();

        //开启线程
        mt1.start();
        mt2.start();
        mt3.start();
        mt4.start();
    }
}

package com.itheima.test02_继承Thread类;

/**
 * 测试类
 */
public class Test01 {
    public static void main(String[] args) {
        //4. 创建线程对象.
        MyThread mt = new MyThread();

        //5. 开启线程.
        mt.start();
        mt.start();

        //mt.run();

        for (int i = 0; i < 200; i++) {
            System.out.println("main..." + i);
        }

        /*
            细节:
                1. 关于先写线程还是先写for的问题.
                2. 开启线程,可不可以通过: 直接调用run()方法实现.
                    不可以, 因为直接调用run()方法, 只是普通的方法调用而已.
                3. 同一线程, 能不能重复开启.
                    不能, 会报: 非法的线程状态异常(IllegalThreadStateException)
         */
    }
}

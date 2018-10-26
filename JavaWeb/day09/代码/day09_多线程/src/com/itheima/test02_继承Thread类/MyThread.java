package com.itheima.test02_继承Thread类;

//1. 定义一个类(MyThread), 继承Thread类.
public class MyThread extends Thread{

    //2.  重写Thread#run().
    @Override
    public void run() {
        //3. 把要执行的代码放入到run()中.
        for (int i = 0; i < 200; i++) {
            System.out.println("run..........." + i);
        }
    }
}

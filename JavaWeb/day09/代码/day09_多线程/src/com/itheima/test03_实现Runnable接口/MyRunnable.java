package com.itheima.test03_实现Runnable接口;

//1. 定义一个类(MyRunnable), 实现Runnable接口
public class MyRunnable implements  Runnable {

    //2. 重写MyRunnable#run().
    @Override
    public void run() {
        //3. 把要执行的代码放入到run()中.
        for (int i = 0; i < 200; i++) {
            System.out.println("run..........." + i);
        }
    }
}

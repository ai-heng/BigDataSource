package com.itheima.test06_模拟卖票_实现Runnable接口;

public class Test01 {
    public static void main(String[] args) {
        //创建线程
        MyRunnable mr =  new MyRunnable();
        //细节四, 这里可以直接写线程名
        Thread th1 = new Thread(mr,"窗口1");
        Thread th2 = new Thread(mr,"窗口2");
        Thread th3 = new Thread(mr,"窗口3");
        Thread th4 = new Thread(mr,"窗口4");

        //开启线程
        th1.start();
        th2.start();
        th3.start();
        th4.start();
    }
}

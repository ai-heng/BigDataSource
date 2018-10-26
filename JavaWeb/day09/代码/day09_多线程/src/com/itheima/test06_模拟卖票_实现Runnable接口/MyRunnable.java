package com.itheima.test06_模拟卖票_实现Runnable接口;

public class MyRunnable implements Runnable {
    //1. 定义变量, 记录票数.
    private int tickets = 100;       //细节1: static可以省略

    @Override
    public void run() {
        //2. 正常的卖票逻辑.
        while(true) {
            synchronized (this) {   //细节二: 锁对象可以写this
                if (tickets < 1)
                    break;
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //细节三: 线程名字的获取方式.
                System.out.println(Thread.currentThread().getName() +  "正在出售第 " + tickets-- + " 张票");
            }
        }
    }
}

package com.itheima.test05_模拟卖票_问题解决;

//演示: 卖票案例, 通过 继承Tread类的方式.
//需求: 100张票, 分四个窗口卖.
public class MyThread extends Thread{
    //1. 定义变量, 记录票数.
    private static int tickets = 100;
    //2. 正常的卖票逻辑.
    @Override
    public void run() {
        //2.1 因为不知道什么时候卖完, 用while(true).
        while(true) {
            //1. 可以是任意类型的锁对象. 2. 必须是同一把锁, 不然可能锁不住.
            synchronized (MyThread.class) {
                //2.2 做一下越界处理.
                if (tickets < 1)
                    break;
                //2.4 为了让非法值出现的概率增大, 加入: 休眠线程.
                try {
                    //特点: 在哪睡, 在哪醒.
                    Thread.sleep(50);       //线程1 线程2  线程3 线程4
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //2.3 正常的卖票逻辑.
                System.out.println(this.getName() + "正在出售第 " + tickets-- + " 张票");
            }
        }
    }
}

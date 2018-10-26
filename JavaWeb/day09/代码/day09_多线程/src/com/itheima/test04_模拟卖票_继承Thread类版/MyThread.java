package com.itheima.test04_模拟卖票_继承Thread类版;

//演示: 卖票案例, 通过 继承Tread类的方式.
//需求: 100张票, 分四个窗口卖.

public class MyThread extends Thread{
    //1. 定义变量, 记录票数.
    private static int tickets = 51;


    //2. 正常的卖票逻辑.
    @Override
    public void run() {
        //2.1 因为不知道什么时候卖完, 用while(true).
        while(true) {
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
            System.out.println("正在出售第 " + tickets-- + " 张票");
        }

        /*
            出现问题的原因:
                负数票:  关键点: if() , Thread.sleep(50);
                    当4个线程都越过了 if()校验的的时候, 不管谁先醒, 此时打印的就有可能是: 负数.
                    例如:
                        假设线程1醒来, 打印: 卖 1 号票,  之后把 tickets的值改为: 0
                        假设线程2醒来, 打印: 卖 0 号票,  之后把 tickets的值改为: -1
                        假设线程1醒来, 打印: 卖 -1 号票,  之后把 tickets的值改为: -2
                        假设线程1醒来, 打印: 卖 -2 号票,  之后把 tickets的值改为: -3

                重复值: 关键点:tickets--
                    tickets--  相当于: tickets = tickets - 1;
                    上述的代码做了3件事:
                        1. 读值.
                        2. 改值.
                        3. 赋值.
                    当一个线程还没有来得及执行3之前, 被别的线程抢走资源了, 就有可能发生: 重复值.
         */
    }
}

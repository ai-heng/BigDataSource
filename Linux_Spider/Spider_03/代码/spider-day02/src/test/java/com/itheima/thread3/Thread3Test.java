package com.itheima.thread3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Thread3Test {
    public static void main(String[] args) throws ExecutionException {
        //Callable的返回值就要使用Future对象，Callable负责计算结果，Future负责拿到结果
        //1、实现Callable接口
        Callable<Integer> callable = new Callable<Integer>() {
            public Integer call() throws Exception {
                // 线程执行的内容
                int i=333;
                //do something
                // eg request http server and process
                return i;
            }
        };
        //2、使用FutureTask启动线程
        FutureTask<Integer> future = new FutureTask<Integer>(callable);
        new Thread(future).start();//启动线程
        //3、获取线程的结果
        try {
           // Thread.sleep(5000);// 可能做一些事情
            System.out.println(future.get());//获取线程的结果
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

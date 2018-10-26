package com.itheima.装饰设计模式;

public class BaseStudent implements Coder{
    @Override
    public void code() {
        System.out.println("Java基础语法, 面向对象");
        System.out.println("常用API, 集合");
        System.out.println("IO流");
        System.out.println("多线程,网编");
    }

    public void somking() {
        System.out.println("抽烟有害健康");
    }
}

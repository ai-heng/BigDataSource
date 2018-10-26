package com.itheima.装饰设计模式;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
    测试类
 */
public class Test {
    public static void main(String[] args) throws Exception {
        //测试普通学生的功能
        BaseStudent bs = new BaseStudent();
        bs.code();
        bs.somking();

        /*
            基础学生只会普通的Java基础, 找工作比较困难, 于是想提高自身的能力, 涉及到的问题其实就是:
                如何升级BaseStudent#code();方法的功能.

                方式一: 继承.
                    能实现, 但是扩展性太差, 因为耦合性增强了, 子类想没有父类的某些功能, 都不行.
         */

        System.out.println("*******************************");

        SuperStudent ss = new SuperStudent();
        ss.code();
        ss.somking();

        System.out.println("*******************************");
        /*
            此时, 我们发现一个新问题, 虽然我们成功的升级了BaseStudent#code()方法, 但是类与类之间的"耦合性"增强了,
            于是我们就想着, 能不能只升级: BaseStudent#code()方法的功能, 但是不影响: 框架(继承体系)呢?
                这就需要用到: 装饰设计模式.

                思路(步骤):
                    1. 在装饰类中, 获取被装饰的类的应用.
                    2. 将其作为参数, 传给装饰类的构造方法.
                    3. 对其指定的功能, 进行升级.

         */

        HeimaStudent hs = new HeimaStudent(bs);
        hs.code();

        //IO流
        //装饰类                                    被装饰类
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        br.close();

    }
}

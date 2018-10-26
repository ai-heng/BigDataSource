package com.itheima.装饰设计模式;

public class SuperStudent extends BaseStudent{
    @Override
    public void code() {
        super.code();   //原有的功能.
        System.out.println("JavaWeb核心基础, 三大框架");
        System.out.println("搜索引擎, 爬虫, 品优购项目");
        System.out.println("大数据部分,核心三大框架: Hadroop, spark, storm");
        System.out.println("就业指导课");
    }
}

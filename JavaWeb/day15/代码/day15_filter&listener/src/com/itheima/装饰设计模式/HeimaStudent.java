package com.itheima.装饰设计模式;

//           装饰类
public class HeimaStudent implements Coder{
    //1. 在装饰类中, 获取被装饰的类的应用.
    private BaseStudent bs;

    //2. 将其作为参数, 传给装饰类的构造方法.

    public HeimaStudent(BaseStudent bs) {  // = new BaseStudent("张三",23);
        this.bs = bs;
    }

    //3. 对其指定的功能, 进行升级.
    @Override
    public void code() {
        bs.code();      //学生目前自己所拥有的能力.
        System.out.println("JavaWeb核心基础, 三大框架");
        System.out.println("搜索引擎, 爬虫, 品优购项目");
        System.out.println("大数据部分,核心三大框架: Hadroop, spark, storm");
        System.out.println("就业指导课");
    }
}

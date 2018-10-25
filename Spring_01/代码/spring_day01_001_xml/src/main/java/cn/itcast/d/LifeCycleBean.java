package cn.itcast.d;

public class LifeCycleBean {
    public LifeCycleBean() {
        //System.out.println("1. 调用LifeCycleBean的构造方法 ... ...");
    }

    public void init() {
        //System.out.println("2. 调用LifeCycleBean的初始化方法 ... ...");

    }

    public void service() {
        System.out.println("3. 调用LifeCycleBean的提供服务的方法 ... ...");
    }

    public void destory() {
        System.out.println("4. 调用LifeCycleBean的销毁的方法 ... ...");
    }
}

package cn.itcast.c;

import org.springframework.stereotype.Component;

// <bean id="singletonBean" class="cn.itcast.c.SingletonBean"/>
@Component
public class SingletonBean {
    public SingletonBean() {
        System.out.println("1. 调用单例bean的构造方法 ... ...");
    }
}


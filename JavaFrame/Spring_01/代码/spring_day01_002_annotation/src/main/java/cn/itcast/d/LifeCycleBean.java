package cn.itcast.d;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// <bean id="lifeCycleBean" class="cn.itcast.d.LifeCycleBean"/>
@Component
public class LifeCycleBean {

    public LifeCycleBean() {
        //System.out.println("1. 调用LifeCycleBean的构造方法 ... ...2222222222222");
    }

    // 指在构造方法后执行
    @PostConstruct
    public void init() {
        //System.out.println("2. 调用LifeCycleBean的初始化方法 ... ...2222222222222");
    }

    public void service() {
        System.out.println("3. 调用LifeCycleBean的提供服务的方法 ... ...2222222222222");
    }

    // 指 销毁之前执行的方法
    @PreDestroy
    public void destory() {
        System.out.println("4. 调用LifeCycleBean的销毁的方法 ... ...2222222222222");
    }
}

package cn.itcast.c;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// <bean id="prototypeBean" class="cn.itcast.c.PrototypeBean"/>
@Component
@Scope("prototype")
public class PrototypeBean {
    public PrototypeBean() {
        System.out.println("2. 调用多例bean的构造方法 ... ...");
    }
}


package cn.itcast.c;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void demo01() {
        // 1 实例化spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2 获取对应的bean
        SingletonBean singletonBean01 = ac.getBean("singletonBean", SingletonBean.class);
        SingletonBean singletonBean02 = ac.getBean("singletonBean", SingletonBean.class);

        // 3 测试
        System.out.println(singletonBean01);
        System.out.println(singletonBean02);
    }

    @Test
    public void demo02() {
        // 需求: 多例 每次获取bean 都创建新的
        // 1 实例化spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2 获取对应的bean
        PrototypeBean prototypeBean01 = ac.getBean("prototypeBean", PrototypeBean.class);
        PrototypeBean prototypeBean02 = ac.getBean("prototypeBean", PrototypeBean.class);

        // 3 测试
        System.out.println(prototypeBean01);
        System.out.println(prototypeBean02);
    }

}

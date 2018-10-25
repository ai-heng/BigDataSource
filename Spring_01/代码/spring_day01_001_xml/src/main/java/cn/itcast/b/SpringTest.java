package cn.itcast.b;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void demo01() {
        // 1 实例化spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2 获取对应的bean
        Bean1 bean1 = ac.getBean("bean1", Bean1.class);
        // 3 测试
        System.out.println(bean1);
    }

    @Test
    public void demo02() {
        // 1 实例化spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2 获取对应的bean
        Bean2 bean2 = ac.getBean("bean2", Bean2.class);
        // 3 测试
        System.out.println(bean2);
    }

    @Test
    public void demo03() {
        // 1 实例化spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2 获取对应的bean
        Bean3 bean3 = ac.getBean("bean3", Bean3.class);
        // 3 测试
        System.out.println(bean3);
    }

    @Test
    public void demo04() {
        // 1 实例化spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2 获取对应的bean
        Bean3 bean3 = ac.getBean("bean3_2", Bean3.class);
        // 3 测试
        System.out.println(bean3);
    }
}

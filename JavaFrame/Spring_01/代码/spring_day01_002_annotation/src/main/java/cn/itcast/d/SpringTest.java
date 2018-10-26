package cn.itcast.d;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void demo01() {
        // 1 实例化spring容器
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2 获取对应的bean
        LifeCycleBean lifeCycleBean = ac.getBean("lifeCycleBean", LifeCycleBean.class);

        // 3 测试
        lifeCycleBean.service();
        lifeCycleBean.service();
        lifeCycleBean.service();

        // 4 当关闭spring容器时,才会执行销毁方法
        ac.close();
    }


}

package cn.itcast.e;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void demo01() {
        // 1 实例化spring容器
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2 获取对应的bean
        Car car = ac.getBean("car", Car.class);

        // 3 测试
        System.out.println(car);
    }

    @Test
    public void demo02() {
        // 1 实例化spring容器
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2 获取对应的bean
        Employee employee = ac.getBean("employee", Employee.class);

        // 3 测试
        System.out.println(employee);
    }

    @Test
    public void demo03() {
        // 1 实例化spring容器
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2 获取对应的bean
        Employee employee = ac.getBean("employee02", Employee.class);

        // 3 测试
        System.out.println(employee);
    }

    @Test
    public void demo04() {
        // 1 实例化spring容器
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2 获取对应的bean
        CollectionBean collectionBean = ac.getBean("collectionBean", CollectionBean.class);

        // 3 测试
        System.out.println(collectionBean);
    }


}

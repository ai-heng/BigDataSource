package cn.itcast.a;

import cn.itcast.b_proxy.CglibProxyFactory;
import cn.itcast.b_proxy.JDKProxyFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// 实例化spring容器
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class SpringTest {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ProductService productService;

    @Test
    public void demo01() {
        productService.add();
        productService.del();
        productService.edit();
        productService.query();

        customerService.add();
        customerService.del();
        customerService.edit();
        customerService.query();
    }

    @Test
    public void demo02() {
        // 代理套路
        // 1 目的类
        // 2 增强类
        // 3 建立目标类和增强的关系
        JDKProxyFactory jdkProxyFactory = new JDKProxyFactory(productService);
        ProductService proxyObj = (ProductService) jdkProxyFactory.getProxyObj();
        // 4 测试
        proxyObj.add();
        proxyObj.del();
        proxyObj.edit();
        proxyObj.query();
    }

    @Test
    public void demo03() {
        // 代理套路
        // 1 目的类
        // 2 增强类
        // 3 建立目标类和增强的关系
        CglibProxyFactory cglibProxyFactory = new CglibProxyFactory(customerService);
        CustomerService proxyObj = (CustomerService) cglibProxyFactory.getProxyObject();
        // 4 测试
        proxyObj.add();
        proxyObj.del();
        proxyObj.edit();
        proxyObj.query();
    }


}

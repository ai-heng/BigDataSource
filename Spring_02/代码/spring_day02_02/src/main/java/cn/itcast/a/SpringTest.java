package cn.itcast.a;

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

}

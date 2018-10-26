package cn.itcast.d;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext_service.xml")
public class SpringTest {
    // 注入财务业务类
    @Autowired
    private AccountService accountService;

    @Test
    public void demo01() {
        accountService.transfer("aaa", "bbb", 100000);
    }
}

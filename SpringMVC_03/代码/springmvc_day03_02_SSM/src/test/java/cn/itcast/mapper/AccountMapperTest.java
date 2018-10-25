package cn.itcast.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.context.ContextLoaderListener;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext_dao.xml")
public class AccountMapperTest {

    // @Autowired
    @Value("#{accountMapper}")
    private AccountMapper accountMapper;

    @Test
    public void out() throws Exception {
        accountMapper.out("aaa", 100);
        ContextLoaderListener contextLoaderListener;
    }

    @Test
    public void in() throws Exception {
        accountMapper.in("bbb", 100);
    }

}
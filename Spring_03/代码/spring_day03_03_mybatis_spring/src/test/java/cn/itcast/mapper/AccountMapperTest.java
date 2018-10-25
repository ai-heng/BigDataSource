package cn.itcast.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext_dao.xml")
public class AccountMapperTest {

    @Autowired
    private AccountMapper accountMapper;

    @Test
    public void out() throws Exception {
        accountMapper.out("aaa", 100);
    }

    @Test
    public void in() throws Exception {
        accountMapper.in("bbb", 100);
    }

}
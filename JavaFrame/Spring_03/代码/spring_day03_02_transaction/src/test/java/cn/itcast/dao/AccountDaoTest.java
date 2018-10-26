package cn.itcast.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class AccountDaoTest {

    @Autowired
    AccountDao accountDao;

    @Test
    public void out() throws Exception {
        accountDao.out("aaa", 300);
    }

    @Test
    public void in() throws Exception {
        accountDao.in("bbb", 300);
    }

}
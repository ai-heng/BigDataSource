package cn.itcast.service;

import cn.itcast.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// <bean id="accountService" class="cn.itcast.service.AccountService"/>
@Service
public class AccountService {

    @Autowired
    private AccountDao accountDao;

    // 转账业务
    public void transfer(String outAccount, String inAccount, double money) {
        // 出账
        accountDao.out(outAccount, money);

        int j = 1/0;

        // 入账
        accountDao.in(inAccount, money);
    }
}

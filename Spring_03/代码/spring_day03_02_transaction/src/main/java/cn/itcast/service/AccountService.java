package cn.itcast.service;

import cn.itcast.dao.AccountDao;
import org.springframework.transaction.annotation.Transactional;

public class AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    // 转账
    @Transactional
    public void transfer(String outAccount, String inAccount, double money) {
        // 出账
        accountDao.out(outAccount, money);

        // int j = 1/0;

        // 入账
        accountDao.in(inAccount, money);
    }
}

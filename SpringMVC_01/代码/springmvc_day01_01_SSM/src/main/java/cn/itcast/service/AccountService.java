package cn.itcast.service;

import cn.itcast.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountService {

    public AccountService() {
        System.out.println("=================================== 调用 AccountService的构造方法 ... ...");
    }

    @Autowired
    private AccountMapper accountMapper;

    // 转账
    @Transactional
    public void transfer(String outAccount, String inAccount, double money) {
        // 出账
        accountMapper.out(outAccount, money);

        //int j = 1/0;

        // 入账
        accountMapper.in(inAccount, money);
    }
}

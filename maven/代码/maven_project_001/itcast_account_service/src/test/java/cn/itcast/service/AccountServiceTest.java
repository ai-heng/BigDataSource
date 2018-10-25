package cn.itcast.service;

import org.junit.Test;

public class AccountServiceTest {
    @Test
    public void transfer() throws Exception {
        AccountService accountService = new AccountService();
        accountService.transfer("aaa", "bbb", 800);
    }

}
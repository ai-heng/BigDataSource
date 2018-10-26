package cn.itcast.dao;

import org.springframework.stereotype.Repository;

// 模拟操作数据库
// <bean id="accountDao" class="cn.itcast.dao.AccountDao"/>
@Repository
public class AccountDao {
    // 出账
    public void out(String outAccount, double money) {
        System.out.println(outAccount + "出账" + money + "元钱! ===============");
    }
    // 入账
    public void in(String inAccount, double money) {
        System.out.println(inAccount + "入账" + money + "元钱! ===============");
    }
}

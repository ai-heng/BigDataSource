package cn.itcast.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDao extends JdbcDaoSupport {
    // 出账
    public void out(String outAccount, double money) {
        String sql = "update account set money=money-? where name=?";
        Object[] paramArr = {money, outAccount};
        getJdbcTemplate().update(sql, paramArr);
    }

    // 入账
    public void in(String inAccount, double money) {
        String sql = "update account set money=money+? where name=?";
        Object[] paramArr = {money, inAccount};
        getJdbcTemplate().update(sql, paramArr);
    }
}

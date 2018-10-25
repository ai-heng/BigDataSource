package cn.itcast.dao;

import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.sql.SQLException;

public class AccountDao {
    // 出账
    public void out(Connection conn, String outAccount, double money) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(); // 控制事务不需要增加参数
        String sql = "update account set money=money-? where name=?";
        Object[] paramArr = {money, outAccount};
        queryRunner.update(conn, sql, paramArr);
    }

    // 入账
    public void in(Connection conn, String inAccount, double money) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(); // 控制事务不需要增加参数
        String sql = "update account set money=money+? where name=?";
        Object[] paramArr = {money, inAccount};
        queryRunner.update(conn, sql, paramArr);
    }
}

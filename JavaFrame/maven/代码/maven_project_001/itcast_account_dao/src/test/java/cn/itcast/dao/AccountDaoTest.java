package cn.itcast.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

public class AccountDaoTest {

    @Test
    public void zhuanzhang() throws PropertyVetoException {
        // 0 初始化连接池
        ComboPooledDataSource ds = new ComboPooledDataSource();
        ds.setDriverClass("com.mysql.jdbc.Driver");
        ds.setJdbcUrl("jdbc:mysql://localhost:3306/day20_db");
        ds.setUser("root");
        ds.setPassword("123");

        Connection conn = null;

        try {
            // 1 获得连接, 从连接池中获取
            conn = ds.getConnection();
            // 2 开启事务
            conn.setAutoCommit(false);
            // 3 执行一组sql语句, 一组sql语句当做一个整体, 使用同一个连接
            AccountDao accountDao = new AccountDao();
            // 3.1 出账
            accountDao.out(conn, "aaa", 200);
            //int j = 1/0; // 制造异常
            // 3.2 入账
            accountDao.in(conn, "bbb", 200);
            // 4.1 如果一切正常, 提交事务(生效)
            System.out.println("4.1 如果一切正常, 提交事务(生效) ..........");
            conn.commit();
        }catch (Exception e) {
            e.printStackTrace();
            // 4.2 如果出现异常, 回滚事务(撤销)
            System.out.println("4.2 如果出现异常, 回滚事务(撤销)....................");
            try {
                if(conn!=null) {
                    conn.rollback();
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        } finally {
            // 5 释放资源
            try {
                if(conn!=null) {
                    conn.close();
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
    }


}
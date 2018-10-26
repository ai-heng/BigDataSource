package cn.itcast.service;

import cn.itcast.dao.AccountDao;
import cn.itcast.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.SQLException;

public class AccountService {

    AccountDao accountDao = new AccountDao();

    // 转账
    public void transfer(String outAccount, String inAccount, double money) {
        Connection conn = null;

        try {
            // 1 获得连接, 从连接池中获取
            conn = JDBCUtils.getConnection();
            // 2 开启事务
            conn.setAutoCommit(false);
            // 3 执行一组sql语句, 一组sql语句当做一个整体, 使用同一个连接
            // 3.1 出账
            accountDao.out(conn, outAccount, money);

            // 3.2 入账
            accountDao.in(conn, inAccount, money);

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

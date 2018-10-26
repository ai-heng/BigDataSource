package com.itheima.test02_事务和批处理演示;

import com.itheima.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test01_事务演示 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stat = null;
        //模拟转账
        try {
            //2
            //3
            conn = JDBCUtils.getConnection();
            //4
            stat = conn.createStatement();
            //5
            String sql1 = "update account set money = money - 1000 where aid=1;";
            String sql2 = "update account set money = money + 1000 where aid=2;";

            //开启事务(关闭事务的自动提交功能, 相当于是开启事务)
           conn.setAutoCommit(false);

            int num1 = stat.executeUpdate(sql1);
            //System.out.println(1/0);
            int num2 = stat.executeUpdate(sql2);

            //6
            if (num1 == 1 && num2 == 1) {
                conn.commit();
                System.out.println("转账成功");
            } else {
                conn.rollback();
                System.out.println("转账失败");
            }
        } catch (Exception e) {
            try {
                conn.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            System.out.println("转账失败");
            e.printStackTrace();
        } finally {
            //7
            JDBCUtils.release(conn,stat);
        }
    }
}

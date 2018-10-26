package com.itheima.test01_昨日代码回顾;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class Test01_JDBC的核心7步 {
    public static void main(String[] args) {
        /*
            1. 导入驱动.
            2. 注册驱动.
            3. 获取连接.
            4. 获取可以执行SQL语句的对象.
            5. 执行SQL语句, 获取结果集.
            6. 操作结果集.
            7. 释放资源.
         */
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        try {
            //2
            Class.forName("com.mysql.jdbc.Driver");
            //3
            conn = DriverManager.getConnection("jdbc:mysql:///web03", "root", "123");
            //4
            stat = conn.createStatement();
            //5
            String sql = "select * from users;";
            rs = stat.executeQuery(sql);
            //6
            while(rs.next()) {  //判断结果集中是否有数据
                int uid = rs.getInt("uid");
                String username = rs.getString("username");
                String password = rs.getString("password");
                System.out.println(uid + "..." + username + "..." + password);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //7
            try {
                if (rs != null) {
                    rs.close();
                    rs = null;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (stat != null) {
                        stat.close();
                        stat = null;
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        if (conn != null) {
                            conn.close();
                            conn = null;
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }
}

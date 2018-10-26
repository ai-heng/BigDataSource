package com.itheima.test04_C3P0测试;

import com.itheima.utils.JDBCUtils;
import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test01_手动设置参数 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        try {
            //3
            //这里的连接对象是我们手动创建的, 用完就: 销毁了.
            //改为从数据库连接池中获取, 用完之后会自动归还到: 数据库连接池中.
            //conn = JDBCUtils.getConnection();
            //A: 创建数据库连接池
            ComboPooledDataSource cpds = new ComboPooledDataSource();
            //B: 设置参数
            cpds.setDriverClass("com.mysql.jdbc.Driver");
            cpds.setJdbcUrl("jdbc:mysql:///web03");
            cpds.setUser("root");
            cpds.setPassword("123");

            //C: 从数据库连接池中获取连接对象
            conn = cpds.getConnection();

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
            JDBCUtils.release(conn,stat,rs);
            /*
                conn.close();
                    如果conn是我们手动创建的, 调用close()就是"销毁",
                    如果conn是我们从数据库连接池获取的, 调用close()就是: 自动归还.
             */
        }
    }
}

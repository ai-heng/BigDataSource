package com.itheima.test03_Druid测试;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.utils.JDBCUtils;
import com.mysql.jdbc.Driver;

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
            //这里的连接对象是我们手动创建的, 用完就"销毁了",
            //改为: 从数据库连接池中获取, 用完之后会"自动归还"到数据库连接池.
            //conn = JDBCUtils.getConnection();
            //A: 创建数据库连接池
            DruidDataSource dds = new DruidDataSource();

            //B: 设置数据库连接池的参数.
            //必要参数
            dds.setDriver(new Driver());
            dds.setUrl("jdbc:mysql:///web03");
            dds.setUsername("root");
            dds.setPassword("123");
            //可选参数


            //3. 从数据库连接池中获取连接对象.
            conn = dds.getConnection();

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
                关于conn.close();的说:
                    如果conn是我们自己手动创建的, 调用close()就是销毁连接对象.
                    如果conn是我们从数据库连接池中获取的, 调用close()就是: 自动归还连接对象到数据库连接池.
             */
        }
    }
}

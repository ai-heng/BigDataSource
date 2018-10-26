package com.itheima.test04_C3P0测试;

import com.itheima.utils.C3P0Utils;
import com.itheima.utils.JDBCUtils;
import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test03_工具类测试 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        try {
            //3
            //从数据库连接池中获取连接对象
            //方式一: 获取池子 --> 获取连接对象.
           /* DataSource ds = C3P0Utils.getDataSource();
            //conn = cpds.getConnection();
            conn = ds.getConnection();*/

            //方式二: 直接从数据库连接池获取连接对象.
            conn = C3P0Utils.getConnection();

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
            C3P0Utils.release(conn,stat,rs);
            /*
                conn.close();
                    如果conn是我们手动创建的, 调用close()就是"销毁",
                    如果conn是我们从数据库连接池获取的, 调用close()就是: 自动归还.
             */
        }
    }
}

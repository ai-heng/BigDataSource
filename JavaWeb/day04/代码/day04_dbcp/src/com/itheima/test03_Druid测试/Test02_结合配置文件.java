package com.itheima.test03_Druid测试;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.itheima.utils.JDBCUtils;
import com.mysql.jdbc.Driver;

import javax.sql.DataSource;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class Test02_结合配置文件 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        try {
            //3
            //这里的连接对象是我们手动创建的, 用完就"销毁了",
            //改为: 从数据库连接池中获取, 用完之后会"自动归还"到数据库连接池.
            //conn = JDBCUtils.getConnection();
            //A: 创建数据库连接池, 关联配置文件
            Properties pp = new Properties();
            pp.load(new FileReader("day04_dbcp\\src\\config.properties"));
            //多态
            DataSource ds = DruidDataSourceFactory.createDataSource(pp);

            //B. 从数据库连接池中获取连接对象.
            conn = ds.getConnection();

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

package com.itheima.utils;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JDBCUtils {
    //1. 私有构造.
    private JDBCUtils() {
    }

    //2. 定义变量, 记录读取到的数据.
    private static String driverClass;
    private static String url;
    private static String username;
    private static String password;

    //3. 定义方法, 读取配置文件, 并将读取到的数据赋值给变量
    private static void readConfig() {
        Properties pp = new Properties();
        try {
            pp.load(new FileReader("day04_dbcp\\src\\config.properties"));
            driverClass = pp.getProperty("driverClass");
            url = pp.getProperty("url");
            username = pp.getProperty("username");
            password = pp.getProperty("password");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //4. 在静态代码块中, 注册驱动.
    static {
        //调用方法
        readConfig();
        //注册驱动
        try {
            Class.forName(driverClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //5. 定义方法, 获取连接对象.
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    //6. 释放资源.
    //查询语句
    public static void release(Connection conn, Statement stat, ResultSet rs) {
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

    //更新语句
    public static void release(Connection conn, Statement stat) {
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

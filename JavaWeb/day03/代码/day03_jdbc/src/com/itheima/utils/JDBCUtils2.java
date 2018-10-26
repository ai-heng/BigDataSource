package com.itheima.utils;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * 结合配置文件使用
 */
public class JDBCUtils2 {
    //1. 构造私有
    private JDBCUtils2(){}
    //2. 定义变量, 记录读取到的配置文件中的数据
    private static String driverClass;
    private static String url;
    private static String username;
    private static String password;

    //3. 定义方法, 读取配置文件中的信息, 然后将读取到的值赋值给: 变量.
    private static void readConfig() {
        Properties pp = new Properties();
        try {
            pp.load(new FileReader("day03_jdbc\\src\\config.properties"));

            driverClass = pp.getProperty("driverClass");
            url = pp.getProperty("url");
            username = pp.getProperty("username");
            password = pp.getProperty("password");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //4. 注册驱动.
    static {
        //**** 细节:
        readConfig();

        //注册驱动.
        try {
            Class.forName(driverClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //5. 获取连接对象.
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(url,username,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    //6. 释放资源.
    public static void release(Connection conn, Statement stat, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
                rs = null;      //GC会优先回收null对象.
                System.out.println("rs关了");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stat != null) {
                    stat.close();
                    stat = null;      //GC会优先回收null对象.
                    //System.out.println(1/0);
                    System.out.println("stat关了");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (conn != null) {
                        conn.close();
                        conn = null;      //GC会优先回收null对象.
                        System.out.println("conn关了");
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //ctrl + alt + 字母L
    public static void release(Connection conn, Statement stat) {
        try {
            if (stat != null) {
                stat.close();
                stat = null;      //GC会优先回收null对象.
                //System.out.println(1/0);
                System.out.println("stat关了");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                    conn = null;      //GC会优先回收null对象.
                    System.out.println("conn关了");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

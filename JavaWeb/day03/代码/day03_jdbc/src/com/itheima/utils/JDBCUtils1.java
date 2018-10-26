package com.itheima.utils;

import java.sql.*;
/*
    这种工具类的抽取方式, 不推荐, 因为扩展性不强.
    假如我们要操作其他的数据库, 就需要修改源代码, 和开发原则"对修改关闭, 对扩展开放"相违背,
    于是我们思考, 能不能这样做呢?
        把这些"变化的参数", 写到配置文件中, 由该类来读取配置文件即可.
        需要用到: Properties集合类.
 */
public class JDBCUtils1 {
    //1. 构造方法私有化
    //alt + insert
    private JDBCUtils1() {
    }

    //2. 注册驱动.
    static {
        //alt + enter: 给出建议
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //3. 获取连接对象.
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql:///web03", "root", "123");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    //4. 释放资源
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

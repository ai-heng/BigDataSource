package com.itheima.test02_JDBC演示;


import java.sql.*;

public class Test05_优化释放资源 {
    public static void main(String[] args) {
        /*
            JDBC核心7步:
                1. 导入驱动.
                2. 注册驱动.
                3. 获取连接对象.
                4. 根据连接对象获取可以执行SQL语句的对象.
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
            //3         快速生成局部变量: ctrl + alt + 字母V
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/web03", "root", "123");
            //4
            stat = conn.createStatement();
            //5
            String sql = "select * from users;";
            rs = stat.executeQuery(sql);
            //6
            while (rs.next()) {  //判断结果集中是否有数据
                int uid = rs.getInt("uid");
                String username = rs.getString("username");
                String password = rs.getString("password");
                System.out.println(uid + "..." + username + "..." + password);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //7
            //个人建议: 开发中只要是操作对象, 先做不为null校验.
            //Properties类, load(), store()
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

    }
}

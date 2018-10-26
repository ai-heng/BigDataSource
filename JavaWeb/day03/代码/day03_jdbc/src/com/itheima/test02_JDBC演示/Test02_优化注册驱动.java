package com.itheima.test02_JDBC演示;


import java.sql.*;

public class Test02_优化注册驱动 {
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
        try {
            //2
            //DriverManager.registerDriver(new Driver());
            Class.forName("com.mysql.jdbc.Driver");
            //3         快速生成局部变量: ctrl + alt + 字母V
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/web03", "root", "123");
            //4
            Statement stat = conn.createStatement();
            //5
            String sql = "select * from users;";
            ResultSet rs = stat.executeQuery(sql);
            //6
            while(rs.next()) {  //判断结果集中是否有数据
                int uid = rs.getInt("uid");
                String username = rs.getString("username");
                String password = rs.getString("password");
                System.out.println(uid + "..." + username + "..." + password);
            }
            //7
            rs.close();
            stat.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

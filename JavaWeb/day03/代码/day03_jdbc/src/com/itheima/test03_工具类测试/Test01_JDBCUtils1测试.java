package com.itheima.test03_工具类测试;

import com.itheima.utils.JDBCUtils1;
import com.sun.org.apache.regexp.internal.RE;

import java.sql.*;

public class Test01_JDBCUtils1测试 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;

        try {
            //2
            //3         快速生成局部变量: ctrl + alt + 字母V
            conn = JDBCUtils1.getConnection();
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
           JDBCUtils1.release(conn,stat, rs);
        }
    }
}

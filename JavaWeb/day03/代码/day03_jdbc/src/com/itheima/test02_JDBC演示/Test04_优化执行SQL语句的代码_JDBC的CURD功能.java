package com.itheima.test02_JDBC演示;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

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
public class Test04_优化执行SQL语句的代码_JDBC的CURD功能 {
    /**
     * 增
     */
    @Test
    public void method1() {
        try {
            //2
            Class.forName("com.mysql.jdbc.Driver");
            //3
            Connection conn = DriverManager.getConnection("jdbc:mysql:///web03", "root", "123");
            //4
            Statement stat = conn.createStatement();
            //5
            String sql = "INSERT INTO users VALUES(NULL,'admin05','pw555');";
            //6
            int num = stat.executeUpdate(sql);
            System.out.println(num > 0 ? "添加成功" : "添加失败");
            //7
            stat.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 改
     */
    @Test
    public void method2() {
        try {
            //2
            Class.forName("com.mysql.jdbc.Driver");
            //3
            Connection conn = DriverManager.getConnection("jdbc:mysql:///web03", "root", "123");
            //4
            Statement stat = conn.createStatement();
            //5
            String sql = "update users set password='555' where uid=5;;";
            //6
            int num = stat.executeUpdate(sql);
            System.out.println(num > 0 ? "修改成功" : "修改失败");
            //7
            stat.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 删
     */
    @Test
    public void method3() {
        try {
            //2
            Class.forName("com.mysql.jdbc.Driver");
            //3
            Connection conn = DriverManager.getConnection("jdbc:mysql:///web03", "root", "123");
            //4
            Statement stat = conn.createStatement();
            //5
            String sql = "delete from users where uid=5;;";
            //6
            int num = stat.executeUpdate(sql);
            System.out.println(num > 0 ? "删除成功" : "删除失败");
            //7
            stat.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 查
     */
    @Test
    public void method4() {
        try {
            //2
            Class.forName("com.mysql.jdbc.Driver");
            //3         快速生成局部变量: ctrl + alt + 字母V
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/web03", "root", "123");
            //4
            Statement stat = conn.createStatement();
            //5
            String sql = "select username,uid,password from users;";
            ResultSet rs = stat.executeQuery(sql);
            //6
            while(rs.next()) {  //判断结果集中是否有数据
                //根据列的编号获取数据
               /* int uid = rs.getInt(1);
                String username = rs.getString(2);
                String password = rs.getString(3);*/

                //根据列名获取数据
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

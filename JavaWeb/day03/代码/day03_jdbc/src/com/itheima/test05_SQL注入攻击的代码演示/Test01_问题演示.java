package com.itheima.test05_SQL注入攻击的代码演示;

import com.itheima.utils.JDBCUtils2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Test01_问题演示 {
    public static void main(String[] args) {
        //1. 获取用户录入的用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入您的用户名: ");
        String uname = sc.nextLine();

        System.out.println("请录入您的密码: ");
        String pw = sc.nextLine();

        //2. 判断该数据是否存在, 存在提示登录成功, 不存在提示登录失败
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;

        try {
            conn = JDBCUtils2.getConnection();
            //4
            stat = conn.createStatement();
            //5
            String sql = "select * from users where username='"+ uname +"' and password='"+pw+"' ;";
            System.out.println(sql);
            rs = stat.executeQuery(sql);
            //6
            /*if (rs.next()) {  //判断结果集中是否有数据
                System.out.println("登录成功");
            } else{
                System.out.println("登录失败");
            }*/
            System.out.println(rs.next()? "登录成功" : "用户名或者密码错误");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //7
            //个人建议: 开发中只要是操作对象, 先做不为null校验.
            //Properties类, load(), store()
            JDBCUtils2.release(conn,stat, rs);
        }

    }
}

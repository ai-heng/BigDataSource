package com.itheima.test05_SQL注入攻击的代码演示;

import com.itheima.utils.JDBCUtils2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/*
    为什么会出现SQL注入攻击问题?
        用户录入的特殊符号或者关键字, 被我们的程序识别为: SQL语句中的符号或者关键字了, 导致我们SQL语句的结构发生了变化.

        解决方案:
            我们可以对我们的SQL语句进行: 预编译, 这样我们就确定了SQL语句的格式,
            之后不管传入什么数据, 我们都是当做: 普通字符处理.

 */
public class Test02_问题解决 {
    public static void main(String[] args) {
        //1. 获取用户录入的用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入您的用户名: ");
        String uname = sc.nextLine();

        System.out.println("请录入您的密码: ");
        String pw = sc.nextLine();

        //2. 判断该数据是否存在, 存在提示登录成功, 不存在提示登录失败
        Connection conn = null;
        //Statement stat = null;        //没有预编译功能
        PreparedStatement ps = null;    //具有预编译功能
        ResultSet rs = null;

        try {
            conn = JDBCUtils2.getConnection();
            //4 ?:占位符, 不管传入什么数据, 都只会当做普通字符处理.
            String sql = "select * from users where username=? and password=? ;";
            ps = conn.prepareStatement(sql);

            //给占位符设置值.
            ps.setString(1, uname);
            ps.setString(2, pw);
            //5
            rs = ps.executeQuery();      //这里不能传入SQL语句, 因为已经预编译过了.
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
            JDBCUtils2.release(conn,ps, rs);
        }

    }
}

package com.itheima.test06_DBUtils;

import com.itheima.utils.C3P0Utils;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;

public class Test01_执行增删改语句 {
    public static void main(String[] args) {
        //需求: 往users表中添加一条数据: zhangsan, pw123

        //1. 创建可以执行SQL语句的对象.
        QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());

        //2. 执行SQL语句, 获取结果集.
        String sql = "insert into users values(?,?,?);";
        try {
            //alt + shift + 字母L
            Object[] arr = {null, "zhangsan", "pw123"};
            int num = qr.update(sql, arr);
            //3. 操作结果集.
            System.out.println(num > 0 ? "添加成功" : "添加失败");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

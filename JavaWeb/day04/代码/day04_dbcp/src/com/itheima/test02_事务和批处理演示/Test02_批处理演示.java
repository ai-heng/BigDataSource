package com.itheima.test02_事务和批处理演示;

import com.itheima.utils.JDBCUtils;

import java.sql.Array;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;

/**
 * 需求1: 把account表中aid为1的数据的: money改为30000
 * 需求2: 往account表中添加三条数据
 * 需求3: 删除users表中的uid>2的数据.
 */
public class Test02_批处理演示 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stat = null;

        /*
            记忆:
                1. 批处理只针对于更新语句有效.
                2. 批处理的底层其实调用的是: executeUpdate()方法.
         */
        try {
            //2
            //3
            conn = JDBCUtils.getConnection();
            //4
            stat = conn.createStatement();
            //5
            /**
             * 需求1: 把account表中aid为1的数据的: money改为30000
             * 需求2: 往account表中添加三条数据
             * 需求3: 删除users表中的uid>2的数据.
             */
            String sql1 = "update account set money = 30000 where aid=1;";
            String sql2 = "insert into account values(null,'赵丽颖',2000),(null,'刘亦菲',2000),(null,'王丽坤',2000);";
            String sql3 = "delete from users where uid > 2;";
            String sql4 = "select * from users;";
            //方式一: 逐条执行.
            /*int num1 = stat.executeUpdate(sql1);
            int num2 = stat.executeUpdate(sql2);
            int num3 = stat.executeUpdate(sql3);
            //6 操作结果集
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);*/

            //方式二: 通过批处理实现.
            //A: 添加批处理.     要执行的代码添加到批处理中.
            stat.addBatch(sql1);
            stat.addBatch(sql2);
            stat.addBatch(sql3);
            stat.addBatch(sql4);

            //B: 执行批处理.
            int[] arr = stat.executeBatch();
            System.out.println(Arrays.toString(arr));

            //C: 清空批处理.
            stat.clearBatch();


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //7
            JDBCUtils.release(conn,stat);
        }
    }
}

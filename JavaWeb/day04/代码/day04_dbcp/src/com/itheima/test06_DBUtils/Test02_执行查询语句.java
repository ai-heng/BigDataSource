package com.itheima.test06_DBUtils;

import com.itheima.domain.Users;
import com.itheima.utils.DruidUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.*;
import org.junit.Test;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/*
    DBUtils的用法:
        1. 获取可以执行SQL语句的对象.
        2. 执行SQL语句, 获取结果集.
        3. 操作结果集.
 */
public class Test02_执行查询语句 {
    /**
     * 需求1: 把第一行数据封装成: Object[]
     * ArrayHandler
     */
    @Test
    public void method1() {
        //1. 获取可以执行SQL语句的对象.
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        //2. 执行SQL语句, 获取结果集.
        String sql = "select * from users where uid = ?;";
        try {
            Object[] obj = qr.query(sql, new ArrayHandler(),12);
            //3. 操作结果集.
            System.out.println(Arrays.toString(obj));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 需求2: 把每一行数据都封装成Object[], 然后整体放入: List<Object[]>
     * ArrayListHandler
     */
    @Test
    public void method2() {
        //1. 获取可以执行SQL语句的对象.
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        //2. 执行SQL语句, 获取结果集.
        String sql = "select * from users;";
        try {
            List<Object[]> list = qr.query(sql, new ArrayListHandler());
            //3. 操作结果集.
            //iter: 增强for   fori: 普通for
            for (Object[] arr : list) {
                System.out.println(Arrays.toString(arr));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 需求3: 把第一行数据封装成: Map<列名,该列的值> --> Map<String,Object>
     * MapHandler
     */
    @Test
    public void method3() {
        //1. 获取可以执行SQL语句的对象.
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        //2. 执行SQL语句, 获取结果集.
        String sql = "select * from users where uid = ?;";
        try {
            Map<String, Object> map = qr.query(sql, new MapHandler(), 12);
            //3. 操作结果集.
            System.out.println(map);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 需求4: 把每一行数据都封装成Map<列名,该列的值>, 然后整体放入: List<Map<列名,该列的值>>
     * MapListHandler
     */
    @Test
    public void method4() {
        //1. 获取可以执行SQL语句的对象.
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        //2. 执行SQL语句, 获取结果集.
        String sql = "select * from users;";
        try {
            List<Map<String, Object>> list = qr.query(sql, new MapListHandler());
            //3. 操作结果集.
            //iter: 增强for   fori: 普通for
            for (Map<String, Object> map : list) {
                System.out.println(map);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 需求5: 把第一行数据封装成: JavaBean对象
     * BeanHandler
     */
    @Test
    public void method5() {
        //1. 获取可以执行SQL语句的对象.
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        //2. 执行SQL语句, 获取结果集.
        String sql = "select * from users where uid = ?;";
        try {
            //Users users = qr.query(sql, new BeanHandler<Users>(Users.class), 12);
            Users users = qr.query(sql, new BeanHandler<>(Users.class), 12);
            //3. 操作结果集.
            System.out.println(users);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 需求6: 把每一行数据都封装成JavaBean对象, 然后整体放入: List<JavaBean类>
     * BeanListHandler
     */
    @Test
    public void method6() {
        //1. 获取可以执行SQL语句的对象.
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        //2. 执行SQL语句, 获取结果集.
        String sql = "select * from users;";
        try {
            List<Users> list = qr.query(sql, new BeanListHandler<>(Users.class));
            //3. 操作结果集.
            //iter: 增强for   fori: 普通for
            for (Users users : list) {
                System.out.println(users);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * #需求7: 把指定的一列数据都封装到: List<Object>中
     * ColumnListHandler
     */
    @Test
    public void method7() {
        //1. 获取可以执行SQL语句的对象.
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        //2. 执行SQL语句, 获取结果集.
        String sql = "select * from users;";
        try {
            //里边写谁就获取哪列, 不写就默认获取第一列
            List<Object> list = qr.query(sql, new ColumnListHandler("username"));
            //3. 操作结果集.
            //iter: 增强for   fori: 普通for
            for (Object obj : list) {
                System.out.println(obj);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * #需求8: 进行单值查询.    所谓的单值: 一行一列的数据
     * ScalarHandler, 一般结合聚合函数使用.
     */
    @Test
    public void method8() {
        //1. 获取可以执行SQL语句的对象.
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        //2. 执行SQL语句, 获取结果集.
        String sql = "select count(*) from users;";
        try {
            Object obj = qr.query(sql, new ScalarHandler());
            //3. 操作结果集.
            System.out.println(obj);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 需求9: 把每一行数据都封装成Map<列名,该列的值>, 然后整体放入: Map<指定的列,Map<列名,该列的值>>
     * KeyedHandler
     *
     * 为了让大家更好的理解, 我个人给它起了一个名字: MapMapHandler
     */
    @Test
    public void method9() {
        //1. 获取可以执行SQL语句的对象.
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        //2. 执行SQL语句, 获取结果集.
        String sql = "select * from users;";
        try {
            //写哪个列名就把哪列作为键, 不写默认第一列作为键.
            Map<Object, Map<String, Object>> map = qr.query(sql, new KeyedHandler("username"));
            //3. 操作结果集.
            //iter: 增强for   fori: 普通for
            for (Object key : map.keySet()) {
                System.out.println(key + "  ...  " + map.get(key));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

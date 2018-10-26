package com.itheima.spider.jd.dao;

import com.itheima.spider.jd.pojo.Product;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import java.beans.PropertyVetoException;

public class ProductDao extends JdbcTemplate{

    public ProductDao()  {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        // 数据库的四大必要参数: driver 连接字符串  用户名 密码
        try {
            dataSource.setDriverClass("com.mysql.jdbc.Driver");
            dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/spider16?characterEncoding=UTF-8");
            dataSource.setUser("root");
            dataSource.setPassword("123456");
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }

        super.setDataSource(dataSource);
    }

    //添加商品数据的方法
    public void addProduct(Product product){
        String sql = "insert into jdspider values(?,?,?,?,?,?)";
        String[] params = {product.getPid(),product.getTitle(),product.getPrice(),product.getBrand(),product.getName(),product.getUrl()};
        update(sql,params);
    }
}

package com.itheima.dao;

import com.itheima.domain.Product;
import com.itheima.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class ProductDao {
    public List<Product> findAllProduct() {
        //1. 查询数据库, 获取数据(集合).
        QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
        String sql = "select * from product order by pid+0";
        try {
            //2. 将集合返回给: service层.
            return qr.query(sql, new BeanListHandler<>(Product.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}

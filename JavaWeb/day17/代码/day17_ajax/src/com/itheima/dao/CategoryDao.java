package com.itheima.dao;

import com.itheima.domain.Category;
import com.itheima.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class CategoryDao {

    public List<Category> findAllCategory() {
        //查询数据库, 获取结果(集合)
        QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
        String sql = "select * from category;";
        try {
            return qr.query(sql,new BeanListHandler<>(Category.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
